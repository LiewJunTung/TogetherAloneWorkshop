package org.gdgkl.speeddating.models;

/**
 * Created by pandawarrior on 24/01/2018.
 */

public class Girl extends Person {

    private String whoPaysTheBill;

    public Girl(String name, int age, String hobby, String phoneNumber, String favouriteMovie, boolean likesHistory, boolean likesDog, int initialScone, String whoPaysTheBill) {
        super(name, age, hobby, phoneNumber, favouriteMovie, likesHistory, likesDog, initialScone);
        this.whoPaysTheBill = whoPaysTheBill;
    }

    public String getWhoPaysTheBill() {
        return whoPaysTheBill;
    }

    public String toString() {

        return super.toString() +
                "Girl{" +
                "whoPaysTheBill='" + whoPaysTheBill + '\'' +
                '}';
    }
}
