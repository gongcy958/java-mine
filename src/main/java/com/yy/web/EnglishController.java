package com.yy.web;

import com.yy.EnglishService;
import com.yy.domain.EnExercise;
import com.yy.domain.TableProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gongcy
 * @date 2023/9/12 5:05 下午
 * @Description
 */
@RestController
@RequestMapping(value = "/en")
public class EnglishController {

    @Autowired
    private EnglishService englishService;

    @GetMapping(value = "/exercises")
    public List<EnExercise> submit() {
        List<EnExercise> result = englishService.getExercises();
        System.out.println("来做题了吗");
        return result;
    }

    @GetMapping(value = "/plugin")
    public List<TableProperty> plugin(@RequestParam(value = "dbName") String dbName,@RequestParam(value = "tableName") String tableName) {
        List<TableProperty> result = englishService.getSql(dbName,tableName);
        System.out.println("测试插件");
        return result;
    }
}
