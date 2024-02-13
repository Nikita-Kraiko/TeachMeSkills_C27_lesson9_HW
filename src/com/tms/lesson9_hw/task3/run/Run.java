package com.tms.lesson9_hw.task3.run;

import com.tms.lesson9_hw.task3.objects.BaseCard;
import com.tms.lesson9_hw.task3.objects.card.BelCard;
import com.tms.lesson9_hw.task3.objects.card.MasterCard;
import com.tms.lesson9_hw.task3.objects.card.VisaCard;
import com.tms.lesson9_hw.task3.objects.client.Address;
import com.tms.lesson9_hw.task3.objects.client.Client;
import com.tms.lesson9_hw.task3.service.CardMaker;
import com.tms.lesson9_hw.task3.service.TransferService;

import static com.tms.lesson9_hw.task3.constant.CurrencyCode.*;

public class Run {
    public static void main(String[] args) {
        Address address = new Address("Country", "City", "Street", "37/70", 220000);
        Client client = new Client("Name", "Surname", "passNum", "01.01.0001", address, CardMaker.makeCards());
        client.showInformation();
        System.out.println("---------------");
        client.transfer("A001","A011",200);
        client.transfer("A011","B111",200);
        client.transfer("K111","A001",730.5);
        client.transfer("B111","K112",200);
        System.out.println("-------------------");
        client.showInformation();
    }
}
