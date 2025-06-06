
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int convertedMoneyToCents = this.euros * 100 + this.cents;
        int convertedComapareMoneyToCents = compared.euros * 100 + compared.cents;
        return (convertedComapareMoneyToCents >= convertedMoneyToCents) ? true : false;
    }

    public Money minus(Money decreaser) {
        int convertedMoneyToCents = this.euros * 100 + this.cents;
        int convertedDecreaserMoneyToCents = decreaser.euros * 100 + decreaser.cents;
        int sum = convertedMoneyToCents - convertedDecreaserMoneyToCents;

        if (sum > 0) {
            int euros = sum / 100;
            int cents = sum % 100;
            Money newMoney = new Money(euros, cents);
            return newMoney;
        } else {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
