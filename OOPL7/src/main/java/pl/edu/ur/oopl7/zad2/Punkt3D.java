package pl.edu.ur.oopl7.zad2;

public class Punkt3D extends Punkt2D{
    int z;

    public Punkt3D(int x, int y, int z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public String toString(){
        return "X: " + getX() + " | Y: " + getY() + " | Z: " + getZ();
    }
}
