public class Book {
     /*challenge1
     * create a book class for a library system
     * */

    static int totalNoOfBook;

    String title;
    String authorName;
    String bookNum;
    boolean isBorrowed;

    static {
        totalNoOfBook = 0;
    }
    {
        totalNoOfBook++;
    }

    Book(String title, String authorName , String bookNum){
        this.title = title;
        this.authorName = authorName;
        this.bookNum = bookNum;
    }

    Book(String bookNum){
        this("unknown" , "unknown",bookNum);
    }

   void borrowBook(){
       if (isBorrowed){
           System.out.println("Book is already is borrowed");
       }else {
           this.isBorrowed = true;
           System.out.println("Enjoy " + this.title);
       }
    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please review");
        }else {
            System.out.println("This book is already in the library");
        }
    }

    static int getTotalBook(){
        return totalNoOfBook;
    }

    public static void main(String[] args) {
        Book math = new Book("mathematic","Adarsh chaubey","m12a");
        Book hindi = new Book("hindi","author","H22b");
        math.borrowBook();
        System.out.println(Book.getTotalBook());
        math.borrowBook();
        math.returnBook();
        hindi.returnBook();
    }
}
