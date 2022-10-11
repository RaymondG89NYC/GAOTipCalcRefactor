import java.util.Scanner;
import java.lang.Math;
public class TipCalculatorRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the tip tip calculator!");
        System.out.println("How many people are in your group?");
        int numOfPeople = input.nextInt();
        System.out.println("What's the tip amount in decimals? (0 - 1):");
        double tipAmount = input.nextDouble();
        TipCalculator tipCalculator = new TipCalculator(numOfPeople,tipAmount);
        double mealCost = 0;
        while (mealCost != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g.12.50 (-1 to end): ");
            mealCost = input.nextDouble();
            tipCalculator.addMeal(mealCost);
            if (mealCost == -1){
                tipCalculator.addMeal(1);
            };
        }

        //rounding the variables (I searched this up on google, I don't know a simpler way to round variables
        double totalBillBeforeTip = Math.round(tipCalculator.getTotalBillBeforeTip()*100);
        totalBillBeforeTip /= 100;
        double tipPercentage = Math.round(tipCalculator.getTipPercentage()*100);
        tipPercentage /= 100;
        double theTipAmount = Math.round(tipCalculator.tipAmount()*100);
        theTipAmount /= 100;
        double totalBill = Math.round(tipCalculator.totalBill()*100);
        totalBill /= 100;
        double personCostBeforeTip = Math.round(tipCalculator.perPersonCostBeforeTip()*100);
        personCostBeforeTip /= 100;
        double personTipAmount = Math.round(tipCalculator.perPersonTipAmount()*100);
        personTipAmount /= 100;
        double personTotalCost = Math.round(tipCalculator.perPersonTotalCost()*100);
        personTotalCost /= 100;

        System.out.println("-----------------------------");
        System.out.println("Total Bill Before Tip: " + totalBillBeforeTip);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + theTipAmount);
        System.out.println("Total Bill With Tip: " + totalBill);
        System.out.println("Per Person Cost Before Tip: " + personCostBeforeTip);
        System.out.println("Tip Per Person: " + personTipAmount);
        System.out.println("Total Cost Per Person: " + personTotalCost);

    }
}
