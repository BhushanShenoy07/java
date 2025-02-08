public class SalesAnalysis {
    public static void main(String[] args) {
        int[] sales = {120, 300, 150, 600, 500, 700, 650};
        int highestDay = getHighestSalesDay(sales);
        System.out.println("Day " + highestDay + " had the highest sales with " + sales[highestDay - 1] + " units.");
    }

    public static int getHighestSalesDay(int[] sales) {
        if (sales == null || sales.length == 0) {
            throw new IllegalArgumentException("Sales data cannot be empty");
        }

        int maxSales = sales[0];
        int day = 1; // Day starts at 1 instead of index 0

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                day = i + 1; // Convert 0-based index to 1-based day
            }
        }

        return day;
    }
}
