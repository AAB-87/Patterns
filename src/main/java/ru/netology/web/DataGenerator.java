package ru.netology.web;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


class DataGenerator { // утилитный класс содержит приватный конструктор и статичные методы
    private DataGenerator() {}

    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

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