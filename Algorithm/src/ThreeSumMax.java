
public class ThreeSumMax {
	
	public static void main(String[] args) {
		ThreeSumMax t=new ThreeSumMax();
		int[] A = {1,4,3,5,7,2,6,8,9};
		
		System.out.print(t.T_Max(A));	
		//System.out.print("Time cost: "+s.elapseTime()+"¬í");
		
	}
  public int T_Max(int[] A) {
	  for(int i=0;i<3;i++) {
		  int Max=i;
		  for(int j=i+1;j<A.length;j++) {
			  if(A[j]>A[Max]) {Max=j;}
		  
		  int buffer=A[i];
		  A[i]=A[Max];
		  A[Max]=buffer;
		  }	  
	  }
	  return A[0]+A[1]+A[2];
  }
  private static void exch(int[] A,int i,int j)
  {
	  int buffer=A[i];
	  A[i]=A[j];
	  A[j]=buffer;
  }
  public int T_MaxBoost(int[] A) {
	int hi=A.length-1;
	int mid=0+(hi+0)/2;
	int[] B= {A[0],A[mid],A[hi]};
	exch(A,1,mid);
	exch(A,2,hi);
	SortTest.InsertSort(B,0,2);

	for(int i=3;i<A.length;i++) {
		int buffer=A[i];
		if(A[i]>B[0]) {
			A[i]=B[0];
			B[0]=buffer;
			SortTest.InsertSort(B,0,2);
			
		}			
	}

     return B[0]+B[1]+B[2];
}
}





