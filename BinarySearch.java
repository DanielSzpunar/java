public class BinarySearch{
  public static void main(String[] args) {
    int [] list = {1,3,5,7,9,11,14,16,17,20,23,25,27,29,33,35,46,54,58,61,63};
    binarySearch(list, 7);
  }
  public static void binarySearch(int[] arrayName, int key) {
    int high = arrayName.length -1;
    int low = 0;
    while(low <= high) {
      int mid = (low + high) / 2;
      if (key > arrayName[mid]) {
        low = mid + 1;
      }
      else if (key == arrayName[mid]) {
        System.out.println("The key is located in position: " + mid);
        return;
      }
      else {
        high = mid - 1;
      }
    }
  }
}
