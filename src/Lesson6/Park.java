package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttractions(String attractionName, String hoursWorking, int cost) {
        attractions.add(new Attraction(attractionName, hoursWorking, cost));
    }

    public void allAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    private static class Attraction {
        private final String attractionName;
        private final String hoursWorking;
        private final int cost;

        public Attraction(String attractionName, String hoursWorking, int cost) {
            this.attractionName = attractionName;
            this.hoursWorking = hoursWorking;
            this.cost = cost;


        }
    }
}