import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    int[] list = {1,3,5,7,9,2,4,6,8,10,3,6,9,12};
    search(list);

  }
  public static void search(int[] arrayName) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer to search for in your list: ");
    int integerToSearchFor = Integer.parseInt(input.nextLine());
    for(int i = 0; i < arrayName.length; i++) {
      if (integerToSearchFor == arrayName[i]) {
        System.out.println("The integer is located in index: " + i);
        return;
      }
    }
    System.out.println("The integer you are searching for is not located in this list.");
  }
}
