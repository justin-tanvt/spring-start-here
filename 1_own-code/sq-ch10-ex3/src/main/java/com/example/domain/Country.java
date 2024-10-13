package com.example.domain;

import java.util.List;

public class Country {
    private String name;
    private int population;
    private List<String> letters;

    public static Country of (
            String name,
            int population) {
        Country c = new Country();
        c.setName(name);
        c.setPopulation(population);
        c.setLetters(List.of(name.split("")));

        return c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<String> getLetters() {
        return letters;
    }

    public void setLetters(List<String> letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", letters=" + letters +
                '}';
    }
}
