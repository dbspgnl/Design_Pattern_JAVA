package Prototype;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        Circle circle1 = new Circle(1, 1, 3);
        // 새로 복사한 객체는 겹치지 않도록 x+1 / y+1 해준다고 가정
        Circle circle2 = circle1.copy(); // 깊은 값 복사
        System.out.println(circle1.getX()+","+circle1.getY()+","+circle1.getZ());
        System.out.println(circle2.getX()+","+circle2.getY()+","+circle2.getZ());
    }
    
}
