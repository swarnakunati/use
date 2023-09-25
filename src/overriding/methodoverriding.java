package overriding;


class myparentclass{
	 public void display() {
		 System.out.println("parent class");
	 }
}
 class mychildclass extends myparentclass{
	  public void display() {
		  System.out.println("child class");
	  }
	  
 }
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myparentclass obj = new mychildclass();
		obj.display();

	}

}

