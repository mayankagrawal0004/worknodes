package ds;

public class stack {
	
	public int maxlength;
	public char[] stackarray;
	int top;
	public stack(int size) 
	{
		this.maxlength = size;
		this.stackarray = new char[maxlength];
		top =-1;
		
	}
	
	public void push(char word) {
		top++;
		stackarray[top] = word;
	}
	
	public char pop() {
		top--;
		return stackarray[top + 1];
	}
	
	public boolean peek() {
		return (top == maxlength - 1);
		
	}
	
	public boolean empty() {
		
		return (top == -1);
	}

}
