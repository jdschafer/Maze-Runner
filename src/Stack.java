
public class Stack {
	
	final int MAX = 100;
	protected int top;
	Object[] stack;
	
	public Stack() {
		stack = new Object[MAX];
		top = -1;
	}
	
	public void push(Object move) {
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
	
}