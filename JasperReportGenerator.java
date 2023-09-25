import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.*;

public class JasperReportGenerator {
    public static void generateReport(String jrxmlPath, String outputPath) throws JRException {
        JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlPath);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JREmptyDataSource());

        // Export the report to a desired format (e.g., PDF).
        JasperExportManager.exportReportToPdfFile(jasperPrint, outputPath);
    }
}
