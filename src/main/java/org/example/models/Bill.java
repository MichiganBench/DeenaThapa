package org.example.models;


public class Bill {
    private int EnglishBook;
    private int MathBook;
    private int ScienceBook;
    private int ComputerBook;
    private int GeographyBook;


    public Bill() {
        EnglishBook = 0;
        MathBook = 0;
        ScienceBook = 0;
        ComputerBook = 0;
        GeographyBook = 0;
    }

    public Bill(int Englishbook, int Mathbook, int Sciencebook, int Computerbook, int Geographybook) {
        this.EnglishBook = Englishbook;
        this.MathBook = Mathbook;
        this.ScienceBook = Sciencebook;
        this.ComputerBook = Computerbook;
        this.GeographyBook = Geographybook;
    }

    public int getEnglishBook() {
        return EnglishBook;
    }

    public void setEnglishBook(int englishBook) {
        EnglishBook = englishBook;
    }

    public int getMathBook() {
        return MathBook;
    }

    public void setMathBook(int mathBook) {
        MathBook = mathBook;
    }

    public int getScienceBook() {
        return ScienceBook;
    }

    public void setScienceBook(int scienceBook) {
        ScienceBook = scienceBook;
    }

    public int getComputerBook() {
        return ComputerBook;
    }

    public void setComputerBook(int computerBook) {
        ComputerBook = computerBook;
    }

    public int getGeographyBook() {
        return GeographyBook;
    }

    public void setGeographyBook(int geographyBook) {
        GeographyBook = geographyBook;
    }

    public void billgen(){
        int total=(EnglishBook*300)+(MathBook*100)+(ComputerBook*200)+(ScienceBook*800)+(GeographyBook*500);
        System.out.println("----------Receipt------------\n");
        System.out.println("Item\t\t Quantity\t\t Price\t\t Total\n"+
                "English Book\t\t"+EnglishBook+"\t\tRs 300\t\t"+ EnglishBook*300 +"\n"+
                "Math Book\t\t"+MathBook+"\t\tRs 300\t\t"+ MathBook*100 +"\n"+
                "Science Book\t\t"+ScienceBook+"\t\tRs 800\t\t"+ ScienceBook*800+"\n"+
                "Computer Book\t\t"+ComputerBook+"\t\tRs 200\t\t"+ ComputerBook*200+"\n"+
                "Geography Book\t\t"+GeographyBook+"\t\tRs 500\t\t"+ GeographyBook*500+"\n"+
                "Subtotal : "+ total);
    }
}