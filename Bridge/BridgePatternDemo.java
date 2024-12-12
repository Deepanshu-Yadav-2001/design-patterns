public class BridgePatternDemo {
    public static void main(String[] args) {
        StorageService localStorage = new LocalStorage();
        Document pdfDocument = new PDFDocument(localStorage);

        pdfDocument.save("My PDF Content");
        pdfDocument.load("My PDF Document");
        pdfDocument.delete("My PDF Document");

        StorageService cloudStorage = new CloudStorage();
        Document wordDocument = new WordDocument(cloudStorage);

        wordDocument.save("My PDF Content");
        wordDocument.load("My PDF Document");
        wordDocument.delete("My PDF Document");
    }
}