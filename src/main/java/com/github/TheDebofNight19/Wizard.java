package com.github.TheDebofNight19;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Wizard
{
    private String name;
    private String house;
    private int age;
    private BigDecimal goldInherited;
    private HashMap<Integer,String> wands;

    public Wizard(String name, String house, int age, BigDecimal goldInherited, HashMap<Integer, String> wands) {
        this.name = name;
        this.house = house;
        this.age = age;
        this.goldInherited = goldInherited;
        this.wands = wands;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getGoldInherited() {
        return goldInherited;
    }

    public HashMap<Integer, String> getWands() {
        return wands;
    }
}
