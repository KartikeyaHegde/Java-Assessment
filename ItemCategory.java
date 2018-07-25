package Order;

public class ItemCategory {
    private ItemType itemType;
    private Items item;
    private BeverageCategory getBeverageCategory;


    public ItemCategory(ItemType itemType, Items item) {
        this.itemType = itemType;
        this.item = item;
    }

    public ItemType getItemType() {
        return itemType;
    }


    public Items getItem() {
        return item;
    }

    public BeverageCategory getBeverageCategory(BeverageCategory beverageCategory) {
        return beverageCategory;
    }

    BeverageCategory getBeverageCategory() {

        return getBeverageCategory;
    }
}



