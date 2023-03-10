
public class Queue {
	
	private int maxSize;
	private int rear;
	private int front;
	private int[] queArray;
	private int nItem;
	
	public Queue(int s) {
		
		this.maxSize = s;
		this.rear = -1;
		this.front = 0;
		this.queArray = new int[maxSize];
		this.nItem = 0;
	}
	
	public boolean isEmpty() {
		return nItem == 0;
	}
	public boolean isFull() {
		return rear == maxSize - 1;
	}
	
	
	public void insert(int v){
		
		if (isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			
			queArray[++rear] = v;
			nItem++;
		}
	}
	
	
	public int remove() {
		 
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -9;	
		}
		else {
			
			nItem--;
			return queArray[front++];
		}
	}
	

	public int peekfornt() {
		 
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -9;	
		}
		else {
			
			return queArray[front];
		}
	}
	
	
	
	
	
	

}
