package pl.altkom;

import java.util.ArrayList;
import java.util.List;

public class Writer {
    private String name;
    private Nationality nationality;
    private Gender gender;
    private double rank;

    public Writer(String name, Nationality nationality, Gender gender, double rank) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", nationality=" + nationality +
                ", gender=" + gender +
                ", rank=" + rank +
                '}';
    }

    public static List<Writer> generateListOfWriters() {
        List<Writer> result = new ArrayList<>();
        result.add(new Writer("Adam Mickiewicz", Nationality.POLISH,  Gender.MALE,5.0));
        result.add(new Writer("Maria Konopnicka", Nationality.POLISH, Gender.FEMALE, 3.0));
        result.add(new Writer("William Shakespeare", Nationality.ENGLISH, Gender.MALE,4.5));
        result.add(new Writer("Agatha Christie", Nationality.ENGLISH, Gender.FEMALE, 2.5));
        result.add(new Writer("Dante Aligheri", Nationality.ITALIAN, Gender.MALE, 3.5));
        result.add(new Writer("Charlotte Link", Nationality.GERMAN, Gender.FEMALE, 5.5));
        return result;
    }
}
