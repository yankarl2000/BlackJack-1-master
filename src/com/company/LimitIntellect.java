package com.company;

/**
 * Created by falyanguzov on 21.11.2016.
 */
public class LimitIntellect extends Intellect {
    private int limit;

    public LimitIntellect(int limit) {
        this.limit = limit;
    }

    @Override
    public Command decide(int score) {
        if(score<limit)
            return Command.HIT;
        else
            return Command.STAND;
    }
}
