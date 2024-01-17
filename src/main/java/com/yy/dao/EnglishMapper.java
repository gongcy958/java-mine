package com.yy.dao;

import com.yy.domain.TableProperty;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gongcy
 * @date 2023/9/22 4:54 下午
 * @Description
 */
@Repository
public interface EnglishMapper {

    List<TableProperty> selectAll(@Param("dbName") String dbName,@Param("tableName") String tableName);


//    EnExercise select();
}
