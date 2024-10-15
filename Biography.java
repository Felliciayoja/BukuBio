package BukuBio;

public class Biography extends TextBook {
    protected String About;

    public String getAbout() {
        return this.About;
    }

    public void setAbout(String About) {
        this.About = About;
    }
    public Biography(){
        super();
        About = "";
    }
    public Biography (String Judul, int Year, double Price, String Subject, String About){
        super(Judul, Year, Price, Subject);
        this.About = About;
    }
    @Override
    public void print (){
        super.print();
        System.out.println("About = " + About);
    }
    
}
