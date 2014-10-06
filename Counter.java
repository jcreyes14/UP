
public class Counter {
	public int fizzbuzz(int count){
		if (count%15 == 0){
			  System.out.println("FizzBuzz");
			  count++;
			   return count;
		  }
		else
			return count;
	}
	
	public int buzz(int count){
		if (count%5 == 0){
			  System.out.println("Buzz");
			  count++;
			   return count++;
		  }
		else
			return count;
	}
	
	public int fizz(int count){
		if (count%3 == 0){
			  System.out.println("Fizz");
			  count++;
			   return count;
		  }
		else if(count == 101)
		{
			return count;
		}
		else
		{
			System.out.println(count);
			count++;
			return count;
		}
	}
	
	 public static void main(String args[]) {
		 Counter test = new Counter();
		  int count = 1;
		  
		  /* Method 2: Not using functions
		   * while (count <= 100){
			  if (count%15 == 0){
				  System.out.println("FizzBuzz");
				  count++;
			  }
			  else if (count%5 == 0){
				  System.out.println("Buzz");
				  count++;
			  }
			  else if (count%3 == 0){
				  System.out.println("Fizz");
				  count++;
			  }
			  else {
				  System.out.println(count);
				  count++;
			  }
		  }*/
		  while(count <= 100){
			  count = test.fizzbuzz(count);
			  count = test.buzz(count);
			  count = test.fizz(count);
			  if (count == 101)
				  break;
		  }
		 } 

}
