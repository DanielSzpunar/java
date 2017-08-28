import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] list = {3,9,2,1,6,8,11,3,5,7};
	    int smallestValue = smallestValue(list);
	    System.out.println("The smallest value is: " + smallestValue);

        System.out.println();
        int smallestIndex = smallestIndex(list);
        System.out.println("The smallest index value is: " + smallestIndex);

        System.out.println();
        int smallestIndexFrom = smallestIndexFrom(list, 5);
        System.out.println("The smallestIndexFrom is: " + smallestIndexFrom);

        System.out.println();
        swap(list,0,3);

        System.out.println();
        int[] arraySorted = sort(list);
        System.out.println("The array sorted from smallest to largest is: " + Arrays.toString(arraySorted));
    }
    /*
    This method works by giving the variable smallestValue arrayName[0].
    As the for loop iterates through all the values in the arrayName and compares them to smallestValue, if smallestValue is greater than arrayName[i], smallestValue will change values with arrayName[i]. Thus, we are left with the smallest value at the end of the iteration.
     */
    public static int smallestValue(int[] arrayName) {
        int smallestValue = arrayName[0];
        for(int i = 0; i < arrayName.length; i++) {
            if(smallestValue > arrayName[i]) {
                smallestValue = arrayName[i];
            }
        }
        return smallestValue;
    }
    /*
    This method works by giving smallestIndex a value of 0, the first position in the array.  As we iterate through the array and compare arrayName[smallestIndex], if it is larger than the current iteration we assign the value of i to smallestIndex.
     */
    public static int smallestIndex(int[] arrayName) {
        int smallestIndex = 0;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[smallestIndex] > arrayName[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    /*
    This method works the same as the above.  However, instead of beginning at 0 for the iteration we begin at the value entered for index.
     */
    public static int smallestIndexFrom(int[] arrayName, int index) {
        int smallestIndexFrom = index;
        for(int i = index; i < arrayName.length; i++) {
            if (arrayName[smallestIndexFrom] > arrayName[i]) {
                smallestIndexFrom = i;
            }
        }
        return smallestIndexFrom;
    }
    /*
    The below method stores the first value to switch in a temp variable.  then we switch arrayName[index1] with arrayName[index2] and arrayName[index2] with arrayName[index1] which is now stored in temp.
     */
    public static void swap(int[] arrayName, int index1, int index2) {
        int temp = arrayName[index1];
        arrayName[index1] = arrayName[index2];
        arrayName[index2] = temp;
    }

    public static int[] sort(int arrayName[]) {
        for (int i = 0; i < arrayName.length; i++) {
            int smallestIndex =  smallestIndexFrom(arrayName, i);
            swap(arrayName, i, smallestIndex);
            System.out.println(Arrays.toString(arrayName));
        }
        return arrayName;
  }
}
