package com.company;

public class User {
    private String firstName;
    private String secondName;
    private int id;
    private static int id_gen = 0;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;



     public User(String firstName,String secondName,int age,String gender,String dateOfBirth,String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth=dateOfBirth;
        this.password = password;
         id = id_gen++;
  }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


   public int getId() {
        return id;
   }

   void print() {
       System.out.println("Full name " + firstName + " " + secondName);
       System.out.println("Age " + age);
       System.out.println("Date of birth " + dateOfBirth);
   }


}
