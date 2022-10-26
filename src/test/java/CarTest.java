import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    void ShouldIsCarCanGo() {
        // Given
        Car car = new Car(25, 6.8, 2015, 2022);
        // When
        double fullnessOfTheTank = 25;
        // Then
        assertEquals(true, car.isCarCanGo());
    }

    @Test
    void ShouldCarIsApprovedForOperation() {
        //given
        Car car = new Car(25, 6.8, 2021, 2022);
        //when
        car.currentYear = 2022;
        car.yearOfTechnicalInspection = 2021;
        //then
        assertEquals(true, car.isCarIsApprovedForOperation());
    }

    @Test
    void ShouldHowManyKmTheCarCanDrive() {
        //given
        Car car = new Car(25, 6.8, 2015, 2022);

        //when
        double fullnessOfTheTank = 25;
        double fuelConsumptionPer100Km = 6.8;

        //then
        assertEquals(367.64705882352945, car.HowManyKmTheCarCanDrive());

    }
}
