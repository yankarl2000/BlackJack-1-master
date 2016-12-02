package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public abstract class Player {
    public Hand hand = new Hand();
    private Intellect intellect;
    String name;

    public void take(Card current) {
        hand.add(current);
    }

    public Player(String name, Intellect intellect) {
        this.intellect = intellect;
        this.name = name;
    }

    public Command decision() {
        int score = hand.getScore();
        if(score>21)
            return Command.STAND;
        return intellect.decide(score);
    }
}
