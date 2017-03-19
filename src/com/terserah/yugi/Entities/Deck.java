/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terserah.yugi.Entities;

/**
 *
 * @author muhfai
 */
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();
    public final static int MAX_DECK_SIZE = 30;
    public final static int MIN_DECK_SIZE = 20;
    int numCardsRemaining;

    public Deck(){
        numCardsRemaining = 0;
    }

    public Deck(ArrayList<Card> initialDeck){
        for(int i = 0; i < initialDeck.size(); i++){
            deck.add(initialDeck.get(i));
        }
        numCardsRemaining = deck.size();
        shuffle();
    }

    public void shuffle(){
        ArrayList<Card> tempDeck = new ArrayList<Card>();
        Random random = new Random();
        while(deck.size() > 0){
            int cardToRemove = random.nextInt(deck.size());
            Card tempCard = deck.get(cardToRemove);
            deck.remove(cardToRemove);
            tempDeck.add(tempCard);
        }
        while(tempDeck.size() > 0){
            Card tempCard = tempDeck.get(0);
            tempDeck.remove(0);
            deck.add(tempCard);
        }
    }

    public Card draw(){
        Card toDraw = deck.get(0);
        deck.remove(0);
        return toDraw;
    }

    public int getNumCardsRemaining(){
        return numCardsRemaining;
    }

    public void addToBottom(Card c){
        deck.add(c);
    }

    public void addToTop(Card c){
        deck.add(0, c);
    }

    public void addToDeck(Card c){
        deck.add(c);
        shuffle();
    }

    public int getSize(){
        return deck.size();
    }

    public Card get(int index){
        return deck.get(index);
    }
}
