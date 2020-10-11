package ru.mirea.gib04.lab2;

import java.lang.*;
public class Ball {
    private String color;
    private int weight;
    public Ball() {
        color = "orange";
        weight = 7;
    }
    public Ball(int w) {
        color = "purple";
        weight = w;
    }
    public Ball(int w, String c) {
        color = c;
        weight = w;
    }
    public int getWeight() { return weight; }
    public String getColor() { return color; }
}