package com.yy.design.structure.proxy;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongcy
 * @date 2023/2/17 2:54 下午
 * @Description 收集接口请求的原始数据，比如访问时间、处理时长
 */
@RestController
public class MetricsCollector {

    public void recordRequest(RequestInfo requestInfo) {

        // 收集接口请求的一些数据...

    }
}
