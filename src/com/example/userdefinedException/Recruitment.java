package com.example.userdefinedException;

public class Recruitment {
    public void checkEligibility(int age) throws InvalidAgeException{
        if(age<18)
          throw new InvalidAgeException("Invalid age,cant join org");
        else
            System.out.println("you are hired");

    }
}
