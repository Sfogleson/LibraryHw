package libraryHw;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String address;

	public List<Book> catalog;

	public Library() {
	}

	public Library(String address) {
		this.address = address;
		this.catalog = new ArrayList<Book>();
	}

	public void addBook(Book newBook) {
		catalog.add(newBook);
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(this.address);
	}

	public List<Book> getCatalog() {
		return this.catalog;
	}

	public void borrowBook(String title) {
		Book bookToFind = null;
		for (Book bookInCatalog : this.catalog) {
			if (bookInCatalog.getTitle().equalsIgnoreCase(title)) {
				bookToFind = bookInCatalog;
			}
		}
		if (bookToFind == null) {
			System.out.println("Sorry, this book is not in our catalog. ");
		} else {
			if (bookToFind.isBorrowed()) {
				System.out.println("Sorry, this book is already borrowed. ");
			} else {
				bookToFind.borrowed();
				System.out.printf("You have successfully borrowed %s\n", bookToFind.getTitle());
			}
		}
	}

	public void printAvailableBooks() {
		if (this.catalog.size() == 0) {
			System.out.println("No book in catalog");
		} else {
			for (Book bookInCatalog : this.catalog) {
				if (!bookInCatalog.isBorrowed()) {
					System.out.println(bookInCatalog.getTitle());
				}
			}
		}
	}

	public void returnBook(String title) {
		for (Book bookInCatalog : this.catalog) {
			if (bookInCatalog.getTitle().equalsIgnoreCase(title)) {
				bookInCatalog.returned();
				System.out.printf("You successfully returned %s\n", bookInCatalog.getTitle());
			}
		}

	}

}
