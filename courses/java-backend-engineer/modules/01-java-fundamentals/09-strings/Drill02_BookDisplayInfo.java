public class Drill02_BookDisplayInfo {
    static class Book{
        String title;
        String author;
        Double price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();

        book1.title = "The Hobbit";
        book1.author = "J.R.R. Tolkien";
        book1.price = 19.99;

        displayInfo(book1);
    }

    public static void displayInfo(Book book){
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price + " USD");
    }
}
