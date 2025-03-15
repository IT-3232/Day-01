public class EBooks extends Book{
    private String fileformat;

    public EBooks(String title,String author,String fileformat){
       super(title,author);
       this.fileformat = fileformat;
    }

    @Override
    public String getInfo(){
       return super.getInfo() + "," + fileformat + "File Format"; 
    }
}
