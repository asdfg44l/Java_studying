

public abstract class DebugTest {
	int[] A;
	
	public abstract int max();
	
	public abstract int dot(int[] B);

}

class HW01 extends DebugTest{
	public static void main(String[] args) {
		HW01 h = new HW01(RandomItem.getArray(10000));
        StopClass stop = new StopClass();
		h.max();
        h.dot(h.A);
        System.out.print(stop.elapseTime());
	}
	HW01(int[] A){
        this.A =A;
		}
	

	@Override
	public int max() {
		 int max = 0 ;
         for (int num : A ) {
        	if (num > max) {
        		max = num;
        	}
         }
         return max;

	}

	@Override
	public int dot(int[] B) {
		 int dot = 0;
         for (int i=0; i< A.length;i++) {
        	 dot+= A[i] * B[i];
        		 
        	 }return dot;
	}
	
	
	
}







