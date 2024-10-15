package BukuBio;

public class Book {
    protected String Judul;
    protected int Year;
    protected double Price;
    private String diskon;

    public String getJudul() {
        return this.Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public int getYear() {
        return this.Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public double getPrice() {
        return this.Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Book() {
        Judul = "";
        Year = 0;
        Price = 0;
    }

    public Book(String Judul, int Year, double Price) {
        this.Judul = Judul;
        this.Year = Year;
        this.Price = Price;
    }

    public double discount(int a, double b) {
        int discount = 0;
        if (a <= 2020 && a >= 2011) {
            discount = 20;
        } else if (a < 2011) {
            discount = 50;
        }
        double discountPrice = b * discount / 100;
        return discountPrice;
    }

    public void print() {
        System.out.println("Judul = " + Judul);
        System.out.println("Year = " + Year);
        System.out.println("Price = " + (Price - discount(Year, Price)) + ", - Setelah diskon");

    }
}
