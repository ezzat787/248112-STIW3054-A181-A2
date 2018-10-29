public class RunningMain {
    public static void main(String[]args){


        try {
            GetExcel2.AllData();
            System.out.println("\nsuccessfully extract data from excel");
            Thread.sleep(2000);

            WriteToPDF.putInPDF();
            System.out.println("successfully convert data to PDF");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
