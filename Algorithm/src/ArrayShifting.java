
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
     /*將指定的數字插到特定的位置
      * 輸入目標陣列,選擇插入位置,待插入物件的id
      */
     public static void shifting(int[] A,int i,int j) {
    	 int buffer =A[j];
         for(j=j;j>i;j--) A[j]=A[j-1];
         
         A[i]=buffer;
     }
     
}
