package main.java.entity.Creature;

import main.java.entity.Entity;

public abstract class Creature extends Entity {
    private int speed; // сколько клеток может пройти за 1 ход
    private int health; // количество HP

    public Creature(int rows, int cols, int speed, int health) {
        super(rows, cols);
        this.speed = speed;
        this.health = health;
    }

    abstract void makeMove(); //сделать ход
}
//    Абстрактный класс, наследуется от Entity.
//    Существо, имеет скорость (сколько клеток может пройти за 1 ход), количество HP.
//    Имеет абстрактный метод makeMove() - сделать ход.
//    Наследники будут реализовывать этот метод каждый по-своему.
//    public final static String[] CARNIVORE = {"\uD83D\uDC05", "\uD83D\uDC0A", "\uD83D\uDC3A"};
//    public final static String[] HERBIVORE = {"\uD83D\uDC18", "\uD83D\uDC10", "\uD83D\uDC07"};