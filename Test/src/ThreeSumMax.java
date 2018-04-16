
public class ThreeSumMax {
	
	public static void main(String[] args) {
		ThreeSumMax t=new ThreeSumMax();
		int[] A = RandomArray.getArray(1000000);
		StopClass s = new StopClass();
		t.T_MaxBoost(A);
		System.out.print("Time cost: "+s.elapseTime()+"¬í");
		
	}
  public int T_Max(int[] A) {
	 int SumMax=0;
	  for(int i=0;i<3;i++) {
		  int Max=i;
		  for(int j=i+1;j<A.length;j++) {
			  if(A[j]>A[Max]) {Max=j;}
		  }
		  SumMax+=A[Max];
		  int buffer=A[i];
		  A[i]=A[Max];
		  A[Max]=buffer;
		  		  
	  }
	  return SumMax;
  }
  public int T_MaxBoost(int[] A) {
	int hi=A.length-1;
	int mid=0+(hi+0)/2;
	int[] B= {A[0],A[mid],A[hi]};
	SortTest.InsertSort(B,0,2);
	
	for(int i=0;i<A.length;i++) {
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





