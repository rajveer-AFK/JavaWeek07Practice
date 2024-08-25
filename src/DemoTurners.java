import java.util.Scanner;

public class DemoTurners {

	public static void main(String[] args) {

		Turner turnerType = createTurnerTypeFromInput(); 
		
		turnerType.turn();
		
	}
	
	public static Turner createTurnerTypeFromInput() {
		Scanner input = new Scanner(System.in);
		
		String turnerTypeMenu = "[1] Leaf Turner\n" +
								"[2] Page Turner\n" +
								"[3] Pancake Turner";
		
		System.out.println(turnerTypeMenu + "\n\nChoice (enter 1-5) >> ");
		int turnerTypeSelection = input.nextInt();
		
		Turner turner = null;
		switch(turnerTypeSelection) {
			case 1:
				turner = new Leaf();
				break;
			case 2:
				turner = new Page();
				break;
			case 3:
				turner = new Pancake();
				break;
			case 4:
				turner = new Table();
				break;
			case 5:
				turner = new TV();
				break;
		}
		
		return turner;
	}
	
}
