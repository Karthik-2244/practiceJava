//find the smallest number in array?
public class Smallestarray {
    public static void main(String[] args) {
        int[] arr={43,23,10,54,67,43};
        int n=smallestarray(arr);
        System.out.print(n+" ");
    }
    public static int smallestarray(int[] arr){
        int n=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<n){
                n=arr[i];
            }
        }
        return n;
    }
}
