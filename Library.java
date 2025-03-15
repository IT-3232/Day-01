public class Library {
    
   public static void main(String[] args){
        PrintedBook printedBook = new PrintedBook("The Lord Of The Rings", "F. Scott Fitzgerald", 218);
        EBooks ebook = new EBooks("Harry Potter", "J K Rollings",  "PDF");
        AudioBook audiobook = new AudioBook("To Kill a Mockingbird", "Harper Lee",  12.5);

        System.out.println("Printed Book: " + printedBook.getInfo());
        System.out.println("EBook: " + ebook.getInfo());
        System.out.println("Audio Book: " + audiobook.getInfo());

   }
}
/*Printed Book: The Great Gatsby by F. Scott Fitzgerald ,218pages
EBook: 1984 by George Orwell ,PDFFile Format
Audio Book: To Kill a Mockingbird by Harper Lee ,12.5duration*/