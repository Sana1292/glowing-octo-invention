
public class MyStack {

	int top=-1;
	Integer[] stackArray = null;

	public MyStack() {
		 
		 stackArray = new Integer[10];
	}

	public void push(int value) {
		if (top != (stackArray.length) - 1) {
			
			stackArray[++top] = value;
			System.out.println("element addede"+stackArray[top]);
			
		} else {
			System.out.println("Stack overflow");
		}
	}

	public Integer pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return top;
		} else {
			Integer data = stackArray[top];
			top--;
			return data;
		}

	}

public Integer peek() {
	if (top == -1) {
		System.out.println("Stack is empty");
		return -1;
	} else {
		Integer data=stackArray[top];

		return data;
	}
	

}
public  static void main(String args[]){
	MyStack stack=new MyStack();
	/*stack.push(14);*/
	stack.push(12);
	stack.push(13);
	stack.push(14);
	stack.pop();

}
}