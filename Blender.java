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
    public int getSpeed(){
        return speed;
    }
    @Override
    public void SpeedUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SpeedUp'");
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
        throw new UnsupportedOperationException("Unimplemented method 'SpeedDown'");
    }
    @Override
    public int GetSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetSpeed'");
    }
}
