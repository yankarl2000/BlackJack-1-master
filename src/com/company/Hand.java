package com.company;

import java.util.LinkedList;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public class Hand extends LinkedList<Card> {
    public int getScore() {
        int sum = 0;
        for(Card c: this)
            sum += c.getScore();
        return sum;
    }
}
