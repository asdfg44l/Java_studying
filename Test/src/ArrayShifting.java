
public class ArrayShifting {
     public static void main(String[] args) {
    	 int[] b = {1,2,3,5,3};
    	 int po =SortTest.BiSearch(b, 4);
    	 System.out.println(po);
    	 shifting(b,po,4);
    	 for(int cell : b) {
    	 System.out.print(cell);
    	 }
     }
     /*�N���w���Ʀr����S�w����m
      * ��J�ؼа}�C,��ܴ��J��m,�ݴ��J����id
      */
     public static void shifting(int[] A,int i,int j) {
    	 int buffer =A[j];
         for(j=j;j>i;j--) A[j]=A[j-1];
         
         A[i]=buffer;
     }
     
}
