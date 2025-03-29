import java.time.LocalDate;
import java.util.Map;

public class Report {
    private static int reportCounter = 1;
    private int reportID;
    private HDBManager generatedBy;
    private LocalDate generationDate;
    private Map<String, String> filters;
    private String content;

    public Report(HDBManager generatedBy, Map<String, String> filters) {
        this.reportID = reportCounter++;
        this.generatedBy = generatedBy;
        this.generationDate = LocalDate.now();
        this.filters = filters;
        this.content = generateContent();
    }

    private String generateContent() {
        StringBuilder reportContent = new StringBuilder("Report Generated on: " + generationDate + "\nFilters: ");
        for (Map.Entry<String, String> entry : filters.entrySet()) {
            reportContent.append("\n").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        return reportContent.toString();
    }

    public int getReportID() {
        return reportID;
    }

    public HDBManager getGeneratedBy() {
        return generatedBy;
    }

    public LocalDate getGenerationDate() {
        return generationDate;
    }

    public Map<String, String> getFilters() {
        return filters;
    }

    public String getContent() {
        return content;
    }

    public void printReport() {
        System.out.println(content);
    }
}