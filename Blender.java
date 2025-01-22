public class Blender implements IBlender{
    private double capacity = 0.00;
    private int speed;

    public void setCapacity(double newCapacity){
        capacity = newCapacity;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public double getCapacity(){
        return capacity;
    }
    
    @Override
    public void SpeedUp() {
        // TODO Auto-generated method stub
        if(speed < 10 && IsFull()) speed +=1;
    }
    @Override
        // TODO Auto-generated method stub
    public boolean IsFull() {
        if (capacity > 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void Fill() {
        // TODO Auto-generated method stub
        if (capacity == 0)
            capacity++;
        }
    @Override
    public void Empty() {
        // TODO Auto-generated method stub
        if (IsFull())
            capacity = 0.0;
    }
    @Override
    public void SpeedDown() {
        // TODO Auto-generated method stub
        if(speed > 0) speed += -1;
    }
    @Override
    public int GetSpeed() {
        // TODO Auto-generated method stub
       return speed;
    }
}