
//Range between largest number and smallest number in array?

public class Range {
    public static void main(String[] args) {
        int[]arr={21,32,34,54,56,76};
        int a=Range(arr);
        System.out.println(a);
    }
    public static int Range(int[] arr){
        int range;

        int n=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }

        int n1 =arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]<n1){
                n1=arr[j];
            }
        }
        range=n-n1;
        return range;
    }
}
