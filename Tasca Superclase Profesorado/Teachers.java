package com.company;

public class Teachers extends Person{
    //declaracion de atributos
    private String email;

    public Teachers(String name,String surname,String dni,String email){
        super(name,surname,dni);
        this.setEmail(email);
    }
    //get - sets
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //llamar a la funcion abstract
    @Override
    String fullname(){
        return getName()+" "+getSurname();
    }
}
