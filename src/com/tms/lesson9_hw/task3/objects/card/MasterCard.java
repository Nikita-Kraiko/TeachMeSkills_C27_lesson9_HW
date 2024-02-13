package com.tms.lesson9_hw.task3.objects.card;

import com.tms.lesson9_hw.task3.objects.BaseCard;

import static com.tms.lesson9_hw.task3.constant.CommissionLimit.MASTER_COMMISSION;
import static com.tms.lesson9_hw.task3.constant.TransferLimits.MASTER_CARD_LIMIT;


public class MasterCard extends BaseCard {
    public MasterCard(String cardNum, int cvv, double balance, int currencyCode, String cardID) {
        super(cardNum, cvv, balance, currencyCode, cardID);
        this.commission = MASTER_COMMISSION;
        this.limits = MASTER_CARD_LIMIT;
    }


}
