package ElevatorTest;

import java.util.Scanner;

/* @author harris
 */
public class Elevator {

    /* Initilize */
    public boolean doorOpen = false;
    public boolean doorClose = false;
    public int currentFloor = 1;

    public final int TOP_FLOOR = 10; // Constant, value can't be changed.
    public final int MIN_FLOOR = 1;

    /* Input Object */
    Scanner input = new Scanner(System.in);

    /* Class methods */
    public void openDoor() {
        System.out.println("Opening door");
        doorOpen = true;
        System.out.println("Door is open");
    }

    public void closeDoor() {
        if (doorOpen == true) {
            doorClose = true;
            System.out.println("Door closed");
        }
    }

    public int selectTargetFloor() {
        System.out.println("Select target floor: ");
        int targetFloor = input.nextInt();
        
        while (targetFloor > TOP_FLOOR) {
            System.out.println("Maximum Floor is " + TOP_FLOOR);
            System.out.println("Select target floor: ");
            targetFloor = input.nextInt();
        } 
        
        while (targetFloor < MIN_FLOOR) {
            System.out.println("Minumum Floor is " + MIN_FLOOR);
            System.out.println("Select target floor: ");
            targetFloor = input.nextInt();
        }
        
        return targetFloor;
    }

    public void gotoTargetFloor(int targetFloor) {
        if (doorClose == true) {
            
            if (currentFloor < targetFloor) {
                goUp(targetFloor);
            } else if (currentFloor > targetFloor) {
                goDown(targetFloor);
            } else {
                openDoor();
                selectTargetFloor();
                closeDoor();
            } 
        }
    }
    
    
    private void goUp(int targetFloor) {
        while (currentFloor != targetFloor && currentFloor < TOP_FLOOR) {
            currentFloor++;
            System.out.println("Floor: " + currentFloor);
        }       
    }
    
    private void goDown(int targetFloor) {
        while (currentFloor != targetFloor && currentFloor > MIN_FLOOR) {
            currentFloor--;
            System.out.println("Floor: " + currentFloor);
        }        
    }

}
