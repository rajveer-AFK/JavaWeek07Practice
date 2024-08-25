import javax.swing.JOptionPane;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[10];
		
		fillBookArray(bookArray);
		
		displayBooksDetailsFromArray(bookArray);

	}
	
	public static char getValidBookType() {
		char bookType = Character.toUpperCase(JOptionPane.showInputDialog(null, "Is the book fiction or nonfiction? (enter F or N)", "Book type", 1).charAt(0));
		
		while(bookType != 'F' && bookType != 'N') {
			bookType = Character.toUpperCase(JOptionPane.showInputDialog(null, "Invalid input. Enter F for fiction or N for nonfiction", "Error", 0).charAt(0));
		}
		
		return bookType;
	}
	
	public static void fillBookArray(Book[] bookArray) {
		for(int book = 0; book < bookArray.length; book++) {
			String bookTitle = JOptionPane.showInputDialog(null, "Enter the title of the book", "Book " + (book + 1), 1);
			char bookType = getValidBookType();
			
			if(bookType == 'F') {
				bookArray[book] = new Fiction(bookTitle);
			}
			else {
				bookArray[book] = new NonFiction(bookTitle);
			}
		}
	}
	
	public static void displayBooksDetailsFromArray(Book[] bookArray) {
		for(int book = 0; book < bookArray.length; book++) {
			JOptionPane.showMessageDialog(null, "Title: " + bookArray[book].getTitle() + "\nPrice: $" + bookArray[book].getPrice(), "Book " + (book + 1) + " details", 1);
		}
	}
	
}
