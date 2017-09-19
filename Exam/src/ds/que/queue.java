package ds.que;

public class queue {
	
	private int maxsize;
	private long[] queuArray;
	private int first;
	private int rear;
	private int nItems;
	
	public queue(int load) {
		this.maxsize = load;
		this.queuArray = new long[maxsize];
		this.first = 0;
		this.rear = -1;
		this.nItems =0;
		
	}
	
	public void insert(long num) {
		if(rear == maxsize - 1) {
			rear = -1;
		}
		rear++;
		queuArray[rear] = num;
	  nItems++;
		
	}
	
	public long remove() {
		
		long removed = queuArray[first];
		first++;
		nItems--;
		return removed;
	}
	
	public long peekfront() {
		
		return queuArray[first];
	}
	
	public boolean isEmpty() {
		
		return (nItems == 0);
	}
	
	public boolean isFull() {
		
		return (nItems == maxsize);
	}
	
	public void view() {
		for(int i =0;i<queuArray.length;i++) {
			System.out.println(queuArray[i]);
		}
	/*	int temp = first;
		while(temp < queuArray.length ) {
			
			System.out.println(queuArray[temp]);
			temp++;
		}*/
		
	}

}
