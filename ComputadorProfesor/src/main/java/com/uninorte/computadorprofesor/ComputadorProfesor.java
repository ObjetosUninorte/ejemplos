/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.uninorte.computadorprofesor;

import java.util.ArrayList;

/**
 *
 * @author augustosalazar
 */
public class ComputadorProfesor {

    private ArrayList<Card> cards = new ArrayList<>();
    private AcceleratorCard acceleratorCard;
    private Cache cache;

    public ComputadorProfesor(AcceleratorCard acceleratorCard, Cache cache) {
        this.acceleratorCard = acceleratorCard;
        this.cache = cache;
    }

    public static void main(String[] args) {
        ComputadorProfesor machine = new ComputadorProfesor(new AcceleratorCard(), new Cache());
        machine.addDeviceCard(0);
        machine.addExtensionCard(1);
        machine.addExtensionCard(2);
        machine.addDeviceCard(3);//should fail
        machine.addCard2ExtensionCard(machine.getCardById(0), new DeviceCard(4));//should fail
        machine.addCard2ExtensionCard(machine.getCardById(1), new DeviceCard(4));
        machine.addCard2ExtensionCard(machine.getCardById(1), new DeviceCard(5));
        machine.addCard2ExtensionCard(machine.getCardById(1), new ExtensionCard(6));
        machine.addCard2ExtensionCard(machine.getCardById(6), new DeviceCard(7));

        System.out.println("The layout of cards is the following");
        machine.printCardLayout();

    }

    public void addCard2ExtensionCard(Card card, ExtensionCard newCard) {
        if (card instanceof ExtensionCard) {
            ((ExtensionCard) card).addCard(newCard);
        }
    }

    public void printCardLayout() {
        int i = 0;
        for (Card card : cards) {
            System.out.println("*************Slot " + i + "***************");
            card.print();
            i++;
        }
    }

    public void addCard2ExtensionCard(Card card, DeviceCard newCard) {
        if (card instanceof ExtensionCard) {
            ((ExtensionCard) card).addCard(newCard);
        }

    }

    public Card getCardById(int i) {
        for (Card card : cards) {
            if (card.getId() == i) {
                return card;
            }
            if (card instanceof ExtensionCard) {
                Card card2 = ((ExtensionCard) card).getCardById(i);
                if (card2 != null) {
                    return card2;
                }
            }
        }
        return null;
    }

    public void addExtensionCard(int i) {
        if (cards.size() < 3) {
            cards.add(new ExtensionCard(i));
        }
    }

    public void addDeviceCard(int i) {
        if (cards.size() < 2) {
            cards.add(new DeviceCard(i));
        }
    }

    public int getTotalCardCount() {
        int total = 0;
        for (Card card : cards) {
            if (card instanceof ExtensionCard ec) {
                total = total + ec.getTotalCardCount();
                total++;
            } else {
                total++;
            }
        }
        return total;
    }

    public int getDeviceCardCount() {
        int total = 0;
        for (Card card : cards) {
            if (card instanceof ExtensionCard ec) {
                total = total + ec.getDeviceCardCount();
            } else {
                total++;
            }
        }
        return total;
    }

    public int getExtentionCardCount() {
        int total = 0;
        for (Card card : cards) {
            if (card instanceof ExtensionCard ec) {
                total = total + ec.getExtentionCardCount();
                total++;
            }
        }
        return total;
    }
}
