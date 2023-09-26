package Encapsulation;

public class employee {
 int rollnumber;
 String name;
 boolean isAttended;
 
 public employee(int rollnumber) {
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
}
