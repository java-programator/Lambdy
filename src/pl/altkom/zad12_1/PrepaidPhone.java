package pl.altkom.zad12_1;

public class PrepaidPhone {

    private int remainingLimit;

    public PrepaidPhone(int remainingLimit) {
        this.remainingLimit = remainingLimit;
    }

    public int getRemainingLimit() {
        return remainingLimit;
    }

    public void setRemainingLimit(int remainingLimit) {
        this.remainingLimit = remainingLimit;
    }

    public void makeCall(int callTime) throws PrepaidPhoneException {
        if (callTime < this.remainingLimit) {
            setRemainingLimit(this.remainingLimit-callTime);
            System.out.println("Nice Talk!");
        } else {
            throw new PrepaidPhoneException("remaining limit is too low");
        }
    }
}
