package com.company;

/**
 * Created by student1 on 02.12.16.
 */
public class NameComp {
    NamesComp namescomp;

    public NameComp(int i, NamesComp namescomp) {
        if(i<2) {
            this.namescomp = namescomp;
        }

    }
    @Override

    public String toString() {
        return namescomp;
    }

}
