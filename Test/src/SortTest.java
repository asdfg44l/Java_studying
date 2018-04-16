
public class SortTest{

	public static void main(String[] args) {
		int[] test = RandomArray.getArray(1000000);
		int[] aux=new int[test.length];
        /*
		System.out.print("���ƧǪ��}�C: ");
		for(int cell :test) {
        	System.out.print(cell+" ");
        	
        }
        */
        System.out.println(" ");
        StopClass s = new StopClass();
        MergeSort(test,aux,0,test.length-1);
		System.out.println("�ƧǩүӶO���ɶ�: "+s.elapseTime());
		/*
		System.out.print("�Ƨǫ᪺�}�C: ");
		for(int cell : test) {
			System.out.print(cell+" ");
		}
		*/
	}
	/**�洫�ƧǪk
	 * ��w�C��,�ûP�}�C������L�������,���p�������h�P��洫��m
	 * �Q�k��²��,�����S�Ĳv
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
	/**��ܱƧǪk
	 * �洫�ƧǪk����}��
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
	/**���J�ƧǪk
	 * �b�}�C�����ܤ֮ɫD�`���Ĳv(��`�Ʈɶ�)
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

	/*�̧ǿ�J�}�C,�H�Ϋݥ洫�����id
	 * 
	 */
	 static void exch(int[] a,int i,int j) {
		int buffer =a[i];
		a[i]=a[j];
		a[j]=buffer;
	}
	 
	/*�M����BiInserSort�ϥ�
	 *��J�}�C,��J�ݱƧǼƦr��ID
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










