package Encapsulation;

  public class employee {
  private int rollnumber;
  private String name;
  private boolean isAttended;
public Object setemp;
 
 public int getRollnumber() {
	return rollnumber;
}


public void setRollnumber(int rollnumber) {
	System.out.println("210");
	this.rollnumber = rollnumber;
}


public String getName() {
	System.out.println("swarna");
	return name;
}


public void setName(String name) {
	System.out.println("latha");
	this.name = name;
}


public employee(int rollnumber) {
	System.out.println("205");
	 this.rollnumber =rollnumber;
 }

 
 public void SetemployeeAttendence(boolean flag) {
	 isAttended = flag;
	 System.out.println("teamlead assigned attendence to employee");
 }
 
 
 public boolean getemployeeAttendence() {
	 System.out.println("teamlead accessed employee attendence");
	 return isAttended;
 }


public void setemployeename(String flag) {
	name =flag;
	System.out.println("swarna");

}
public void getemployeerollnumber(int flag) {
	rollnumber = flag;
	System.out.println("210");
}
}
