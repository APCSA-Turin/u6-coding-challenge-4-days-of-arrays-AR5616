package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int currentTime;
        private boolean isRunning;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTraveled = 0;
            this.currentTime = 0;
            this.isRunning = true;
        }

        public int getDistanceTraveled() { // this method is required
            return distanceTraveled;
        }

        public String getName() {
            return name;
        }
        

        public void simulateSecond() { //this method is required but not tested
            if (isRunning) {
                distanceTraveled += speed; 
                currentTime++; 
                if (currentTime >= runDuration) { 
                    isRunning = false;
                    currentTime = 0; 
                }
            } else { 
                currentTime++; 
                if (currentTime >= restDuration) { 
                    isRunning = true;
                    currentTime = 0; 
                }
            }
        }
        }


    public static String simulateRace(int time, Reindeer[] reindeers) { //you will be tested on this method
        for (int t = 0; t < time; t++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond(); 
            }
        }

        Reindeer winner = reindeers[0];
        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }
        return winner.name;
    }

    
    public static void main(String[] args) { // for testing purposed
        
    }
}



