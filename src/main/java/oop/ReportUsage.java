package oop;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Reports name", "Reports body");
        System.out.println(text);
    }
}
