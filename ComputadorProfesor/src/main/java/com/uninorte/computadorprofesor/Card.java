package com.uninorte.computadorprofesor;

public class Card {
    private int id;
    private Card extensionCard;

    public Card(int id) {
        this.id = id;
    }

    public void addExtensionCard(ExtensionCard card) {
        this.extensionCard = card;
    }

    public int getId() {
        return id;
    }

    public void print(){
        System.out.println("Card " + getId());
    }
}
