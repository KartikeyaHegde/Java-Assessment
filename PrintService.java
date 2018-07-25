package Order;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintService {

    public void printpriceCard(Map<ItemCategory, Integer> priceCard) {
        int i = 1;
        for (Map.Entry item : priceCard.entrySet()) {
            ItemCategory itemCategory = (ItemCategory) item.getKey();
            BeverageCategory beverageCategory = itemCategory.getBeverageCategory();
            System.out.println(i + "" + beverageCategory.getBeverageType() + "." + beverageCategory.getItemType() + "." + itemCategory.getItemType() + item.getValue());
            i++;
        }
    }

    public int printBill(List<OrderedItems> orderdItems, int totalItemPrice, int totalTax, int net)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Select the items from catalogue separted by comma");
        int n = in.nextInt();

        System.out.println("\n Order summary");
        System.out.println("----------------");
        System.out.format("No.","Item","Quantity", "Price");
        int i=0;

        for(OrderedItems items: orderdItems ) {
            System.out.format("%3d\t%-10s\t%-10s\t%-10d\t",i+1,items.getItem(), items.getQuantity(), items.getPrice());
            i++;
          }

          S



    }



    }

