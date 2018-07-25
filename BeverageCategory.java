package Order;

public class BeverageCategory {
    private BeverageType beverageType;
    private ItemType itemType;

    public BeverageCategory(BeverageType beverageType, ItemType itemType) {
        this.beverageType = beverageType;
        this.itemType = itemType;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public ItemType getItemType() {
        return itemType;
    }
}


