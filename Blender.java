public class Blender implements IBlender{
    private double capacity = 0.00;
    private int speed;
    private double capacityMax = 3.00;

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
    public boolean IsFull() {
        return capacity >= capacityMax;
    }
    @Override
    public void Fill() {
        if (capacity < capacityMax){
            capacity += 1;
            if (capacity > capacityMax){
                capacity = capacityMax;
            }
        }
    }
    @Override
    public void Empty() {
        if (capacity > 0 & capacity <= capacityMax){
            capacity -= 1;
        }
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
