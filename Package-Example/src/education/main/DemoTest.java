
package education.main;


//import education.college.*;		// load all classes part of education.college folder. 
//import education.college.Attendance;	// loading specific class part of college package. 
//import education.school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		//Attendance att1 = new Attendance();
		education.Attendance att1 = new education.Attendance();
		att1.dis();
		education.Attendance att2 = new education.Attendance();
		att2.dis();
	}

}
