package Strategy;

public class Application {

    public static void main(String[] args) {
        Character character = new Character();
		
		character.setWeapon(new Knife());
		character.attact();

        character.setWeapon(new Gun());
		character.attact();
    }    

}
