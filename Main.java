
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    boolean isClose = false;
    int selectedOption = 0;
    Blender myBlender = new Blender();
    Scanner input = new Scanner(System.in);

    do {
        System.out.println();
        System.out.println("---Blender Controller---");
        System.out.println("-Select an option:\n1)Fill\n2)Empty\n3)Ckeck fill\n4)Check Velocity\n5)Speed Up\n6)Speed Down\n7)Exit");
        selectedOption = input.nextInt();
        switch (selectedOption) {
            case 1:
                if(myBlender.IsFull() == false){
                    myBlender.Fill();
                    System.out.println("The blender is filling up");
                }else{
                    System.out.println("The blender is already fill.");  }
                break;
            case 2:
                if(myBlender.IsFull()){
                    myBlender.Empty();
                    System.out.println("The blender is emptying");
                }else{
                    System.out.println("The blender is already empty");
                }
                break;
            case 3:
                String message = myBlender.IsFull() ? "The blender is full": "The blender is empty";
                System.out.println(message);
                break;
            case 4: 
                System.out.println("The velocity from the blender is: " + myBlender.GetSpeed());
                break;
            case 5:
                if (myBlender.IsFull()== false) {
                    System.out.println("Speed cannot be increased because the blender is empty");
                }else if (myBlender.GetSpeed() == 10) {
                    System.out.println("The speed cannot be increased further");
                }else{
                    myBlender.SpeedUp();
                    System.out.println("The speed increments in 1");
                }
                break;
            case 6:
                if (myBlender.IsFull()== false) {
                System.out.println("Speed cannot be lowered because the blender is empty");
                }else if (myBlender.GetSpeed() == 0) {
                    System.out.println("The speed cannot be reduced further");
                }else{
                    myBlender.SpeedDown();
                    System.out.println("The speed decrease in 1");
                }
                break;
            case 7:
                isClose = true;
                input.close();
                System.out.println("Closing program...");
                break;
            default:
                System.out.println("Choose an option from the menu");
        }
    } while (!isClose);
 }   
}