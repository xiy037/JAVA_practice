package objectLessons.twschool.condition;

public class SortPrint {
  public static void main(String[] args) {
    //把xyz从小到大输出，不直接用sort方法
    int x = 3;
    int y = 6;
    int z = 1;
    int[] arr = {x, y, z};
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j <arr.length - 1 - i; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for (int a : arr) {
      System.out.println(a);
    }
  }
}
