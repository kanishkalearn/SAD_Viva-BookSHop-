package Model;

import Database.DB;
import Model.Save;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrandsExcelReport {

    private static final String[] columnHeader = {"Code", "Brand Name", "Description"};

    public static void writeExcel(String sheetName, String path) {

        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet(sheetName);

            // styling cells
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 12);

            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row ( for Column Header)
            Row headerRow = sheet.createRow(0);

            for (int i = 0; i < columnHeader.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columnHeader[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // Create Other rows and cells with database data
            try {                                                   //get data from database
                ResultSet rs = DB.search("SELECT * FROM product_brand");

                int rowNum = 1;

                while (rs.next()) {
                    Row row = sheet.createRow(rowNum++);             // create a row in excel
                    row.createCell(0).setCellValue(rs.getString(1));
                    row.createCell(1).setCellValue(rs.getString(2));
                    row.createCell(2).setCellValue(rs.getString(3));
                    
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            // Resize all columnHeader to fit the content size
            for (int i = 0; i < columnHeader.length; i++) {
                sheet.autoSizeColumn(i);
            }
            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream(path);
            workbook.write(fileOut);
            fileOut.close();
            new Save().setVisible(true);
            Desktop.getDesktop().open(new File(path));

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
