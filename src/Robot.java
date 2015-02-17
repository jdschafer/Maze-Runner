/*@author		Justin Schafer
@id				jdschafer
@course			CSIS 252
@assignment		Maze Runner Lab 2
@related		Stack.java
@included		N/A
*/

import java.util.*;

public class Robot extends Stack {
	
	static Stack stack;
	static Robot robot;
	public static boolean done;
	public static Scanner console;
	public static String input, temp;
	
	public Robot() {
		done = false;
		stack = new Stack();
		input = " ";
		temp = "";
		console = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		robot = new Robot();
		robot.entering();
		robot.exiting();
	}
	
	public void entering() {
		System.out.println("Type in directions such as f, l, r, e.");
		
		while(!done) {
			input = console.next();
			stack.push(input);
			if(input.equalsIgnoreCase("e"))
				done = true;
		}
		
		stack.pop();
	}
	
	public void exiting() {
		System.out.println("Beginning escape!");
		System.out.println("r");
		System.out.println("r");
		
		while(!stack.isEmpty()) {
			temp = (String) stack.pop();
			if(temp.equalsIgnoreCase("r"))
				System.out.println("l");
			else if(temp.equalsIgnoreCase("l"))
				System.out.println("r");
			else System.out.println(temp);
		}
	}
	
}