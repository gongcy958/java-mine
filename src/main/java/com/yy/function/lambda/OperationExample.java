package com.yy.function.lambda;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author gongcy
 * @date 2023/6/27 9:20 下午
 * @Description
 */
public class OperationExample {



    private List<List<String>> splitListIntoSegments(List<String> patientIdList) {

        return IntStream.range(0, patientIdList.size())
                .boxed()
                .collect(Collectors.groupingBy(index -> index / 100))
                .values()
                .stream()
                .map(indices -> indices.stream().map(patientIdList::get).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private void processSegmentedOperations(List<IcuPatientData> patients, String startDate, String endDate, List<String> result) {

        List<String> patientIdList = patients.stream()
                .map(IcuPatientData::getPatientId).distinct()
                .collect(Collectors.toList());

        if (isNeedSegmented(patientIdList)) {
            List<List<String>> patientIdChunks = splitListIntoSegments(patientIdList);
            ExecutorService executorService = createThreadPool();

            try {

                CompletableFuture<Void> future = CompletableFuture.allOf(patientIdChunks.stream()
                        .map(chunk -> CompletableFuture.runAsync(() -> processOperation(chunk, startDate, endDate, result), executorService)
                                .exceptionally(ex -> {
//                                    logger.error("process segmented operation error, message : {} ", ex.getMessage());
                                    return null;
                                }))
                        .toArray(CompletableFuture[]::new));
                future.join();

            }finally {
                executorService.shutdown();
            }
        }else {
            processOperation(patientIdList,startDate,endDate,result);
        }
    }

    private boolean isNeedSegmented(List<String> patientIdList) {
        return patientIdList.size() > getSegmentSize();
    }

    private Integer getSegmentSize() {
//        String querySegmentSize = DbConfigManager.getIcuConfigValue(Constants.IcuConfigEnum.QUERY_SEGMENT_SIZE.value);
//        return Integer.parseInt(StringUtils.isNotBlank(querySegmentSize) ? querySegmentSize : "100");

        return 100;
    }

    private ExecutorService createThreadPool() {

        int cores = Runtime.getRuntime().availableProcessors();
        int poolSize = Math.max(cores * 2,10);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, poolSize,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1000));

        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        return executor;
    }

    private void processOperation(List<String> patientIdList,String startDate,String endDate, List<String> result) {

//        logger.info("执行线程 : {} ",Thread.currentThread().getName());
//        long start = System.currentTimeMillis();
//        List<String> operationPatients = dashboardMapper.selectIcuOperation(patientIdList,startDate,endDate);
//        System.out.println("线程 " + Thread.currentThread().getName() + "执行时间 " + (System.currentTimeMillis() - start) + "ms " + "查询size "  + operationPatients.size());
//        result.addAll(operationPatients);

    }
}
