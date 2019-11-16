package pl.altkom.zad12_1;

public class PrepaidPhone {
    private int limit;

    public PrepaidPhone(int limit) {
        this.limit = limit;
    }

    public void makeCall(int duration) throws PrepaidPhoneException {

        if (this.limit >= duration) {
            this.limit -= duration;
            System.out.println("Nice talk");
        } else throw new PrepaidPhoneException("Limit minut przekroczony");
    }
}
