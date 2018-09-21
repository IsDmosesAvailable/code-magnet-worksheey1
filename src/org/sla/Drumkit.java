package org.sla;

class Drumkit {
    boolean topHat = true;
    boolean snare = true;


    void playSnare() {
        System.out.println("bang bang ba-bang");

        if (snare == true) {
            playSnare();
        }

    }

    void playTopHat () {
        System.out.println("ding ding da-ding");
    }
}
