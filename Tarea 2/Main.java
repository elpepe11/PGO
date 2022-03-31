package com.company;
import java.util.Scanner;

public class Main {
    // CONSTANTES
    private static final String MSG_NAME= "Enter the person's name";
    private static final String MSG_USERNAME= "Enter the person's last name";
    private static final String MSG_DNI= "Enter the person's ID";
    private static final String MSG_HEIGHT= "Enter the person's height";
    private static final String MSG_WIDTH= "Enter the person's weight";

    private static final String MSG_DEF="*********************************";

    private static final String MSG_BRAND="Enter the car brand";
    private static final String MSG_MODEL="Enter the car model";
    private static final String MSG_PRICE="Enter the price car";

    private static final String MSG_RACE="Enter the cat breed";
    private static final String MSG_YEAR="Enter the age of the cat";

    private static final String MSG_MODEL_1="Enter the chair model";
    private static final String MSG_SITE="Enter the name of site";
    private static final String MSG_PRICE_1="Enter the price chair";

    private static final String MSG_NAME_1="Enter the name square ";
    private static final String MSG_KIND="Enter the square kind";
    private static final String MSG_MEASURES="Enter the square measures";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CLASE PERSON
        Person person_one = new Person();

        System.out.println(MSG_DEF);
        System.out.println(MSG_NAME);
        person_one.setName(sc.next());
        System.out.println(MSG_USERNAME);
        person_one.setUsername(sc.next());
        System.out.println(MSG_DNI);
        person_one.setDni(sc.next());
        System.out.println(MSG_HEIGHT);
        person_one.setHeight(Float.parseFloat(sc.next()));
        System.out.println(MSG_WIDTH);
        person_one.setWidth(Float.parseFloat(sc.next()));
        System.out.println(MSG_DEF);

        System.out.println(person_one.getName());
        System.out.println(person_one.getUsername());
        System.out.println(person_one.getDni());
        System.out.println(person_one.getHeight());
        System.out.println(person_one.getWidth());


        // CLASE CAR
        Car car_one = new Car();

        System.out.println(MSG_DEF);
        System.out.println(MSG_BRAND);
        car_one.setBrand(sc.next());
        System.out.println(MSG_MODEL);
        car_one.setModel(sc.next());
        System.out.println(MSG_PRICE);
        car_one.setPrice(Float.parseFloat(sc.next()));
        System.out.println(MSG_DEF);

        System.out.println(car_one.getBrand());
        System.out.println(car_one.getModel());
        System.out.println(car_one.getPrice());

        // CLASE GATO
        Cat cat_one = new Cat();

        System.out.println(MSG_DEF);
        System.out.println(MSG_RACE);
        cat_one.setRace(sc.next());
        System.out.println(MSG_YEAR);
        cat_one.setYear(Integer.parseInt(sc.next()));
        System.out.println(MSG_DEF);

        System.out.println(cat_one.getRace());
        System.out.println(cat_one.getYear());

        // CLASE CHAIR
        Chair chair_one = new Chair();

        System.out.println(MSG_DEF);
        System.out.println(MSG_MODEL_1);
        chair_one.setModel(sc.next());
        System.out.println(MSG_SITE);
        chair_one.setSite(sc.next());
        System.out.println(MSG_PRICE_1);
        chair_one.setPrice(Float.parseFloat(sc.next()));
        System.out.println(MSG_DEF);

        System.out.println(chair_one.getModel());
        System.out.println(chair_one.getSite());
        System.out.println(chair_one.getPrice());

        // CLASE SQUARE
        Square square_one = new Square();

        System.out.println(MSG_DEF);
        System.out.println(MSG_NAME_1);
        square_one.setName(sc.next());
        System.out.println(MSG_KIND);
        square_one.setKind(sc.next());
        System.out.println(MSG_MEASURES);
        square_one.setMeasures(Float.parseFloat(sc.next()));
        System.out.println(MSG_DEF);

        System.out.println(square_one.getName());
        System.out.println(square_one.getKind());
        System.out.println(square_one.getMeasures());


    }
}
