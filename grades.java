import java.util.Scanner;

public class grades {
	public static void main(String [] args){

	Scanner keyboard = new Scanner(System.in);
	
	int grades; //this can be short or other things too
	
	System.out.println("Put the grades: ");
	grades = teclado.nextInt();
	
	if(grades > 12) {
		System.out.println("Put a valid number!");
	} else if(grades < 6) {
		System.out.print("Disapproved with: (" + grades +")");
	} else  if(grades >= 6){
		System.out.println("Approved with: (" + grades + ")");
	}
	
	keyboard.close();
	}
}
