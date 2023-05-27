package utilities;

import com.github.javafaker.Faker;

public class TestDataGenerator {
    private static Faker faker = new Faker();

    public static int getRandomNumber() {

        return faker.number().randomDigitNotZero();
    }

    public static String getRandomAlertText() {
        return faker.bothify("???##?#?#???##");
    }
}

