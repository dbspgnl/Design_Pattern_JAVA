package Factory_Method.Framework;

public abstract class ItemCreeator {

    public Item create (String itemName) {
        
        requestItemInfo(itemName);
        createItemLog(itemName);
        Item item = createItem(itemName);

        return item;
    }

    abstract protected void requestItemInfo(String itemName); // DB 정보 획득
    abstract protected void createItemLog(String itemName); // 로그 
    abstract protected Item createItem(String itemName); // Item 객체 생성
    
}
