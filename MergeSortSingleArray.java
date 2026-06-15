public class MergeSortSingleArray {

	static void mergeSortArray(int[] arr, int start, int mid,int end)
	{
		
	      int[] crr = new int[end];
	      
	      int i=start,j=mid,k=0;
	       
	      while(i<mid && j<end) {
	    	  if(arr[i]<arr[j]) {
	    		  crr[k]=arr[i];
	    		  i++; k++;
	    	  }
	    	  else {
	    		  crr[k]=arr[j];
	    		  j++; k++;
	    	  }
	      }
	      
	      while(i!=mid) {
	    	  crr[k] = arr[i];
	    	  i++; k++;
	      }
	      while(j!=end) {
	    	  crr[k]=arr[j];
    		  j++; k++;
	      }
	     for(int m=0;m<crr.length;m++) {
	    	 arr[m] = crr[m];
	     }
	}
	      
	
	public static void main(String[] args) {
		 int[] arr ={1,1,2,4,5,1,3,5,7,9};
		 int start=0,end=arr.length;
		
		 
		 int mid = start + (end -start )/2;
	      mergeSortArray(arr, start,mid,end);
	       
	       for(int k=0;k<arr.length;k++) {
	    	   System.out.print(arr[k] + " ");
	       }
	}
}
