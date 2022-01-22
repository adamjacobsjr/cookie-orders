package cookies;

public class CookieOrder {
    private String varietyOfCookies;
    private int numberOfBoxes;

    public CookieOrder(String varietyOfCookies, int numberOfBoxes) {
        this.varietyOfCookies = varietyOfCookies;
        this.numberOfBoxes = numberOfBoxes;
    }

    public String getVarietyOfCookies() {
        return varietyOfCookies;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }
}