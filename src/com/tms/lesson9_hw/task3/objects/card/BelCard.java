package com.tms.lesson9_hw.task3.objects.card;

import com.tms.lesson9_hw.task3.objects.BaseCard;

import static com.tms.lesson9_hw.task3.constant.CommissionLimit.BEL_COMMISSION;
import static com.tms.lesson9_hw.task3.constant.TransferLimits.BEL_CARD_LIMIT;

public class BelCard extends BaseCard {
    public BelCard(String cardNum, int cvv, double balance, int currencyCode, String cardID) {
        super(cardNum, cvv, balance, currencyCode, cardID);
        this.commission = BEL_COMMISSION;
        this.limits = BEL_CARD_LIMIT;

    }



}
