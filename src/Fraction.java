/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fraction implements Serializable
{

    private int numerator;
    private int denominator;
    private static char slash = '/';
// constructor to Fraction class
public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
}
// getter and setter methods to the fraction class
public int getDenominator() {
    return denominator;
}

public void setDenominator(int denominator) {
    this.denominator = denominator;
}

public int getNumerator() {
    return numerator;
}

public void setNumerator(int numerator) {
    this.numerator = numerator;
}

public static char getSlash() {
    return slash;
}
// toString() method to the fraction class
@Override
public String toString() {
    return "" + numerator + slash + denominator;
    }
}