package com.tms.lesson9_hw.task3.service;

import com.tms.lesson9_hw.task3.constant.CurrencyCode;
import com.tms.lesson9_hw.task3.constant.ExchangeConst;
import com.tms.lesson9_hw.task3.objects.BaseCard;

public class TransferService {
    public void transferFromTo(BaseCard[] baseCards, double amount, String cardID1, String cardID2) {
        BaseCard card1 = null;
        BaseCard card2 = null;
        for (BaseCard card : baseCards){
            if (card.getCardID().equals(cardID1)){
                card1 = card;
            }
            if (card.getCardID().equals(cardID2)){
                card2 = card;
            }
        }


        if (amount > card1.getLimits()) {
            System.out.println("Error. Try again.");
        } else {
            System.out.println(" num of card: " + card1.getCardID() + " balance: " + card1.getBalance());
            double newCard1Balance = card1.getBalance() - amount - (amount * card1.getCommission())/100;
            card1.setBalance(newCard1Balance);
            System.out.println("Transfer: " + amount);

            if (card1.getCurrencyCode() == card2.getCurrencyCode()) {
                System.out.println("Same currency");
            } else if ((card1.getCurrencyCode() == CurrencyCode.BYN) && (card2.getCurrencyCode() == CurrencyCode.USD)) {
                amount *= 1 / (ExchangeConst.USD_TO_BYN);
                System.out.println("Currency cardTo: USD");
            } else if ((card1.getCurrencyCode() == CurrencyCode.BYN) && (card2.getCurrencyCode() == CurrencyCode.EUR)) {
                amount *= 1 / (ExchangeConst.EUR_TO_BYN);
                System.out.println("Currency cardTo: EUR");
            } else if ((card1.getCurrencyCode() == CurrencyCode.USD) && (card2.getCurrencyCode() == CurrencyCode.BYN)) {
                amount *= ExchangeConst.USD_TO_BYN;
                System.out.println("Currency cardTo: BYN");
            } else if ((card1.getCurrencyCode() == CurrencyCode.USD) && (card2.getCurrencyCode() == CurrencyCode.EUR)) {
                amount *= 1 / (ExchangeConst.EUR_TO_USD);
                System.out.println("Currency cardTo: EUR");
            } else if ((card1.getCurrencyCode() == CurrencyCode.EUR) && (card2.getCurrencyCode() == CurrencyCode.BYN)) {
                amount *= ExchangeConst.EUR_TO_BYN;
                System.out.println("Currency cardTo: BYN");
            } else if ((card1.getCurrencyCode() == CurrencyCode.EUR) && (card2.getCurrencyCode() == CurrencyCode.USD)) {
                amount *= ExchangeConst.EUR_TO_USD;
                System.out.println("Currency cardTo: USD");
            }




            double newCard2Balance = card2.getBalance() + amount;
            card2.setBalance(newCard2Balance);
            System.out.println(" num of card: " + card2.getCardID() + " balance: " + card2.getBalance());
        }
    }
}
