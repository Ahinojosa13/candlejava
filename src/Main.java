// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Create objects
        Candle candle1 = new Candle("Soothing Lavender", 2, 5, 0.50, 10.99);
        Candle candle2 = new Candle("Fresh Linen", 1, 7, 0.40, 7.99);
        Candle candle3 = new Candle("Warm Vanilla", 3, 6, 0.60, 14.99);
//        System.out.println();
        /*Luscious Lavender
Amount: 3
Burn Time: 5 hours
Dollar per Burn Time: 1.50
Price: $7.50 */

        System.out.println("Candle 1: ");
        System.out.println(candle1.getName());
        System.out.println("Amount:" + candle1.getQuantity());
        System.out.println("Burn Time: " + candle1.getBurnTime());
        System.out.println("Price: $" + candle1.getPrice());
        System.out.println();

        System.out.println("Candle 2: ");
        System.out.println(candle2.getName());
        System.out.println("Amount:" + candle2.getQuantity());
        System.out.println("Burn Time: " + candle2.getBurnTime());
        System.out.println("Price: $" + candle2.getPrice());
        System.out.println();

        System.out.println("Candle 3: ");
        System.out.println(candle3.getName());
        System.out.println("Amount:" + candle3.getQuantity());
        System.out.println("Burn Time: " + candle3.getBurnTime());
        System.out.println("Price: $" + candle3.getPrice());
        System.out.println();

    }
}