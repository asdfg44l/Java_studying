
public class SortTest{

	public static void main(String[] args) {
		int[] test = RandomArray.getArray(1000000);
		int[] aux=new int[test.length];
        /*
		System.out.print("未排序的陣列: ");
		for(int cell :test) {
        	System.out.print(cell+" ");
        	
        }
        */
        System.out.println(" ");
        StopClass s = new StopClass();
        MergeSort(test,aux,0,test.length-1);
		System.out.println("排序所耗費的時間: "+s.elapseTime());
		/*
		System.out.print("排序後的陣列: ");
		for(int cell : test) {
			System.out.print(cell+" ");
		}
		*/
	}
	/**交換排序法
	 * 選定列首,並與陣列中的其他元素比較,較小的元素則與其交換位置
	 * 想法較簡單,但較沒效率
	 **/
	static void ExchangeSort(int[] A) {
		for(int i =0;i<A.length;i++) {
			for(int j =i+1;j<A.length;j++) {
				if (A[i]>A[j]) {
                   exch(A,i,j);
                   
                   
				}
			}
		}
	}
	/**選擇排序法
	 * 交換排序法的改良版
	 * 
	 */
	static void SelectionSort(int[] A) {
		
		for(int i=0;i<A.length;i++) {
              int min =i;
              for(int j=i+1;j<A.length;j++) {
                  if(A[min]>A[j]) {
                	  min=j;
                  }
              }
              exch(A,min,i);
              

			}
		}
	/**插入排序法
	 * 在陣列元素很少時非常有效率(近常數時間)
	 * 
	 */
	static void InsertSort(int[] A,int lo,int hi) {
		
		for(int i=lo;i<=hi;i++) {
             for(int j =i;j>lo;j--) {          	 
            	 if(A[j]<A[j-1]) {
                    exch(A,j,j-1);
            	 }
             }
             
		}
		
	}

	/*依序輸入陣列,以及待交換的兩個id
	 * 
	 */
	 static void exch(int[] a,int i,int j) {
		int buffer =a[i];
		a[i]=a[j];
		a[j]=buffer;
	}
	 
	/*專門給BiInserSort使用
	 *輸入陣列,輸入待排序數字的ID
	 * 
	 */
	static int BiSearch(int[] A,int i) {
        int ho =i;
		int lo =0;
		while(lo<=ho) {
		int mid = lo+(ho-lo)/2; 
		if     (A[mid]>A[i]) ho =mid-1;
		else if(A[mid]<A[i]) lo =mid+1;
		else return mid;
		}
		return lo+(ho-lo)/2;
	}
	
	
	
	static int[] BiInsertSort(int[] A) {
		for(int i=0;i<A.length-1;i++) {
			if(A[i+1]<A[i]) {
				int position = BiSearch(A,i+1); //find the position
				ArrayShifting.shifting(A, position,i+1 );
			}
		}
		return A;
	}
	/**ShellSort
	 * magic number=3x+1
	 * 
	 */
	static int[] shellSort(int[] A) {
		int h=1;
		int N=A.length;
		while(h<N/3) h=3*h+1;
		
		while(h>=1 && h>10){
			for(int i=h;i<N;i++) {
				for(int j=i;j>h;j-=h) {
					if(A[j]<A[j-h])exch(A,j,j-h);
				}
			}
			h=h/3;
		}
		InsertSort(A,0,A.length-1);
		return A;
	}
	static void MergeSort(int[] a,int[] aux,int lo,int hi) {
		int CUTOFF=7;
		
		if(hi<=lo+CUTOFF-1) {
			InsertSort(a,lo,hi);
			return;
		}
		
		int mid =lo+(hi-lo)/2;
		MergeSort(a,aux,lo,mid);
		MergeSort(a,aux,mid+1,hi);
		if(a[mid+1]>a[mid])return;		
		Merge(a,aux,lo,mid,hi);
		
	}
	static void Merge(int[] a,int[] aux,int lo,int mid,int hi) {
		for(int k=lo;k<=hi;k++) {
			aux[k]=a[k];
		}
		int i=lo;
		int j=mid+1;
		for(int k=lo;k<=hi;k++) {
			if     (i>mid)         a[k]=aux[j++];
			else if(j>hi)          a[k]=aux[i++];
			else if(aux[i]>aux[j]) a[k]=aux[j++];
			else                   a[k]=aux[i++];
		}
	}
}










