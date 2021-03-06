import java.math.BigDecimal;

public class Calculator {

    private BigDecimal sum;

    public BigDecimal addTwoNumbers(BigDecimal x, BigDecimal y){
        this.sum = x.add(y);
        return this.sum;
    }
    public BigDecimal substractTwoNumbers(BigDecimal x, BigDecimal y){
        this.sum = x.subtract(y);
        return this.sum;
    }
    public BigDecimal getSum() {
        return this.sum;
    }
}
