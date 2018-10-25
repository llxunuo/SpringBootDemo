package com.example.springboot.cglib;

public class PersonService {
    public PersonService() {
        System.out.println("PersonService构造");
    }
    //该方法不能被子类覆盖
    final public String getPerson(String code) {
        System.out.println("PersonService:getPerson>>"+code);
        return null;
    }

    public void setPerson() {
        System.out.println("PersonService:setPerson");
    }
}
