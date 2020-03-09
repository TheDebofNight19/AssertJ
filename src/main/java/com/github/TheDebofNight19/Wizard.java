package com.github.TheDebofNight19;
import java.util.Set;

public class Wizard
{
    private String name;
    private String house;
    private int age;
    private Set <String> wands;

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getAge() {
        return age;
    }

    public Set<String> getWands() {
        return wands;
    }

    public Wizard() {
    }

    public Wizard(String name, String house, int age, Set<String> wands) {
        this.name = name;
        this.house = house;
        this.age = age;
        this.wands = wands;
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
