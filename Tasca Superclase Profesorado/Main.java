package com.company;
import java.util.Scanner;

public class Main {
    //Declaracion constantes
    
    private static final String MSG_NAME ="Introduce tu nombre:";
    private static final String MSG_SURNAME = "Introduce tu apellido:";
    private static final String MSG_DNI = "Introduce tu DNI:";
    private static final String MSG_EMAIL = "Introduce tu email:";
    private static final String MSG_SUBJECT = "Introduce la materia cursada:";
    private static final String MSG_DEF = "*************************************";

    public static void main(String[] args) {
        //Declaracion de variables
        String name,surname,dni,email,subject;

       //Instancisa Escaner
        Scanner sc = new Scanner(System.in);

        //Recogemos datos en variables para profesor
        System.out.println(MSG_DEF);
        System.out.println(MSG_NAME);
        name = sc.next();
        System.out.println(MSG_DEF);
        System.out.println(MSG_SURNAME);
        surname = sc.next();
        System.out.println(MSG_DEF);
        System.out.println(MSG_DNI);
        dni = sc.next();
        System.out.println(MSG_DEF);
        System.out.println(MSG_EMAIL);
        email = sc.next();

        //Instancia de profesor
        Teachers profesor =  new Teachers(name,surname,dni,email);

        //Recogemos datos en variables para alumno
        System.out.println(MSG_DEF);
        System.out.println(MSG_NAME);
        name = sc.next();
        System.out.println(MSG_DEF);
        System.out.println(MSG_SURNAME);
        surname = sc.next();
        System.out.println(MSG_DEF);
        System.out.println(MSG_SUBJECT);
        subject = sc.next();

        //Instancia de alumno
        Students alumno = new Students(name,surname,subject);

        //Printar resultados de profesor
        System.out.println(MSG_DEF);
        System.out.println("Nombre del profesor: " + profesor.getName());
        System.out.println("Apellido del profesor: " + profesor.getSurname());
        System.out.println("Nombre completo: " + profesor.fullname());
        System.out.println("DNI del profesor: " + profesor.getDni());
        System.out.println("Email del profesor: " + profesor.getEmail());

        //Printar resultados de alumno
        System.out.println(MSG_DEF);
        System.out.println("Nombre del alumno: " + alumno.getName());
        System.out.println("Apellido del alumno: " + alumno.getSurname());
        System.out.println("Nombre completo: " + alumno.fullname());
        System.out.println("Asignatura del alumno: " + alumno.getSubject());
    }

}
