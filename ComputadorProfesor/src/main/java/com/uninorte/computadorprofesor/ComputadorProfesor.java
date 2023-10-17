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

    public static void main(String[] args) {
        ComputadorProfesor machine = new ComputadorProfesor();
        	machine.addDeviceCard(0);
        	machine.addExtensionCard(1);
        	machine.addExtensionCard(2);
        	machine.addDeviceCard(3);//should fail
        	machine.addCard2ExtensionCard(machine.getCardById(0),new DeviceCard(4));//should fail
       	    machine.addCard2ExtensionCard(machine.getCardById(1),new DeviceCard(4));
       	    machine.addCard2ExtensionCard(machine.getCardById(1),new DeviceCard(5));
        	machine.addCard2ExtensionCard(machine.getCardById(1),new ExtensionCard(6));
        	machine.addCard2ExtensionCard(machine.getCardById(6),new DeviceCard(7));

        	System.out.println("The layout of cards is the following");
       	machine.printCardLayout();

    }

    private void addCard2ExtensionCard(Card card, ExtensionCard newCard) {
        if (card instanceof ExtensionCard){
            ((ExtensionCard) card).addCard(newCard);
        }
    }

    private void printCardLayout() {
        int i = 0;
        for (Card card : cards) {
            System.out.println("*************Slot "+i+"***************");
            card.print();
             i++;
        }
    }

    private void addCard2ExtensionCard(Card card, DeviceCard newCard) {
        if (card instanceof ExtensionCard){
            ((ExtensionCard) card).addCard(newCard);
        } 
        
    }

    private Card getCardById(int i) {
        for (Card card : cards) {
            if (card.getId() == i){
                return card;
            }
            if (card instanceof ExtensionCard){
                Card card2 = ((ExtensionCard) card).getCardById(i);
                if (card2 != null){
                    return card2;
                }
            }
        }
        return null;
    }

    private void addExtensionCard(int i) {
        if (cards.size() < 3){
            cards.add(new ExtensionCard(i));
        }
    }

    private void addDeviceCard(int i) {
        if (cards.size() < 2){
            cards.add(new DeviceCard(i));
        }
    }
}
