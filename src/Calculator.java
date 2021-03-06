public class Calculator {

    private Double sum;

    public Double addTwoNumbers(Double x, Double y){
        this.sum = x+y;
        return this.sum;
    }
    public Double substractTwoNumbers(Double x, Double y){
        this.sum = x-y;
        return this.sum;
    }
    public Double getSum() {
        return this.sum;
    }
}
