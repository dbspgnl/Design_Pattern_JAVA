package Prototype;

public class Circle extends Shape{
    
    int x,y,z;

    // @Override
    protected Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        // 새로 복사한 객체는 겹치지 않도록 x+1 / y+1 해준다고 가정
        circle.x++;
        circle.y++;
        return circle;
    }

    public Circle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    
}
