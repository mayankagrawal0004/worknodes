package ds.que;

public class app {
public static void main(String args[]) {
	queue work = new queue(5);
	work.insert(100);
	work.insert(1000);
	work.insert(14);
	work.insert(12);
	work.insert(44);
	work.insert(33);
	work.insert(7);
	//work.remove();
	//work.remove();
	work.view();
}
}
