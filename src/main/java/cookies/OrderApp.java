package cookies;

public class OrderApp {
    /*
        Add 4 orders
        Total the boxes
        List
        Remove a variety and give : how many boxes were removed
        Show the updated list*/

    public static void main(String[] args) {
        CookieOrder order1 = new CookieOrder("Thin Mints", 4);
        CookieOrder order2 = new CookieOrder("Samoas", 2);
        CookieOrder order3 = new CookieOrder("Tagalongs", 5);
        CookieOrder order4 = new CookieOrder("Lemon-Ups", 1);

        MasterOrder master = new MasterOrder();

        master.addOrder(order1);
        master.addOrder(order2);
        master.addOrder(order3);
        master.addOrder(order4);

        master.showOrder();

        master.removeVariety("Tagalongs");
        System.out.println("After removal of variety");

        master.showOrder();

        System.out.println("total orders: " + master.getOrders().size());
        System.out.println("total boxes: "+ master.getTotalBoxes());
    }
}