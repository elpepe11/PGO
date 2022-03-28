package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Person person_one = new Person();

    person_one.setName("Sharon");
    person_one.setUsername("Gisbert");
    person_one.setDni("53637614G");
    person_one.setHeight(1.56f);
    person_one.setWidth(53f);

    System.out.println(person_one.getName());
    System.out.println(person_one.getUsername());
    System.out.println(person_one.getDni());
    System.out.println(person_one.getHeight());
    System.out.println(person_one.getWidth());


    // CLASE DE GATO
    Cat cat_one = new Cat();

    cat_one.setRace("SiamEs");
    cat_one.setYear(3);

    System.out.println(cat_one.getRace());
    System.out.println(cat_one.getYear());
    }
}
