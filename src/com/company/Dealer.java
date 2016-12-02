package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */

public class Dealer extends Computer {
    private Deck deck = new Deck();

    public Dealer() {
        super("Dealer",new DealerIntellect());
    }

    public void deal(Player player) {
        Card current = deck.pop();
        player.take(current);
    }
}
