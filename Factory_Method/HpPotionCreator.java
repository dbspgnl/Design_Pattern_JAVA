package Factory_Method;

import Factory_Method.Framework.Item;
import Factory_Method.Framework.ItemCreeator;

public class HpPotionCreator extends ItemCreeator {
    
    @Override
    protected void requestItemInfo(String itemName) {
        System.out.println(itemName + " 아이템 DB 처리");
        
    }
    
    @Override
    protected void createItemLog(String itemName) {
        System.out.println(itemName + " 아이템 제작 : 제작가능");
        
    }
    
    @Override
    protected Item createItem(String itemName) {
        return new HpPotion(itemName);
    }

}
