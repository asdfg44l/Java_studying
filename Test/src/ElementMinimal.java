class ElementMinimal{
	
	public static void main(String[] args) {
		ElementMinimal e =new ElementMinimal();
		int[] b= RandomArray.getArray(10000);
		StopClass s=new StopClass();
		System.out.println(e.Ele_Min(b));
		System.out.print(s.elapseTime());
	}
	
	public int Ele_Min(int[] A) {
		int[] aux=new int[A.length];
		SortTest.MergeSort(A, aux, 0, A.length-1);
		int mini=A[1]-A[0];
		for(int i=1;i<A.length-1;i++) {
			if((A[i+1]-A[i])<mini)mini=A[i+1]-A[i];
		}
		return mini;
	}
}