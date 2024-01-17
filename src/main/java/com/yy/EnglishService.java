package com.yy;

import com.yy.dao.EnglishMapper;
import com.yy.domain.EnExercise;
import com.yy.domain.TableProperty;
import org.apache.poi.xwpf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/9/12 5:22 下午
 * @Description
 */
@Service
public class EnglishService {

    @Autowired
    private EnglishMapper englishMapper;


    public List<EnExercise> getExercises() {
//        List<EnExercise> mockData = mockData();
//        return mockData;

//        EnExercise exercise = englishMapper.select();
        List<EnExercise> list = new ArrayList<>();
//        list.add(exercise);
        return list;
    }

    private List<EnExercise> mockData() {

        EnExercise exercise = new EnExercise(1,1,"book","books","");
        EnExercise exercise2 = new EnExercise(2,1,"desk","desks","");
        EnExercise exercise3 = new EnExercise(3,2,"bright","brighter","");

        List<EnExercise> result = new ArrayList<>();
        result.add(exercise);
        result.add(exercise2);
        result.add(exercise3);
        return result;
    }

    public List<TableProperty> getSql(String dbName, String tableName) {
        List<TableProperty> tableProperties = englishMapper.selectAll(dbName,tableName);
        String outputPath = "/Users/mine/Documents/" + tableName + ".docx";

        exportToWord(tableProperties,outputPath);
        return tableProperties;
    }

    public void exportToWord(List<TableProperty> tableProperties, String outputPath) {
        try (XWPFDocument document = new XWPFDocument(); FileOutputStream out = new FileOutputStream(outputPath)) {

            XWPFParagraph titleParagraph = document.createParagraph();
            XWPFRun titleRun = titleParagraph.createRun();
            titleRun.setText("Table Properties");
            titleRun.setFontSize(11);
            titleRun.setBold(true);

            XWPFTable table = document.createTable();

            // Create header row
            XWPFTableRow headerRow = table.getRow(0);
            headerRow.getCell(0).setText("字段名称");
            headerRow.addNewTableCell().setText("字段类型");
            headerRow.addNewTableCell().setText("是否为空");
            headerRow.addNewTableCell().setText("是否主键");
            headerRow.addNewTableCell().setText("描述");

            // Populate table with data
            for (TableProperty property : tableProperties) {
                XWPFTableRow row = table.createRow();
                row.getCell(0).setText(property.getColumnName());
                row.getCell(1).setText(property.getColumnType());
                row.getCell(2).setText(property.getIsNullable());
                row.getCell(3).setText(property.getIsPrimaryKey());
                row.getCell(4).setText(property.getComment());
            }

            for (int row = 0; row < table.getRows().size(); row++) {
                for (int col = 0; col < table.getRow(row).getTableCells().size(); col++) {
                    table.getRow(row).getCell(col).setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
                }
            }

            // Save to file
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
