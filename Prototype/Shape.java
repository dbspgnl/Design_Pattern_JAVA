package Prototype;

public class Shape implements Cloneable{
    
    private String id;

    public void draw() {
        System.out.println("도형을 그렸다.");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
