package BukuBio;

public class TextBook extends Book {

    protected String Subject;

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public TextBook() {
        super();
        Subject = "";
    }

    public TextBook(String Judul, int Year, double Price, String Subject) {
        super(Judul, Year, Price);
        this.Subject = Subject;
    }

    public void print() {
        super.print();
        System.out.println("Subject = " + Subject);

    }

}
