
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;


public class GetExcel2 {
    public static ArrayList<Player> excelData = new ArrayList<Player>();
    public static ArrayList<TopData> excelDataTop = new ArrayList<TopData>();

    private static final String FILE_NAME = "E:\\chessResultsList.xlsx";

    public static void AllData() {

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            XSSFSheet datatypeSheet = workbook.getSheetAt(0);

            String d1, d2, d3, d4, d5, d6, l1, l2, l3, l4;


            XSSFRow line1 = datatypeSheet.getRow(0);
            XSSFRow line2 = datatypeSheet.getRow(1);
            XSSFRow line3 = datatypeSheet.getRow(2);
            XSSFRow line4 = datatypeSheet.getRow(3);

            l1 = line1.getCell(0).getStringCellValue();
            l2 = line2.getCell(0).getStringCellValue();
            l3 = line3.getCell(0).getStringCellValue();
            l4 = line4.getCell(0).getStringCellValue();


            excelDataTop.add(new TopData(l1, l2, l3, l4));

            for (int i = 4; i < 158; i++) {

                XSSFRow row = datatypeSheet.getRow(i);

                d1 = row.getCell(0).toString();
                d2 = row.getCell(2).toString();
                d3 = row.getCell(3).toString();
                d4 = row.getCell(4).toString();
                d5 = row.getCell(5).toString();
                d6 = row.getCell(6).toString();

                excelData.add(new Player(d1, d2, d3, d4, d5, d6));

            }


            workbook.close();
            excelFile.close();

            System.out.println("" + excelDataTop.get(0).getLine1());
            System.out.println("" + excelDataTop.get(0).getLine2());
            System.out.println("" + excelDataTop.get(0).getLine3());
            System.out.println("" + excelDataTop.get(0).getLine4());

            for (int a = 0; a < excelData.size(); a++) {


                System.out.printf("%-8s", excelData.get(a).getNo());
                System.out.printf("%-40s", excelData.get(a).getName());
                System.out.printf("%-8s", excelData.get(a).getId());
                System.out.printf("%-6s", excelData.get(a).getFed());
                System.out.printf("%-6s", excelData.get(a).getRtg());
                System.out.printf("%-6s", excelData.get(a).getClub());
                System.out.println();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
