package Strategy;

public class Character {

    private Weapon weapon;

    public int attact(){
        return weapon.doAttact();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
