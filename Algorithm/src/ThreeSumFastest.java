

public class ThreeSumFastest {
  
  public static void main(String[] args) {
	  ThreeSumFastest T= new ThreeSumFastest();  
	  int[] A =new int[10000];
     for (int i=0;i<A.length;i++) {
    	 A[i]=-(i-500);            
     }
     StopClass s =new StopClass();
     System.out.print(T.count(A));
     System.out.println("");
     System.out.print(s.elapseTime());
  }
  

  
  
  int count(int[] A) {
	  A=Sort(A);
	  int count=0;
	  for(int i=0;i<A.length;i++) {
		  for(int j=i+1;j<A.length;j++) {
			  int find= -(A[i]+A[j]);
			  if(find>A[j]) {
			  int hi = BinarySearch(A, find);
			  if (hi >=0 ) {count++;}
			  }
		  }
	  }
	  return count;
  }
  int BinarySearch(int[] A,int find) {
	  int hi =A.length-1;
	  int lo =0;
	  while(lo<=hi) {
		  int mid = lo+(hi-lo)/2;
		  if     (A[mid]>find) hi=mid-1;
		  else if(A[mid]<find) lo=mid+1;
		  else return mid;
	  }
	  return -1;
  }
	static int[] Sort(int[] A) {
		
		for(int i=0;i<A.length;i++) {
             for(int j =i;j>0;j--) {          	 
            	 if(A[j]<A[j-1]) {
                    change(A,j,j-1);
            	 }
             }
             
		}
		return A;
	}
	static void change(int[] A,int i,int j) {
		int buffer =A[i];
		A[i]=A[j];
		A[j]=buffer;
	}
}






