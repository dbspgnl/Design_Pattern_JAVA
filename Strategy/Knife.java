package Strategy;

public class Knife implements Weapon {

    @Override
    public int doAttact(){
        int damage = 10;
        System.out.println("나이프 공격: "+damage);
        return damage;
    }
    
}
