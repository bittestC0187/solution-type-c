package problem03;

public class MyStack {
	private int top;
	private String[] buffer;
	private int size;
	
	public MyStack( int size ) {
		top = -1;
		buffer = new String[size];
		this.size = size;
	}
	
	public void push(String item) {
		if (full()) {
			String[] tempBuffer = new String[buffer.length + 1];
			for (int i=0; i<buffer.length; i++) {
				tempBuffer[i] = buffer[i]; 
			}
			buffer = tempBuffer;
			size++;
		} 
		buffer[++top] = item;
	}

	public String pop() {
		String item = peek();
		top--;
		return item;
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return 0;
	}
	public String peek(){   
        if(isEmpty()) {
        	return "null";
        }
        return buffer[top];
    }
	public boolean full() {
		return (top == size-1);
	}
}