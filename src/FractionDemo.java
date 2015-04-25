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
import java.util.Scanner;
public class FractionDemo
{
public static void main(String[] args) throws Exception
{
    Scanner sc = new Scanner(System.in);
    // output stream objects to write the objects to the dat file
    FileOutputStream fos = new FileOutputStream("SerialF.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Fraction[] fractions = new Fraction[3]; // array to store 3 fraction objects
    // loop to create and write the 3 objects to the file.   
    for(int i = 0; i < 3; i++)
{
// prompting user to enter the numerator and denominator of the Fraction object.
    System.out.print("Enter numerator for fraction " + (i+1) + " : ");
    int num = sc.nextInt();
    System.out.print("Enter denominator for fraction " + (i+1) + " : ");
    int den = sc.nextInt();
    fractions[i] = new Fraction(num, den); // creating Fraction object

    oos.writeObject(fractions[i]); // command to write the object to file

    System.out.println(); // printing blank line
   }
  }
}