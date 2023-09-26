package Abstract;

public class Abmethod {
	public static void main (String a[]) {
		Mphone obj =new Sphone();
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
	}
}
 abstract class Mphone{
	 public void call()
	 {
		 System.out.println("calling...");}
			 
		 
		 public abstract void move();
		 public abstract void dance();
		 public abstract void cook();
	 }
	 abstract class Rphone extends Mphone{
		 public void move() {
			 System.out.println("moving..");
		 }
	 }
	 class Sphone extends Rphone{
		 public void dance() {
			 System.out.println("Dancing..");;
		 }
		 public void cook() {
			 System.out.println("cooking..");}
	 
		 
		 
	 }
 