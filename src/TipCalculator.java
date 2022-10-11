public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0;
    }
    //getter method that returns the totalBillBeforeTip instance variable
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }
    //getter method that returns the tipPercentage instance variable
    public double getTipPercentage(){
        return tipPercentage*100;
    }
    //method that increments totalBillBeforeTip by cost and returns no value
    public void addMeal(double cost){
        totalBillBeforeTip+=cost;
    }
    //method that calculates and returns a double representing the total tip amount added to the bill
    public double tipAmount(){
        return totalBillBeforeTip*tipPercentage;
    }
    //method that calculates and returns a double representing the group’s total bill including tip
    public double totalBill(){
        return tipAmount()+totalBillBeforeTip;
    }
    //method that calculates and returns a double representing the per person cost before tip
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip/numPeople;
    }
    //method that calculates and returns a double representing the per person tip amount
    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }
    //method that calculates and returns a double representing the total cost per person
    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }

}
