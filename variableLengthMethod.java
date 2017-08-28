/*
This is an example of a method with x amount of arguments to enter.  We use ... to refer to a variable method.
*/
public class variableLengthMethod {
  public static void main(String[] args) {
  double average = average(1,2,3,4,5,6,7,8,9,10);
  System.out.println(average);
  }
  public static double average(double... numbersToAverage) {
    double total = 0;
    for(double x:numbersToAverage) {
      total+= x;
    }
    return total/numbersToAverage.length;
  }
}
