package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal() {
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public int getNumberOfPaws() {
        return numberOfPaws;
    }
    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }


    public boolean isHasFur() {
        return hasFur;
    }
    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        setColor(color);
        setNumberOfPaws(numberOfPaws);
        setHasFur(hasFur);
    }

    public String getDescription() {
        String fur = isHasFur() ? "a" : "no";
        String paws = getNumberOfPaws() == 1 ? "paw" : "paws";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + paws + " and " + fur + " fur.";
    }
}
