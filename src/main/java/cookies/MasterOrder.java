package cookies;

import java.util.ArrayList;

public class MasterOrder {

    ArrayList<CookieOrder> orders = new ArrayList<>();

    public MasterOrder() {
    }

    public ArrayList<CookieOrder> getOrders() {
        return orders;
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : orders) {
            total += order.getNumberOfBoxes();
        }
        return total;
    }

    public void removeVariety(String variety) {
        for (int i = orders.size() - 1; i >= 0 ; i--) {
            if (orders.get(i).getVarietyOfCookies().equals(variety)) {
                orders.remove(i);
            }
        }
    }

    public int getVarietyBoxes(String variety) {
        int totalOfVariety = 0;
        for (CookieOrder oneOrder : orders) {
            if (oneOrder.getVarietyOfCookies().equals(variety)) {
                totalOfVariety += oneOrder.getNumberOfBoxes();
            }
        } return totalOfVariety;

    }

    public void showOrder() {
        for (CookieOrder oneOrder : orders) {
            System.out.println(oneOrder.getVarietyOfCookies() + ": " + oneOrder.getNumberOfBoxes());
        }
    }
}