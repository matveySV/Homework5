public class Car {
     double fullnessOfTheTank;
     double fuelConsumptionPer100Km;
     int yearOfTechnicalInspection;
     int currentYear;

    public Car(double fullnessOfTheTank, double fuelConsumptionPer100Km, int yearOfTechnicalInspection, int currentYear) {
        this.fullnessOfTheTank = fullnessOfTheTank;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        this.yearOfTechnicalInspection = yearOfTechnicalInspection;
        this.currentYear = currentYear;
    }


    public boolean isCarCanGo() {
        boolean result = true;
        if (fullnessOfTheTank != 0) {
            System.out.println("There is fuel in the tank. The Car can GO!!!");
            return result;
        }else {
            System.out.println("There isn't fuel in the tank");
            result = false;
        }return result;
    }

    public boolean isCarIsApprovedForOperation() {
        boolean result = true;
        if (currentYear <= (yearOfTechnicalInspection + 2)) {
            System.out.println("The technical inspection data did not exceed 2 years. The car allowed to expluatation!!!");
            return result;
        } else {
            System.out.println("STOP!!! The car don't allowed to expluatation.");
            result = false;
        }return result;
    }

    public double HowManyKmTheCarCanDrive() {
        double result;
        result = fullnessOfTheTank / fuelConsumptionPer100Km * 100;
        System.out.println("The car can travel: " + result + " Km");
        return result;
    }

}