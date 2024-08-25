import javax.swing.JOptionPane;

public class CircleApplication {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5.0);
		
		JOptionPane.showMessageDialog(null, "The area of the circle is: " + circle1.getArea());
		JOptionPane.showMessageDialog(null, "The perimeter of the circle is " + circle1.getPerimeter());
	
	}
	
}
