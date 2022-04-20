package com.company;

abstract class Person {
    //declaracion de atributos
    private String name,surname,dni;

    //Constructores Principal
    public Person(String name,String surname,String dni){
        this.setName(name);
        this.setSurname(surname);
        this.setDni(dni);
    }

    //Constructor secundario
    public Person(String name,String surname){
        this(name,surname,null);
    }

    //get - sets
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDni() {
        return this.dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    //Metodos abstractos
    abstract String fullname();
}
