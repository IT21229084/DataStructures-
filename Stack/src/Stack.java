
public class Stack {
	
	//Declare Variables
	private int maxSize;
	private double [] Array_Stack;
	private int Top;
	
	//Implement the constructor........
	public Stack(int S) {
		super();
		this.maxSize = S;
		Array_Stack = new double[maxSize];
		Top = -1;
	}
	
	//Implement the Push(Adding) Method..........
	public void push(double v) {
		
		//if (Top == maxSize -1)
		if (isFull())
		{
			
			System.out.println("Stack Is Full");
			
		}else {
			
			++Top;
			Array_Stack[Top] = v;
		}	
	}
	
	
	//Implement the Pop(Remove) method..........
	public double pop() {
		
		//if(Top == -1) 
		if(isEmpty())
		{
			return -1;
		}
		return Array_Stack[Top--];
	}
	
	//Implement the peek(View Top value) Method........
	public double peek() {
		
		//if(Top == -1)
		if(isEmpty())
		{
			return -1;
		}
		else {
			return Array_Stack[Top];
		}
		
	}
	
	//Implement IsEmpty(Check Whether Stack is Empty) Method.........
	public Boolean isEmpty() {
		
		return Top == -1;	
	}
	
	//Implement ISfull(Check whether Stack is Already Full) Method
	public Boolean isFull() {
		return Top == maxSize -1;
	}
	
}
