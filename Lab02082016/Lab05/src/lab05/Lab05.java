package lab05;
import java.util.Scanner; //Import scanner

/* @author harris
 */
public class Lab05 {

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
