package utils;

import com.github.javafaker.Faker;

public class Generator {

    public static String generateName(){

        Faker faker = new Faker();

        String randomName = faker.funnyName().name();

        return randomName;
    }
}
