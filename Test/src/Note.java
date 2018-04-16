class Note{
	
	public static void main(String[] args) {
		int[] a = RandomArray.getArray(1000000);
		Note n =new Note();
		StopClass s =new StopClass();
		n.testing(a);
		System.out.print(s.elapseTime());
	
	}
	 public int testing(int[] A) { 
		  int[] B = {A[0],A[1],A[2]}; 
		  B = InsertSort(B); 
		  for(int i=3; i<A.length; i++) { 
		   int buffer = A[i]; 
		   if(A[i]>B[0]) { 
		    A[i] = B[0]; 
		    B[0] = buffer; 
		    B = InsertSort(B); 
		   } 
		  } 
		  return 0; 
		 } 
		  
		 static int[] InsertSort(int[] A) { 
		  for(int i=0; i<A.length; i++) { 
		   for(int j=i; j>0; j--) { 
		    if(A[j]<A[j-1]) { 
		     change(A,j,j-1); 
		    } 
		   } 
		  } 
		  return A; 
		 } 
		  
		 static void change(int[] A, int i, int j) { 
		  int buffer = A[i]; 
		  A[i] = A[j]; 
		  A[j] = buffer; 
		 }
}	 