package Order;

import javax.print.PrintService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {
    private Map<BeverageCategory, Integer> tax;
    private Map<ItemCategory, Integer> priceCard;
    private int total;

    public Map<ItemCategory, Integer> getPriceCard() {
        return priceCard;
    }

    public OrderService(Map<BeverageCategory, Integer> tax, Map<ItemCategory, Integer> priceCard) {
        this.tax = tax;
        this.priceCard = priceCard;
    }

    public Map<BeverageCategory, Integer> getTax() {
        return tax;
    }

    int getUserBill(String input)
    {
        InputService input = new InputService();
        List<ItemCategory> selectedItems = InputService.getSelectedItems(price,input);
        total = getPriceOf(selectedItems);
        return total;
    }


    int getPriceOf(List<ItemCategory> items) {
        int totalPrice = 0;
        int totalTax = 0;
        int totalNet = 0;

        List<OrderedItems> orderedItems = new ArrayList<>();

        for (ItemCategory item : selectedItems) {
            BeverageCategory beverageCategory = item.getBeverageCategory();
            totalPrice += price.get(item);
            totalTax += (((double) tax.get(beverageCategory)) / 100) * price.get(item);

            if (selectedItems(items.getItem(), orderedItems)) {
                int i = getItemIndex(items.getItem(), orderedItems);
                orderedItems.get(i).setQuantity();
            } else {
                orderedItems.add(new OrderedItems(item.getItem(), 1, price.get(item)));
            }
        }

        totalTax = Math.round(totalTax);
        net = totalPrice + totalTax;

        PrintService printService = new PrintService();
        printService.printBill(orderedItems, totalPrice, totalTax, net);
        return net;
    }






