package com.teknowmics.test.common;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gokul
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONArray;
import org.json.JSONObject;

public class XLParser {

    public static final String SAMPLE_XLSX_FILE_PATH = "/home/gokul/Desktop/Sample_Checklist.xlsx";
    public static int SKIP_ROW_COUNT = 11;
    public static int SKIP_COLUMN_COUNT = 5;

    public static void main(String[] args) throws IOException, InvalidFormatException {

        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        /*Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }
         */
        parseTemplate(workbook);
        System.exit(0);
        Sheet sheet = workbook.getSheetAt(0);
        // Create a DataFormatter to format and get each cell's value as String
        //DataFormatter dataFormatter = new DataFormatter();
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        JSONArray array = new JSONArray();
        List<Row> rows = new ArrayList<>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            rows.add(row);
            while (cellIterator.hasNext() && row.getRowNum() > SKIP_ROW_COUNT) {

                Cell cell = cellIterator.next();
                //String cellValue = dataFormatter.formatCellValue(cell);
                //System.out.print(cellValue + "\t");
                if (cell.getColumnIndex() < SKIP_COLUMN_COUNT) {
                    JSONObject obj = new JSONObject();
                    obj.put("[" + String.valueOf(cell.getRowIndex()) + "," + cell.getColumnIndex() + "]", cell);
                    System.out.println("(" + cell.getColumnIndex() + ")");
                    printCellValue(cell);
                    System.out.print("\t");
                    array.put(obj);
                }
            }
            System.out.println("\r\n\r\n");
        }
        boolean printRules = true;
        if (printRules) {
            printRules(rows);
        }
        // Closing the workbook
        workbook.close();
        System.out.println("\n-------------------JSON----------------------");
        System.out.println(array.toString());
    }

    private static void printCellValue(Cell cell) {
        switch (cell.getCellTypeEnum()) {
            case BOOLEAN:
                System.out.print(cell.getBooleanCellValue());
                break;
            case STRING:
                System.out.print(cell.getRichStringCellValue().getString());
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    System.out.print(cell.getDateCellValue());
                } else {
                    System.out.print(cell.getNumericCellValue());
                }
                break;
            case FORMULA:
                System.out.print(cell.getCellFormula());
                break;
            case BLANK:
                System.out.print("");
                break;
            default:
                System.out.print("");
        }

        System.out.print("\t");
    }

    private static void printRules(List<Row> rows) {

        int formulaCellNum = 11;
        for (Row row : rows) {
            Cell cell = row.getCell(formulaCellNum);
            if (cell != null) {
                System.out.print("\n");
                printCellValue(cell);
            }
        }

    }

    private static void parseTemplate(Workbook workbook) {
        Sheet sheet = workbook.getSheetAt(0);
        Sheet fieldSheet = workbook.getSheetAt(1);

        Map<String, String> fieldTypemap = new LinkedHashMap<>();
        generateFieldTypeMap(fieldSheet, fieldTypemap);

        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        JSONArray array = new JSONArray();
        List<Row> rows = new ArrayList<>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            rows.add(row);
        }
        for (Row row : rows) {
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.println("\n(" + row.getRowNum() + "," + cell.getColumnIndex() + ")");
                printCellValue(cell);
            }

        }

        System.out.println("-------------------------------FIELD_TYPES--------------------------\n");
        System.out.println(fieldTypemap.toString());
    }

    private static void generateFieldTypeMap(Sheet fieldSheet, Map<String, String> fieldTypemap) {
        Iterator<Row> rowIterator = fieldSheet.rowIterator();

        List<Row> rows = new ArrayList<>();
        Map<String, Set<Cell>> rowCellMap = new HashMap<>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            rows.add(row);
        }

        for (Row row : rows) {
            Iterator<Cell> cellIterator = row.cellIterator();
            Set<Cell> cellSet = new LinkedHashSet<>();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (!cell.getCellTypeEnum().toString().equals("BLANK") && cell.getColumnIndex() > 1) {
                    cellSet.add(cell);
                }
                cell.getStringCellValue();
            }
            rowCellMap.put(row.getCell(0).getStringCellValue(), cellSet);
            fieldTypemap.put(row.getCell(0).getStringCellValue(), cellSet.toString());

        }

//        for (Row row : rows) {
//            Iterator<Cell> cellIterator = row.cellIterator();
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//                int count = 0;
//                if (cell.getColumnIndex() == 0) {
//                    Iterator<Cell> rCellIterator = cellIterator;
//                    while (rCellIterator.hasNext()) {
//                        Cell subCell = rCellIterator.next();
//                        if (!subCell.getCellTypeEnum().toString().equals("BLANK")) {
//                            count += 1;
//                        }
//                    }
//
//                    if (count <= 1) {
//                        fieldTypemap.put(cell.getStringCellValue(), "TEXT_FIELD");
//                    } else {
//                        fieldTypemap.put(cell.getStringCellValue(), "DROP_DOWN");
//                    }
//
//                }
//            }
//        }
    }
}
