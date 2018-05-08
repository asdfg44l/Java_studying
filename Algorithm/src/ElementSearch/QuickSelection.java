package ElementSearch;


public class QuickSelection {
  
  public static void main(String[] args) {
	  Integer[] a= {4,5,6,1,2,3};
	  System.out.print(QuickSelection.partition(a, 0, a.length-1));
	  System.out.println("");
	  for (int cell : a) {
		  System.out.print(cell);
	  }
  }
	
  private static void shuffle(Comparable[] A)
  {
    for(int i=0;i<A.length-1;i++)
    {
      int j=(int) (Math.random()*i+1);
      exch(A,i,j);
    }
  }
  private static void exch(Comparable[] A,int i,int j)
  {
	  Comparable buffer=A[i];
	  A[i]=A[j];
	  A[j]=buffer;		  
  }
  private static boolean less(Comparable v,Comparable x)
  {
	  if(v.compareTo(x)<0) return true;
	  else return false;
  }
  private static int partition(Comparable[] A,int lo,int hi) 
  {
	 int i=lo;
	 int j=hi+1;
	 while(true)
	 {
	     while(less(A[++i],A[lo]));
	     if(i==hi) break;
	     
	     while(less(A[lo],A[--j]));
	     if(j==lo) break;
	     
	     if(i>=j) break;
	     exch(A,i,j);
	 }
	 
	 exch(A,lo,j);
	 return j;
  }
  //找出該陣列的第k個元素
  public static Comparable Select(Comparable[] A,int k)
  {
	shuffle(A);
	int lo=0; int hi=A.length-1;
	
	while(hi<=lo)
	{
	  int j =partition(A,lo,hi);
	  if(k<j) hi=j-1;
	  if(k>j) lo=j+1;
	  else return A[k];
	}
	return A[k];
  }
}












