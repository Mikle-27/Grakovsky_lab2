package ru.mirea.gib04.lab2;

import java.lang.*;
public class Author {
    private String author;
    private int page;
    private String name;
    public Author(String s, int i, String s1) {
        author = "Alexandr Pushkin";
        name = "Evgeniy Onegin";
        page = 200;
    }
    public Author(int p) {
        author = "Nikolai Gogol";
        name = "Viy";
        page = p;
    }
    public Author(int p, String n) {
        author = "Fedor Dostaevsky";
        name = n;
        page = p;
    }
    public String getAuthor() { return author; }
    public int getPage() { return page; }
    public String getName() { return name; }
}