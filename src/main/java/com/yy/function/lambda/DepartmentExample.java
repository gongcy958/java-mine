package com.yy.function.lambda;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author gongcy
 * @date 2023/6/27 1:53 下午
 * @Description
 */
public class DepartmentExample {

    public static void main(String[] args) {

        List<IcuPatientData> icuPatientList = createSampleData();
        List<Pair<String,Integer>> departmentList = new ArrayList<>();
        Map<String, Long> tempMap = icuPatientList.stream().filter(p -> !StringUtils.isEmpty(p.getInIcuDeptName())).collect(Collectors.groupingBy(IcuPatientData::getInIcuDeptName, Collectors.counting()));
        List<Map.Entry<String, Long>> allList = tempMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
        List<Map.Entry<String, Long>> topList = allList.stream().limit(5).collect(Collectors.toList());
        long sum = allList.stream().skip(5).mapToLong(Map.Entry::getValue).sum();
        topList.forEach(entry -> departmentList.add(new Pair<>(entry.getKey(),entry.getValue().intValue())));
        departmentList.add(new Pair<>("其他",(int)sum));
        System.out.println("hhh");






        // 1.过滤转入科室不为空的数，然后按照转入科室分组
        // 2.对Map进行倒序分组 并转成List 数组中存放Map
        // 3.取List中前5个元素,用一个list接收
        // 4.跳过前5个后对列表中其余元素做统计，统计每个元素中value的值求和
        // 5.对前五个元素的list遍历，封装Pair对象，添加到departmentList中
        // 6.除了前五个元素，其他元素的总和封装到一个Pair中，添加到departmentList
        // 7.返回List




//        List<Pair<String,Integer>> departmentList = new ArrayList<>();
//        Map<String,Long> tempMap = icuPatientList.stream().filter(patient -> !StringUtils.isEmpty(patient.getInIcuDeptName())).collect(Collectors.groupingBy(IcuPatientData::getInIcuDeptName,Collectors.counting()));
//        List<Map.Entry<String, Long>> allList = tempMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
//        List<Map.Entry<String, Long>> topList = allList.stream().limit(5).collect(Collectors.toList());
//        long other = allList.stream().skip(5).mapToLong(Map.Entry::getValue).sum();
//        topList.forEach(entry -> departmentList.add(new Pair<>(entry.getKey(), entry.getValue().intValue())));
//        departmentList.add(new Pair<>("其他",(int) other));

//        Map<String, List<IcuPatientData>> groupedData = groupByInIcuDeptName(icuPatientList);
//
//        for (Map.Entry<String, List<IcuPatientData>> entry : groupedData.entrySet()) {
//            String inIcuDeptName = entry.getKey();
//            List<IcuPatientData> patients = entry.getValue();
//            System.out.println("部门名称: " + inIcuDeptName);
//            System.out.println("数量: " + patients.size());
//            System.out.println("-----------");
//        }
    }

    private static Map<String, List<IcuPatientData>> groupByInIcuDeptName(List<IcuPatientData> icuPatientList) {
        Map<String, List<IcuPatientData>> groupedData = new HashMap<>();

        for (IcuPatientData patient : icuPatientList) {
            String inIcuDeptName = patient.getInIcuDeptName();
            List<IcuPatientData> patients = groupedData.getOrDefault(inIcuDeptName, new ArrayList<>());
            patients.add(patient);
            groupedData.put(inIcuDeptName, patients);
        }

        return groupedData;
    }

    private static List<IcuPatientData> createSampleData() {
        List<IcuPatientData> icuPatientList = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("消化科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 30; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("皮肤科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 20; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("骨伤科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 10; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("内科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 60; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("妇科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 5; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("呼吸科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 5; i++) {
            IcuPatientData patient = new IcuPatientData();
            patient.setInIcuDeptName("营养科");
            icuPatientList.add(patient);
        }

        for (int i = 0; i < 30; i++) {
            IcuPatientData patient = new IcuPatientData();
            icuPatientList.add(patient);
        }

        // 添加其余的数据...

        return icuPatientList;
    }
}



