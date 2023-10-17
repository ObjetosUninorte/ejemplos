package com.uninorte.computadorprofesor;

import java.util.ArrayList;

public class ExtensionCard extends Card {

    private ArrayList<Card> cards = new ArrayList<>();

    public ExtensionCard(int id) {
        super(id);
       
    }

    public void addCard(Card card) {
        if (cards.size() < 3){
            this.cards.add(card);
            card.addExtensionCard(this);
        }
    }

    public Card getCardById(int i) {
        for (Card card : cards) {
            //System.out.println("Looking in EC "+getId()+" for "+i);
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


    public void print(){
        System.out.println("ExtensionCard " + getId());
        if (cards.isEmpty()){
            System.out.println("Empty");
            return;
        }
        for(int i=0; i< cards.size();i++){
            System.out.println("*************ExtensionCard "+getId()+" on slot "+i+"***************");
            cards.get(i).print();
        }
        
   }


}
