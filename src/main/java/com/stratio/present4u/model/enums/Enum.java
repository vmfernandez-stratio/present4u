package com.stratio.present4u.model.enums;

public enum Enum {
    ONE(1),
    TWO(2);

    int reference;

    Enum(int reference) {
        this.reference = reference;
    }

    public int getReference() {
        return this.reference;
    }
}
