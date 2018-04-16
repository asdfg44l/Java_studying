
public class RandomArray {
   
   public static int[] getArray(int a) {
	  int[] A = new int[a];
	   for (int i = 0;i<a;i++) {
			int num = (int) (Math.random()*1000000);
			A[i]=num;
   }return A;
}
}