
public class StopClass {
private final long start = System.nanoTime();
 
 public static void main(String[] args) {
   
 }
 
 public double elapseTime() {
	 long now = System.nanoTime();
	 
	 double A = now-start;
	 return A/1000000000;
 }
}
