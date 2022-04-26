package Factory_Method;

import Factory_Method.Framework.Item;
import Factory_Method.Framework.ItemCreeator;

public class Applicattion {

    public static void main(String[] args) {

        // 구조만 가져오고 실구현은 자식이 한다.
        ItemCreeator creator;
        Item item;
        // 재정의된 실구현체를 가져와서 처리한다.
        creator = new HpPotionCreator();
        item = creator.create("소량의 레드포션");
        item.use();
        
        // creator = new MpPotionCreator();
        // item = creator.create("소량의 블루포션");
        // item.use();
        
    }
    
}
