package pl.altkom.zad12_1;

public class Test {
    public static void main(String[] args) throws PrepaidPhoneException {
        PrepaidPhone phone = new PrepaidPhone(10);
        phone.makeCall(5);
        phone.makeCall(6);

    }
}
