
class ElementMinimal{
	
	public static void main(String[] args) {
	 ElementMinimal e=new ElementMinimal();
	 double[] a= {3.0,6.78,2.1,5,8,1,1.09};
	 Sort(a);
     for (double cell : a)System.out.print(cell+" ");
     System.out.println("");
     System.out.print(e.Ele_Min(a));
	}
	/**��X�}�C�������۶Z���̤p�Z��
	 * �Q��quickSort�Ƨ�
	 * ��X�U���������Z��,�ç�X�̤p�Z��
	 * 
	 */
	public double Ele_Min(double[] A) {
		int x = 0;
		Sort(A);
		double min=A[1]-A[0];
		for(int i=1;i<A.length-1;i++)
		{
		  if((A[i+1]-A[i])<min)min=A[i+1]-A[i];x=i;
		}
		
		//�p��ä����ӼƦr���h�֤p���I,�ÿ�ܸ��j��
		int deci=0;
		if(getBigDecimal(A[x])<getBigDecimal(A[x+1])) deci=getBigDecimal(A[x+1]);
		else deci=getBigDecimal(A[x]);
		
		//�Nmin����P�e�̤@�˪��p�Ʀ��
		double s=Double.parseDouble( String.format("10E%d",deci)); 
		double r_min= Math.round(min*s)/s;
		return r_min;
	}
	/**�p��Ʀr���h�֤p���I
	 * 
	 */
	private static int getBigDecimal(double target)
	{
		if(0.0== target%1)return 0;
		
		else {
			String starget=String.valueOf(target);
			return starget.length()-starget.indexOf('.')-1;
		}
	}
	
	private static void Sort(double[] A) {
		for(int i=0;i<A.length;i++) {
			for(int j=i;j>0;j--) {
				if(A[j]<A[j-1])swap(A,j,j-1);
			}
		}
	}
	private static void swap(double[] A,int i,int j) {
		double buffer=A[i];
		A[i]=A[j];
		A[j]=buffer;
		
	}
}