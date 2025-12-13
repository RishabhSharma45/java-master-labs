package prahar.oops.abstraction;

abstract class ReportGenerator{
	abstract void fetchData();

	abstract void processData();

	final void generateReport() {
		fetchData();
        processData();
        System.out.println("Report generated successfully!\n");
	}
}
class ExcelReport extends ReportGenerator {

    @Override
    void fetchData() {
        System.out.println("Fetching data for Excel report...");
    }

    @Override
    void processData() {
        System.out.println("Processing data into Excel format...");
    }
}
class PdfReport extends ReportGenerator {

    @Override
    void fetchData() {
        System.out.println("Fetching data for PDF report...");
    }

    @Override
    void processData() {
        System.out.println("Processing data into PDF format...");
    }
}


public class MainNew4 {
 public static void main(String[] args) {

     ReportGenerator excel = new ExcelReport();
     ReportGenerator pdf = new PdfReport();
     
     excel.generateReport();
     pdf.generateReport();
}
}
