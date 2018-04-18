import static Sort.myQuickSort.Sort;


class ElementMinimal{
	
	public static void main(String[] args) {
	 ElementMinimal e=new ElementMinimal();
	 int[] a= RandomItem.getArray(1000000);
     StopClass s=new StopClass();
     e.Ele_Min(a);
     System.out.print(s.elapseTime());
	}
	/**找出陣列元素間相距的最小距離
	 * 利用quickSort排序
	 * 找出各元素間的距離,並找出最小距離
	 * 
	 */
	public int Ele_Min(int[] A) {
	    Sort(A);
		int min=A[1]-A[0];
		for(int i=1;i<A.length-1;i++)
		{
		  if((A[i+1]-A[i])<min)min=A[i+1]-A[i];
		}
		return min;
	}
}