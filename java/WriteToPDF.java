import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class WriteToPDF {


    public static void putInPDF() {


        try {

            Document document = new Document(PageSize.A4);

            PdfWriter.getInstance(document, new FileOutputStream("E:\\chess1.pdf"));

            document.open();


            document.add(new Paragraph("" + GetExcel2.excelDataTop.get(0).getLine1()));
            document.add(new Paragraph("" + GetExcel2.excelDataTop.get(0).getLine2()));
            document.add(new Paragraph("" + GetExcel2.excelDataTop.get(0).getLine3()));
            document.add(new Paragraph("" + GetExcel2.excelDataTop.get(0).getLine4()));
            document.add(new Paragraph("    "));


            PdfPTable table = new PdfPTable(new float[]{3f, 18f, 3f, 3f, 2f, 10f});

            for (int i = 0; i < GetExcel2.excelData.size(); i++) {

                table.addCell(GetExcel2.excelData.get(i).getNo());
                table.addCell(GetExcel2.excelData.get(i).getName());
                table.addCell(GetExcel2.excelData.get(i).getId());
                table.addCell(GetExcel2.excelData.get(i).getFed());
                table.addCell(GetExcel2.excelData.get(i).getRtg());
                table.addCell(GetExcel2.excelData.get(i).getClub());

            }

            document.add(table);
            document.close();


        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
