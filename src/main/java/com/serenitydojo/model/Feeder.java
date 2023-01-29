package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")){
            return (isPremium)?  "Salmon" : "Tuna";
        } else if(animal.equals("Hamster")){
            return (isPremium)?  "Lettuce" : "Cabbage";
        }else if (animal.equals("Dog")){
            return (isPremium)?  "DeluxeDogFood" : "Dog Food";
        }
        return "The expected animal is not found";
    }
}
