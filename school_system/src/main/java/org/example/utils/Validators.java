package org.example.utils;

import javax.naming.directory.InvalidAttributesException;

public class Validators {
    public static double validateGrade(double grade) throws InvalidAttributesException {
        if(grade < 0 || grade > 10){
            throw new InvalidAttributesException("Este valor de nota é inválido");
        }
        return grade;
    }
}
