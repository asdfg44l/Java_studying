import static Sort.myQuickSort.Sort;


class ElementMinimal{
	
	public static void main(String[] args) {
	 ElementMinimal e=new ElementMinimal();
	 int[] a= RandomItem.getArray(1000000);
     StopClass s=new StopClass();
     e.Ele_Min(a);
     System.out.print(s.elapseTime());
	}
	/**��X�}�C�������۶Z���̤p�Z��
	 * �Q��quickSort�Ƨ�
	 * ��X�U���������Z��,�ç�X�̤p�Z��
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