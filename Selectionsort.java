public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={23,12,43,45,2,10,65};
        int[] n=selection(arr);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }

    }
    public static int[] selection(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
