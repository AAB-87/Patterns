package ru.netology.web;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


class DataGenerator {
    private DataGenerator() {}

    private static final Faker faker = new Faker(new Locale("ru"));

    public static String generateCity() {
        return faker.address().city();
    }
    public static String generateDate() {
        return LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
    public static String generateName() {
        return faker.name().fullName();
    }
    public static String generatePhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

}