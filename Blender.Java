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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'IsFull'");
    }
    @Override
    public void Fill() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Fill'");
    }
    @Override
    public void Empty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Empty'");
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