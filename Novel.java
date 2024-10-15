package BukuBio;

public class Novel extends Book {

    protected String Genre;

    public String getGenre() {
        return this.Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Novel() {
        super();
        Genre = "";
    }

    public Novel(String Judul, int Year, double Price, String Genre) {
        super(Judul, Year, Price);
        this.Genre = Genre;
    }
    public void print() {
        super.print();
        System.out.println("Genre = " + Genre);

    }

}
