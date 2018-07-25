package Order;

class OrderedItems extends ItemCategory {
    private Items item;
    private int Quantity;
    private int price;

    public Items ItemCategory()
    {
        this(itemType, item);
        return item;
    }

    public OrderedItems(Items item, int quantity, int price) {
        this.item = item;
        this.Quantity = quantity;
        this.price = price;
    }



    public Items getItem() {
        return item;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity++;
    }

    public int getPrice() {
        return price;
    }


    public void setQuantity() {

    }
}

