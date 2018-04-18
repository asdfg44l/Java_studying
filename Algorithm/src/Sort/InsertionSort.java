package Sort;


public class InsertionSort {
   
	public static void Sort(int[] A,int lo,int hi)
	{
		for(int i=lo;i<hi;i++) {
			for(int j=i;j>lo;j--) {
				if(A[j]<A[i])exch(A,i,j);
			}
		}
	}
	public static void exch(int[] A,int i,int j)
	{
		int buffer=A[i];
		A[i]=A[j];
		A[j]=buffer;
	}
}
