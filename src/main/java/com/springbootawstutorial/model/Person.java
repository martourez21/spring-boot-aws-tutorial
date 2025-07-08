package com.springbootawstutorial.model;

public record Person(
        String firstName,
        String lastName,
        int age,
        String country
) {
}
