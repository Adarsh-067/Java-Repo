package challenge80;

class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    void checkOut(){
        System.out.println("checkout");
    }

    void returnItem(){
        System.out.println("Returning the item");
    }
}
