package com.example.userdefinedException;

public class Test {
    public static void main(String[] args){
        Recruitment r=new Recruitment();

            try {
                r.checkEligibility(12);
            } catch (InvalidAgeException e) {
                throw new RuntimeException(e);
            }

    }
}
