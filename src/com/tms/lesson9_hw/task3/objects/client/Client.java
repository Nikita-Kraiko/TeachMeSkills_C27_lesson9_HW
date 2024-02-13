package com.tms.lesson9_hw.task3.objects.client;

import com.tms.lesson9_hw.task3.objects.BaseCard;
import com.tms.lesson9_hw.task3.service.TransferService;

import java.util.Objects;

public class Client {
    protected String name;
    protected String surname;
    protected String passNum;
    protected String date;
    protected Address address;
    protected BaseCard[] cards;

    public Client(String name, String surname, String passNum,
                  String date, Address address, BaseCard[] baseCards) {
        this.name = name;
        this.surname = surname;
        this.passNum = passNum;
        this.date = date;
        this.address = address;
        this.cards = baseCards;

    }

    public void showInformation() {
        System.out.println(name + " " + surname);
        for (int i = 0; i < cards.length; i++) {
            System.out.println("Number of card: " + cards[i].getCardID()
                    + " amount on account: " + cards[i].getBalance());
        }
    }

    public void transfer(String cardID1, String cardID2, double amount) {
        if (!Objects.equals(cardID1, cardID2)) {
            TransferService transferService = new TransferService();
            transferService.transferFromTo(cards, amount, cardID1, cardID2);
        }else {
            System.out.println("Error. Same cards");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BaseCard[] getBaseCard() {
        return cards;
    }

    public void setCards(BaseCard[] baseCard) {
        this.cards = baseCard;
    }
}
