package library;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] catalog;
    private int bookCount;

    public Library(int initialCapacity) {
        catalog = new Book[initialCapacity];
        bookCount = 0;
    }

    public void addBook(Book bookToAdd) {
        if (bookCount < catalog.length) {
            catalog[bookCount++] = bookToAdd;
        } else {
            System.out.println("Library is at full capacity.");
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (catalog[i].getTitle().equalsIgnoreCase(title)) {
                return catalog[i];
            }
        }
        return null;
    }

    public Book findBookByTitleSorted(String title) {
        Arrays.sort(catalog, 0, bookCount, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = bookCount - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int comparison = catalog[middle].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return catalog[middle];
            }
            if (comparison < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null;
    }

    public void listAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(catalog[i]);
        }
    }
}
