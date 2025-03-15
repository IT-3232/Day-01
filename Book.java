public class Book {
    private String title;
    private String author;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String getname(){
        return this.title;
    }

    public String getauthor(){
        return this.author;
    }

    public String getInfo(){
        return title + " by " + author + " ";
    }
}
