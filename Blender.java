/*  Tarea: Hoja de trabajo 1
    Curso: Algoritmos y estructuras de datos
    Grupo: 6
    Alumnos: Avilés, Alejandra (24722); Girón, Jackelyn (24737); Tan, Sergio (24759)
    Fecha de última modificación: 2025-01-23
    Descripción de Blender.java: Trabajo en la logística de los métodos a emplear en la licuadora.
 */
public class Blender implements IBlender{
    private double capacity = 0.00;
    private int speed;

        // Setters y getters
    public void setCapacity(double newCapacity){
        capacity = newCapacity;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public double getCapacity(){
        return capacity;
    }
    
        // Método que válida las condiciones para que puedan ser aumentada la velocidad de la licuadora de 1 en 1.
    @Override
    public void SpeedUp() {
        // TODO Auto-generated method stub
        if(speed < 10 && IsFull()) speed +=1;
    }

        // Método que válida que la licuadora esté llena mediante la capacidad que posee en cierto momento.
    @Override
        // TODO Auto-generated method stub
    public boolean IsFull() {
        if (capacity > 0) {    return true;
        } else {
            return false;        }
    }

        // Método que llena la capacidad al 'máximo' de la licuadora.
    @Override
    public void Fill() {
        // TODO Auto-generated method stub
        if (capacity == 0)    capacity++;        
    }

        // Método que vacía la capacidad de la licuadora cuando está llena.
    @Override
    public void Empty() {
        // TODO Auto-generated method stub
        if (IsFull())        capacity = 0.0;
    }

        // Método que verifica que la velocidad pueda ser reducida del máximo (10) hasta el mínimo (0) cada 1 nivel por vez.
    @Override
    public void SpeedDown() {
        // TODO Auto-generated method stub
        if(speed > 0) speed += -1;
    }

        // Método utilizado para validar la velocidad en la que se encuentra la licuadora.
    @Override
    public int GetSpeed() {
        // TODO Auto-generated method stub
       return speed;
    }
}