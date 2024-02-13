package com.tms.lesson9_hw.task3.objects.card;

import com.tms.lesson9_hw.task3.objects.BaseCard;

import static com.tms.lesson9_hw.task3.constant.CommissionLimit.VISA_COMMISSION;
import static com.tms.lesson9_hw.task3.constant.TransferLimits.VISA_CARD_LIMIT;

public class VisaCard extends BaseCard {
    public VisaCard(String cardNum, int cvv, double balance, int currencyCode, String cardID) {
        super(cardNum, cvv, balance, currencyCode, cardID);
        this.commission = VISA_COMMISSION;
        this.limits = VISA_CARD_LIMIT;
    }


}
