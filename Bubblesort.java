// write a Bubblesort program?
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={13,10,8,5,6};
      int[] n=bubblesort(arr);
      for(int i=0;i<n.length;i++){
          System.out.print(n[i]+" ");
      }
    }
    public static int[] bubblesort(int[] arr) {
        int temp;
        for (int j= 0; j < arr.length; j++)
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        return arr;
    }
}
