import javax.swing.JOptionPane;

public class UseBook {

	public static void main(String[] args) {
		
		String bookOneTitle = JOptionPane.showInputDialog(null, "Enter the title of the fiction book");
		Fiction bookOne = new Fiction(bookOneTitle);
		
		String bookTwoTitle = JOptionPane.showInputDialog(null, "Enter the title of the non-fiction book");
		NonFiction bookTwo = new NonFiction(bookTwoTitle);
		
		JOptionPane.showMessageDialog(null, "Title: " + bookOne.getTitle() + "\nPrice: $" + bookOne.getPrice(), "Book One details", 1);
		JOptionPane.showMessageDialog(null, "Title: " + bookTwo.getTitle() + "\nPrice: $" + bookTwo.getPrice(), "Book Two details", 1);
	}
	
}

