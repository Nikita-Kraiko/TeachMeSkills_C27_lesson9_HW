package com.tms.lesson9_hw.task3.service;

import com.tms.lesson9_hw.task3.objects.BaseCard;
import com.tms.lesson9_hw.task3.objects.card.BelCard;
import com.tms.lesson9_hw.task3.objects.card.MasterCard;
import com.tms.lesson9_hw.task3.objects.card.VisaCard;

import static com.tms.lesson9_hw.task3.constant.CurrencyCode.*;
import static com.tms.lesson9_hw.task3.constant.CurrencyCode.USD;

public class CardMaker {
    public static BaseCard[] makeCards(){
        BaseCard belCard1 = new BelCard("1111-1111-1111-1111", 111, 1000, BYN, "A001");
        BaseCard belCard2 = new BelCard("1111-1111-1111-1112", 112, 2000, BYN, "A011");
        BaseCard visa1 = new VisaCard("2000-1111-1111-1111", 315, 8000, EUR, "B101");
        BaseCard visa2 = new VisaCard("2000-1111-1111-1112", 834, 714.4, EUR, "B111");
        BaseCard masterCard1 = new MasterCard("5351-1111-1111-1111", 717, 2300, USD, "K111");
        BaseCard masterCard2 = new MasterCard("5351-1111-1111-1112", 114, 350.5, USD, "K112");
        BaseCard[] baseCards = new BaseCard[]{belCard1, belCard2, visa1, visa2, masterCard1, masterCard2};
        return baseCards;
    }
}
