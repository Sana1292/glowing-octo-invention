
public class MyQueue {

	Integer[] queueArray=new Integer[10];
	int front;
	int rear;
	
	public MyQueue(){
		front=-1;
		rear=-1;
	}
	public void enQueue(int value){
		if(front !=-1 && front!=0 && front==rear ){
			System.out.println("Queue is full");
		}
		else if (front ==-1 && front==rear){
			front++;
			rear++;
			queueArray[rear]=value;		
		}
		else{
			rear++;
			queueArray[rear]=value;			
		}
	}
	public void deQueue(){
		if(front==-1){
			System.out.println("Queue is empty");
		}
		else{
			int data=queueArray[front];
			queueArray[front]=null;
			front++;
			for (int count=front;count<=rear;count++){
				System.out.println(queueArray[count]);
				
			}
			
		}
	}
	public  static void main(String args[]){
		MyQueue queue=new MyQueue();
		/*stack.push(14);*/
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
queue.deQueue();

	}
}
