package com.tms.lesson9_hw.task3.objects;

public abstract class BaseCard {
    protected String cardNum;
    protected String cardID;
    protected int cvv;
    protected double balance;
    protected int currencyCode;
    protected double commission;
    protected int limits;

    public BaseCard(String cardNum, int cvv, double balance, int currencyCode, String cardID) {
        this.cardNum = cardNum;
        this.cardID = cardID;
        this.cvv = cvv;
        this.balance = balance;
        this.currencyCode = currencyCode;

    }


    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getLimits() {
        return limits;
    }

    public void setLimits(int limits) {
        this.limits = limits;
    }
}
