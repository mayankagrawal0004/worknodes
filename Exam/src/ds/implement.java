package ds;

public class implement {
	
	public static void main(String args[]) {
		System.out.println("hello");
		stack sample = new stack(10);
		String work ="Mayank";
		char[] a = work.toCharArray();
		int temp =0;
		String result=" ";
		while(a.length  != temp) 
		{
			sample.push(a[temp]);
			temp++;
			
		}
		
		
		while(!sample.empty()) {
		 result = result  + (sample.pop());
			
		}
		System.out.println(result);
		
		
	}

}
