package Sort;

import java.util.Comparator;

public class myQuickSort 
{   
	public static void main(String[] args) {
		int a =3;
		int b =4;
		System.out.print(myQuickSort.less(a,b));
	}
    private static boolean less(Comparable v, Comparable s)
    {
    	if(v.compareTo(s)<0)return true;
    	else return false;
    }
	
    //交換陣列中的兩個元素
	private static void exch(Comparable[] A,int i,int j)
	{
		Comparable buffer=A[i];
		A[i]=A[j];
		A[j]=buffer;
	}
	
	//將陣列中的元素洗亂
	private static void shuffle(Comparable[] A)
	{
	   for(int i=0;i<A.length-1;i++) 
	   {
		  int random=(int) (Math.random()*i+1);
		  exch(A,i,random);
	   }
	}
	
	
	private static Comparable mediumOf3(Comparable[] A,int lo,int mid,int hi)
	{
		Comparable[] ax= {A[lo],A[mid],A[hi]};
		InsertionSort.Sort(ax,0,2);
		return ax[1];
		
	}
	
	/**找出lo在陣列中的位置
	 * 對陣列進行分堆,小於lo的一堆,大於lo的一堆
	 * 最後將lo置入他所在的位置
	 * 回傳lo的索引
	 */
	private static int partition(Comparable[] A,int lo,int hi) {
		int i=lo;
		int j=hi+1;
		
		while(true) {
			
			while(less(A[++i],A[lo]))
			   if(i==hi) break;
			
			while(!less(A[lo],A[--j]))
			   if(j==lo) break;
			
			if(i>=j) break;
			exch(A, i, j);
		}
	   exch(A, lo, j);
	   return j;
	}
	public static void Sort(Comparable[] A) {
		shuffle(A);
		Sort(A,0,A.length-1);
	}
	private static void Sort(Comparable[] a,int lo,int hi)
	{
		int CUTOFF=10;
		
		if(hi<=lo+CUTOFF-1) {
			InsertionSort.Sort(a,lo,hi);
			return;
		}
		/*
		int medium=mediumOf3(A,lo,lo+(hi-lo)/2,hi);
		exch(A,lo,medium);
		*/
		int j=partition(a,lo,hi);
		Sort(a,lo,j-1);
		Sort(a,j+1,hi);
	}






	
		
}
