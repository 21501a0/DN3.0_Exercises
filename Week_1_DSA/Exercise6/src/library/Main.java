package library;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library(10);

        lib.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
        lib.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        lib.addBook(new Book(3, "Design Patterns", "Erich Gamma"));

        System.out.println("All Books in the Library:");
        lib.displayBooks();

        Book resultBook;
        String searchTitle = "Clean Code";
        resultBook = lib.linearSearchByTitle(searchTitle);
        System.out.println(resultBook != null ? "\nLinear Search: Found - " + resultBook : "\nLinear Search: Book not found.");

        String searchTitle2 = "x";
        resultBook = lib.linearSearchByTitle(searchTitle2);
        System.out.println(resultBook != null ? "\nLinear Search: Found - " + resultBook : "\nLinear Search: Book not found.");

        searchTitle = "Effective Java";
        resultBook = lib.binarySearchByTitle(searchTitle);
        System.out.println(resultBook != null ? "\nBinary Search: Found - " + resultBook : "\nBinary Search: Book not found.");

        searchTitle2 = "y";
        resultBook = lib.binarySearchByTitle(searchTitle2);
        System.out.println(resultBook != null ? "\nBinary Search: Found - " + resultBook : "\nBinary Search: Book not found.");
    }
}
