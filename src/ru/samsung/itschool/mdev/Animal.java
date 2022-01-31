package ru.samsung.itschool.mdev;

public class Animal implements Comparable<Animal>{
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }
}
