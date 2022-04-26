package Factory_Method;

import Factory_Method.Framework.Item;

public class HpPotion extends Item{

    private String itemName;

    public HpPotion(String itemName){
        this.itemName = itemName;
    }

    @Override
    public void use() {
        System.out.println(itemName+" 아이템을 사용함!");
    }
    
}
