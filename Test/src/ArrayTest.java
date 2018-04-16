import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		int b = 0;
		ArrayList alist = new ArrayList();
		for (int i=0;i <3;i++) {
			v2 two = new v2(alist);
			v3 three = new v3(alist);
		}
		for (Object Sim : alist) {
			Simcount s = (Simcount) Sim;
			b += s.Consumpt();
		}
		System.out.print(b);
	}
}

class v2 {
	static int num;
	v2(ArrayList list){
		
        list.add(new Simcount("v2"));
	}	
}

class v3{
	static int num;
	v3(ArrayList anlist){
		anlist.add(new Simcount("v3"));
	}

}
class Simcount {
  String SimType;
     Simcount(String a){
    	SimType = a;
	}
     int Consumpt() {
    	 if(SimType.equals("v2")) {return 2;}
    	 else {return 4;}
     }
}

