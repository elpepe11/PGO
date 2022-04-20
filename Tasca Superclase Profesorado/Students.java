package com.company;

public class Students extends Person{
    //Declaracion de atributos
    private String subject;

    //Constructores Principal
    public Students(String name,String surname,String subject){
        super(name,surname);
        this.setSubject(subject);
    }
    //get - sets
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    String fullname(){
        return getName()+" "+getSurname();
    }
}


