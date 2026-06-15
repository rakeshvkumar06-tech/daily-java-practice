public class slargest{
    public static void main(String[]args){
        int[] arr={10,20,30,40,50};
        int largest=arr[0];
        int Second=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                Second=largest;
                largest=arr[i];
            }
        }
    }
}