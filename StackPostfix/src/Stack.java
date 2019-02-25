
public class Stack {
	
	public int[] A;
	public int top = 0;
	
	public Stack(int size) {
		
		A = new int[size];
		
	}
	
	public void push (int x) {
		
		top++;
		A[top] = x;
		
	}
	
	public void pop() {
		
		top--;
		
	}
	
	public int top() {
		
		return A[top];
		
	}
	
	public boolean isEmpty() {
		
		return top <= 0;
		
	}


}
