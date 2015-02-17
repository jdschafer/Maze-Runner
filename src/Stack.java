/*@author		Justin Schafer
@id				jdschafer
@course			CSIS 252
@assignment		Maze Runner Lab 2
@related		Robot.java
@included		N/A
*/

public class Stack {
	
	final int MAX = 100;
	protected int top;
	Object[] stack;
	
	public Stack() {
		stack = new Object[MAX];
		top = -1;
	}
	
	public void push(Object move) {
		if(isFull())
			return;
		stack[top + 1] = move;
		top++;
	}
	
	public Object pop() {
		if(isEmpty())
			return null;
		Object popped = stack[top];
		stack[top] = null;
		top--;
		return popped;
	}
	
	public Object peek() {
		if(isEmpty())
			return null;
		return stack[top];
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else return false;
	}
	
	public boolean isFull() {
		if(top == MAX)
			return true;
		else return false;
	}
	
}