/*
This FizzBuzz test was written and tested completely in Nano in
Terminal on Wednesday August 30th, 2017.  One day look back at
this Dan.  A short time ago you didn't know there was a terminal.
  
*/
public class FizzBuzz {

	public static void main (String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
			System.out.println(i +". Fizz Buzz");
			}
				else if (i % 3 == 0) {
				System.out.println(i + ". Fizz");	
			}
				else if (i % 5 == 0) {
				System.out.println(i + ". Buzz");
			}
				else {
				System.out.println(i + ".");
			}
		}
	}
}
