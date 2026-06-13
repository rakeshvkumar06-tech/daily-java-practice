public class insertionsort {
    public static void main(String[] args) {
        int[] arr={12,13,35,46,47,56,79};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int num:arr){
            System.err.print(num + " ");
        }
    }
    
}
