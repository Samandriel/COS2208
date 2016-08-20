package ElevatorTest;

/* Lab05
 * @author harris
 */
public class ElevatorTest {

    public static void main(String[] args) {
        
        // Creating myElevator obj.
        Elevator myElevator = new Elevator(); 
        
        while(true) {
            myElevator.openDoor();
            int myTargetFloor = myElevator.selectTargetFloor();
            myElevator.closeDoor();
            myElevator.gotoTargetFloor(myTargetFloor);
        }
    }
    
}
