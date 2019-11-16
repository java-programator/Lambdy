package pl.altkom.zad12_1;

public class Test {
    public static void main(String[] args) {
        PrepaidPhone caller1 = new PrepaidPhone(80);

        try {
            caller1.makeCall(75);
            caller1.makeCall(15);
        } catch (PrepaidPhoneException e) {
            e.printStackTrace();
        }
    }
}
