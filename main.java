import java.text.DecimalFormat;

class Candle {
    String name;
    int quantity;
    double burnTime;
    double price;

    Candle(String name, int quantity, double burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
    }

    double getSubtotal() {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Candle candle1 = new Candle("White ROses", 2, 8, 10.50);
        Candle candle2 = new Candle("Beach House", 6, 9, 10.75);
        Candle candle3 = new Candle("Fall Spice", 7, 10, 10.58);

        
        int totalBurnTime = (int) (candle1.burnTime * candle1.quantity +
                candle2.burnTime * candle2.quantity +
                candle3.burnTime * candle3.quantity +
                );

        double totalDollarPerBurnTime = (candle1.price + candle2.price + candle3.price) / totalBurnTime;

        double totalPrice = candle1.getSubtotal() + candle2.getSubtotal() + candle3.getSubtotal();

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);

        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // Print details for candle1, candle2, candle3 (existing candles)
        System.out.println("Candle: " + candle1.name);
        System.out.println("Amount: " + candle1.quantity);
        System.out.println("Burn Time: " + candle1.burnTime + " hours");
        System.out.println("Price: $" + candle1.price);
        // ...
        System.out.println("Candle: " + candle2.name);
        System.out.println("Amount: " + candle2.quantity);
        System.out.println("Burn Time: " + candle2.burnTime + " hours");
        System.out.println("Price: $" + candle2.price);
        // ...
        System.out.println("Candle: " + candle3.name);
        System.out.println("Amount: " + candle3.quantity);
        System.out.println("Burn Time: " + candle3.burnTime + " hours");
        System.out.println("Price: $" + candle3.price);
        // ...
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Total Burn Time: " + totalBurnTime + " hours");
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
    }
}
