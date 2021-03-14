package oop.practiceWithMosh.class2.interfaces;

public class TaxCalculator2018
        extends AbstractTaxCalculator
        implements TaxCalculator{

    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        getTaxincome(2,1);
        return taxableIncome * 0.3;
    }
}
