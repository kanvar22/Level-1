import org.jointheleague.graphical.robot.Robot;
public class RobotOlympicRings {
public static void main(String[] args) {
	//call your drawCircle method here
	drawCircle();
	
}
RobotOlympicRings(){
	
}
// Step 1: Make a new robot
static Robot r = new Robot();
// Step 2: Make a method that draws a circle
static void drawCircle() {
	r.penDown();
	for (int i = 0; i < 360; i++) {
		r.move(1);
		r.turn(1);
	}
}
//Step 3: Call your drawCircle method in the main method


// Step 4: Adjust the circles so that they form the Olympic Rings
}