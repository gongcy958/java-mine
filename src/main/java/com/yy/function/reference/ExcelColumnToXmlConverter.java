package com.yy.function.reference;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;

public class ExcelColumnToXmlConverter {
    public static void main(String[] args) {
        // 指定 Excel 文件路径
        String filePath = "doc/手麻数据需求.xls";
        // 指定 sheet 名称
        String sheetName = "术前访视";
        // 指定字段名称所在的单元格名称
        String columnNameCellName = "字段名称";

        try (Workbook workbook = WorkbookFactory.create(new File(filePath))) {
            // 获取指定的 sheet
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Sheet not found: " + sheetName);
                return;
            }

            // 查找字段名称所在的单元格
            Cell columnNameCell = findCellByName(sheet, columnNameCellName);
            if (columnNameCell == null) {
                System.out.println("Column name cell not found: " + columnNameCellName);
                return;
            }

            // 获取字段名称所在的列索引
            int columnIdx = columnNameCell.getColumnIndex();

            // 获取字段值
            StringBuilder xmlBuilder = new StringBuilder();
            xmlBuilder.append("<string xmlns=\"http://hexing.org/\">\n");
            xmlBuilder.append("<REQUEST>\n");
            xmlBuilder.append("<SERVICE_CODE>XIEHE|P0001</SERVICE_CODE>\n");
            xmlBuilder.append("<ENTITY_CONTENT>\n");

            int lastRowIndex = sheet.getLastRowNum();

            for (int rowIndex = columnNameCell.getRowIndex() + 1; rowIndex <= lastRowIndex; rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) {
                    continue;
                }

                Cell cell = row.getCell(columnNameCell.getColumnIndex());
                if (cell == null) {
                    continue;
                }

                String columnName = cell.getStringCellValue(); // 获取字段名称

                Cell valueCell = row.getCell(columnNameCell.getColumnIndex() + 1); // 下一列单元格为字段值
                if (valueCell == null) {
                    continue;
                }

                String value = valueCell.getStringCellValue(); // 获取字段值

                xmlBuilder.append("<").append(columnName).append(">").append(value).append("</").append(columnName).append(">\n");
            }


            xmlBuilder.append("</ENTITY_CONTENT>\n");
            xmlBuilder.append("</REQUEST>\n");
            xmlBuilder.append("</string>");

            System.out.println(xmlBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Cell findCellByName(Sheet sheet, String cellName) {
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equals(cellName)) {
                    return cell;
                }
            }
        }
        return null;
    }
}
