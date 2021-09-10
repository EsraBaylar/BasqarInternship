package utilies;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelData {

    public static List<List<String>> getList(String path, String sheetName, int columnCount) {
        List<List<String>> returnList = new ArrayList<>();

        Workbook workbook = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);


        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            List<String> rowList = new ArrayList<>();
            Row row = sheet.getRow(i);

            int cellCount = row.getPhysicalNumberOfCells();
            if (columnCount > cellCount)
                columnCount = cellCount;

            for (int j = 0; j < columnCount; j++) {
                rowList.add(row.getCell(j).toString());
            }
            returnList.add(rowList);
        }
        return returnList;
    }

    public static void writeExcel(String path, Scenario scenario, String browserName, String time) {

        File file = new File(path);
        String sheetName="Sheet1";

        if (!file.exists()) {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
            XSSFSheet xssfSheet = xssfWorkbook.createSheet(sheetName);

            Row row = xssfSheet.createRow(0);

            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());

            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());

            cell = row.createCell(2);
            cell.setCellValue(browserName);

            cell = row.createCell(3);
            cell.setCellValue(time);

            FileOutputStream outputStream;
            try {
                outputStream = new FileOutputStream(path);
                xssfWorkbook.write(outputStream);
                xssfWorkbook.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        else {
            Workbook workbook=null;
            FileInputStream inputStream=null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }

            assert workbook != null;
            Sheet sheet= workbook.getSheet(sheetName);

            int rowCount= sheet.getPhysicalNumberOfRows();

            Row row = sheet.createRow(rowCount);

            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());

            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());

            cell = row.createCell(2);
            cell.setCellValue(browserName);

            cell = row.createCell(3);
            cell.setCellValue(time);

            FileOutputStream outputStream;
            try {
                inputStream.close();
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
