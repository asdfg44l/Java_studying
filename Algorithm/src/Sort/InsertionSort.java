package Sort;

public class InsertionSort {
   
	public static void Sort(Comparable[] A,int lo,int hi)
	{
		for(int i=lo;i<hi;i++) {
			for(int j=i;j>lo;j--) {
				if(less(A[i],A[i-1]))exch(A,i,j);
			}
		}
	}
	public static void exch(Comparable[] A,int i,int j)
	{
		Comparable buffer=A[i];
		A[i]=A[j];
		A[j]=buffer;
	}
    private static boolean less(Comparable v, Comparable s)
    {
    	if(v.compareTo(s)<0)return true;
    	else return false;
    }
}
