package Strategy;

public class Gun implements Weapon{

    @Override
    public int doAttact() {
        int damage = 45;
        System.out.println("건 공격: "+damage);
        return damage;
    }
    

}
