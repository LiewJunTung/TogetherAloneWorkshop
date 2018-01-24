package org.gdgkl.speeddating.models;

/**
 * Created by pandawarrior on 24/01/2018.
 */

public abstract class Person {
    private String name;
    private int age;
    private String hobby;
    private String phoneNumber;

    private String favouriteMovie;
    private boolean likesHistory;
    private boolean likesDog;
    private int score;

    public Person(String name, int age, String hobby, String phoneNumber, String favouriteMovie, boolean likesHistory, boolean likesDog, int initialScone) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.phoneNumber = phoneNumber;
        this.favouriteMovie = favouriteMovie;
        this.likesHistory = likesHistory;
        this.likesDog = likesDog;
        this.score = initialScone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public boolean isLikesHistory() {
        return likesHistory;
    }

    public boolean isLikesDog() {
        return likesDog;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", favouriteMovie='" + favouriteMovie + '\'' +
                ", likesHistory=" + likesHistory +
                ", likesDog=" + likesDog +
                ", score=" + score +
                '}';
    }
}
