package exclass6;

public class Shabak {
    private int languageNumber;
    private int publisherNumber;
    private int editionTypeNumber;
    private int checkDigit;

    public Shabak(int languageNumber, int publisherNumber, int editionTypeNumber, int checkDigit) {
        this.languageNumber = languageNumber;
        this.publisherNumber = publisherNumber;
        this.editionTypeNumber = editionTypeNumber;
        this.checkDigit = checkDigit;
    }

    public int getLanguageNumber() {
        return languageNumber;
    }

    public void setLanguageNumber(int languageNumber) {
        this.languageNumber = languageNumber;
    }

    public int getPublisherNumber() {
        return publisherNumber;
    }

    public void setPublisherNumber(int publisherNumber) {
        this.publisherNumber = publisherNumber;
    }

    public int getEditionTypeNumber() {
        return editionTypeNumber;
    }

    public void setEditionTypeNumber(int editionTypeNumber) {
        this.editionTypeNumber = editionTypeNumber;
    }

    public int getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(int checkDigit) {
        this.checkDigit = checkDigit;
    }

    @Override
    public String toString() {
        return languageNumber + " " + publisherNumber + " " + editionTypeNumber + " " + checkDigit;
    }
}
