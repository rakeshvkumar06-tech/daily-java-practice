public class merge2arr {
   public static void main(String[] args) {
    int[]arr={1,2,3};
    int[]brr={2,4,6};
    int al=arr.length;
    int bl=brr.length;
    int[]crr=new int[al+bl];
    int i=0;
    int j=0;
    int k=0;
    while(i<al&&j<bl){
        if(arr[i]<brr[j]){
            crr[k]=arr[i];
            i++;
            k++;
        }
        else{
            crr[k]=brr[j];
            j++;
            k++;
        }
    }
    while(i<al){
        crr[k]=arr[i];
        i++;
        k++;

    }
    while(j<bl){
        crr[k]=brr[j];
        j++;
        k++;
    }
     for (int x = 0; x < crr.length; x++) {
            System.out.print(crr[x] + " ");
        }

   }

}



