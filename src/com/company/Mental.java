package com.company;

public class Mental extends Player implements AbilityType {
    @Override
    public void abilityType () {
        System.out.println("Warrior applied AbilityType");
    }
}