
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;
        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Money)) {
            return false;
        }

        Money compareMoney = (Money) compared;

        if (this.euros < compareMoney.euros) {
            return true;
        }

        if (this.euros == compareMoney.euros && this.cents < compareMoney.cents) {
            return true;
        }

        return false;

    }

    public Money minus(Money decreaser) {
        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;

        if (totalEuros < 0) {
            return new Money(0, 0);
        }

        if (totalCents < 0) {
            totalEuros -= 1;
            totalCents += 100;
        }
        
        return new Money(totalEuros, totalCents); 
//        
//        if (totalEuros >= 0){
//            if (totalCents < 0){
//                totalEuros -= 1; 
//                totalCents += 100; 
//            }
//        } else {
//            totalEuros = 0; 
//            totalCents = 0; 
//        }

//        Money newMoney = new Money(totalEuros, totalCents);
//        return newMoney;
    }

}
