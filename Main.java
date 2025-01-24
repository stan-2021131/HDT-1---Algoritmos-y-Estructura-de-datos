/*  Tarea: Hoja de trabajo 1
    Curso: Algoritmos y estructuras de datos
    Grupo: 6
    Alumnos: Avilés, Alejandra (24722); Girón, Jackelyn (24737); Tan, Sergio (24759)
    Fecha de última modificación: 2025-01-23
    Descripción de Main.java: Interfaz que tendrá contacto con el usuario y maneja los métodos de Blender.java
 */
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
            case 1: // Fill
                if(myBlender.IsFull() == false){
                    myBlender.Fill();
                    System.out.println("The blender is filling up");
                }else{
                    System.out.println("The blender is already fill.");  }
                break;
            case 2: // Empty
                if(myBlender.IsFull()){
                    myBlender.Empty();
                    System.out.println("The blender is emptying");
                }else{
                    System.out.println("The blender is already empty");
                }
                break;
            case 3: // Ckeck fill
                String message = myBlender.IsFull() ? "The blender is full": "The blender is empty";
                System.out.println(message);
                break;
            case 4: // Check Velocity
                System.out.println("The velocity from the blender is: " + myBlender.GetSpeed());
                break;
            case 5: // Speed Up
                if (myBlender.IsFull()== false) {
                    System.out.println("Speed cannot be increased because the blender is empty");
                }else if (myBlender.GetSpeed() == 10) {
                    System.out.println("The speed cannot be increased further");
                }else{
                    myBlender.SpeedUp();
                    System.out.println("The speed increments in 1");
                }
                break;
            case 6: // Speed Down
                if (myBlender.IsFull()== false) {
                System.out.println("Speed cannot be lowered because the blender is empty");
                }else if (myBlender.GetSpeed() == 0) {
                    System.out.println("The speed cannot be reduced further");
                }else{
                    myBlender.SpeedDown();
                    System.out.println("The speed decrease in 1");
                }
                break;
            case 7: // Exit
                isClose = true;
                input.close();
                System.out.println("Closing program...");
                break;
            default: // Manejo de error al ingresar opciones numéricas fuera del rango del menú.
                System.out.println("Choose an option from the menu");
            }
        } while (!isClose);
    }   
}