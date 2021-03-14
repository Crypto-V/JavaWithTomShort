package oop.practiceWithMosh.class2.interfaces;

public abstract class AbstractTaxCalculator
        implements TaxCalculator{

    protected double getTaxincome(double income,double expense){
        return income-expense;
    }
}
