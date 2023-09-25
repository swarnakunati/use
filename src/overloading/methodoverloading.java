package overloading;

public class methodoverloading {
	int add(int a, int b) {
		return a + b;
	}
	int add (int a,int b, int c) {
		return a+b+c;
	}
	void display(methodoverloading obj) {
		
		System.out.println(obj.add(3,4));
		System.out.println(obj.add(9,7));
		
		System.out.println(obj.add(1, 2,3));
	}
	public static void main(String args[]) {
		methodoverloading obj = new methodoverloading ();
	 obj.display(obj);
	}
	
		
	
	}


