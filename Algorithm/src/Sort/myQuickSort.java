package Sort;


public class myQuickSort 
{   
    
    //交換陣列中的兩個元素
	private static void exch(int[] A,int i,int j)
	{
		int buffer=A[i];
		A[i]=A[j];
		A[j]=buffer;
	}
	
	//將陣列中的元素洗亂
	private static void shuffle(int[] A)
	{
	   for(int i=0;i<A.length;i++) 
	   {
		  int random=(int) (Math.random()*i+1);
		  exch(A,i,random);
	   }
	}
	
	
	private static int mediumOf3(int[] A,int lo,int mid,int hi)
	{
		int[] ax= {A[lo],A[mid],A[hi]};
		InsertionSort.Sort(ax,0,2);
		return ax[1];
		
	}
	
	/**找出lo在陣列中的位置
	 * 對陣列進行分堆,小於lo的一堆,大於lo的一堆
	 * 最後將lo置入他所在的位置
	 * 回傳lo的索引
	 */
	private static int partition(int[] A,int lo,int hi) {
		int i=lo;
		int j=hi+1;
		
		while(true) {
			
			while(A[++i]<A[lo])
			   if(i==hi) break;
			
			while(A[--j]>A[lo])
			   if(j==lo) break;
			
			if(i >=j) break;
			exch(A, i, j);
		}
	   exch(A, lo, j);
	   return j;
	}
	public static void Sort(int[] A) {
		shuffle(A);
		Sort(A,0,A.length-1);
	}
	private static void Sort(int[] A,int lo,int hi)
	{
		int CUTOFF=10;
		
		if(hi<=lo+CUTOFF-1) {
			InsertionSort.Sort(A,lo,hi);
			return;
		}
		/*
		int medium=mediumOf3(A,lo,lo+(hi-lo)/2,hi);
		exch(A,lo,medium);
		*/
		int j=partition(A,lo,hi);
		Sort(A,lo,j-1);
		Sort(A,j+1,hi);
	}
	
		
}
