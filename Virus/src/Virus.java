// MARATÓN DE EJERCICIOS PARA PRACTICAR

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Virus {

public static void main(String[] args) {

// averageScore();

// consultantCharges();

// format1();

// format4();

// loanQualifier( );

// switchSwitch();

// petFood();

 password();

// stringCompare();

System.exit(0);

} // main

public static void averageScore( ) {
double score1; // To hold score #1
double score2; // To hold score #2
double score3; // To hold score #3
double average; // To hold the average score
String input; // To hold the user's input

// Get the first test score.
input = JOptionPane.showInputDialog("Enter score #1:");
score1 = Double.parseDouble(input);

// Get the second score.
input = JOptionPane.showInputDialog("Enter score #2:");
score2 = Double.parseDouble(input);

// Get the third test score.
input = JOptionPane.showInputDialog("Enter score #3:");
score3 = Double.parseDouble(input);

// Calculate the average score.
average = (score1 + score2 + score3) / 3.0;

/* Unir los dos mensajes en un String y usar conditional operator*/

String output = "The average is " + average;
// Display the average score.
//JOptionPane.showMessageDialog(null,
//"The average is " + average);

// If the score was greater than 95, let the user know
// that's a great score.

//if (average > 95)
//	output += "\nThat's a great score!";
output += (average > 95)? "\nThat's a great score!":"";

JOptionPane.showMessageDialog(null,
output);

System.exit(0);

} // averageScore

public static void consultantCharges() {
double hours, // To hold the hours worked
charges; // To hold the charges
String input; // To hold user input

// Get the number of hours worked.
input = JOptionPane.showInputDialog("How many hours were worked? ");
hours = Double.parseDouble(input);

// Make sure hours is at least 5.
// In the following statement, if the value in hours is less
// than 5, then 5 is stored in hours. Otherwise hours is assigned
// the value it already has.

/*Cambiar este if por un conditional operator*/

//if( hours < 5 ) // Cambiar este if por un conditional operator
//hours = 5;

//hours = (hours < 5)? + 5:hours;

// Calculate and display the charges. The variable hours will not
// have a value less than 5 because of the previous statement.
charges = 50.0 * hours < 5 ? + 5:hours;;
JOptionPane.showMessageDialog(null, "The charges are $" + charges);

System.exit(0);

} // consultantCharges

public static void format1() {
/**
This program demonstrates the DecimalFormat class.
*/
double number1 = .166666666666667;
double number2 = 1.666666666666667;
double number3 = 16.666666666666667;
double number4 = 166.;

/* 1. Cambiar el String literal por una variable de tipo String
* 2. Cambiar el DecimalFormat por un printf
*/
String string  = "#0.00";
// Create a DecimalFormat object.
DecimalFormat formatter = new DecimalFormat(string);
// DecimalFormat formatter = new DecimalFormat("000.00");

// Display the formatted variable contents.
// printf tambien redondea los numeros 
//System.out.printf("%8.2f\n", number1);
//System.out.println(formatter.format(number2));
//System.out.println(formatter.format(number3));
//System.out.println(formatter.format(number4));
System.out.printf("%-8d\n%-8s\n%8.2f\n%8.2f\n", 455,"Hola",number3,number4);
// - (guion) es right justify
// d (integer)
// f (float) double
// c (char)
} // format1

public static void format4( )
{
double number1 = 0.12;
double number2 = 0.05;
double number3 = 0.0035;

/* Demostrar que el % cambia a porcentaje automáticamente porque multiplica por 100 */

// Create a DecimalFormat object.
DecimalFormat formatter = new DecimalFormat("0.0%");

// Display the formatted variable contents.
System.out.println(formatter.format(number1));
System.out.println(formatter.format(number2));
System.out.println(formatter.format(number3));
} // format4

public static void loanQualifier( ) {
/**
This program demonstrates a nested if statement.
**/
double salary; // Annual salary
double yearsOnJob; // Years at current job
String input; // To hold string input

// Get the user's annual salary.
input = JOptionPane.showInputDialog("Enter your " +
"annual salary.");
salary = Double.parseDouble(input);

// Get the number of years at the current job.
input = JOptionPane.showInputDialog("Enter the number of " +
"years at your current job.");
yearsOnJob = Double.parseDouble(input);

/* 1. Demostrar por qué no se puede usar switch en este programa
* 2. Cambiar el if anidado por un logical And
*/

// Determine whether the user qualifies for the loan.
if (salary >= 30000)
{
if (yearsOnJob >= 2)
{
JOptionPane.showMessageDialog(null, "You qualify " +
"for the loan.");
}
else
{
JOptionPane.showMessageDialog(null, "You must have " +
"been on your current job for at least " +
"two years to qualify.");
}
}
else
{
JOptionPane.showMessageDialog(null, "You must earn " +
"at least $30,000 per year to qualify.");
}

System.exit(0);

} // loanQualifier

public static void switchSwitch( ) {
int number; // A number entered by the user

// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

// Get one of the numbers 1, 2, or 3 from the user.
System.out.print("Enter 1, 2, or 3: ");
number = keyboard.nextInt();

/* 1. Experimentar con quitar y poner el break
* 2. Cambiar por un if
*/

// Determine the number entered.
//switch (number) {
//case 1:
//System.out.println("You entered 1.");
//break;
//case 2:
//System.out.println("You entered 2.");
//break;
//case 3:
//System.out.println("You entered 3.");
//break;
//default:
//System.out.println("That's not 1, 2, or 3!");
//break;
//
//
//
//} // switch
if (number == 1)
	System.out.println("You entered 1.");
else if (number == 2)
	System.out.println("You entered 2.");
else if (number == 3)
	System.out.println("You entered 3.");
else if (number == 4)
	System.out.println("You entered 4.");
else if (number > 3 )
	System.out.println("Error");
} // switchSwitch

public static void petFood( ) {
String input; // To hold the user's input
char foodGrade; // Grade of pet food

// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

// Prompt the user for a grade of pet food.
System.out.println("Our pet food is available in " +
"three grades:");
System.out.print("A, B, and C. Which do you want " +
"pricing for? ");
input = keyboard.nextLine();
foodGrade = input.charAt(0);

/*
* 1. Cambiar el switch por un if
* 2. Cambiar el switch por un if y un toUpperCase
*/

// Display pricing for the selected grade.
switch(foodGrade) {
case 'a':
case 'A':
System.out.println("30 cents per lb.");
break;
case 'b':
case 'B':
System.out.println("20 cents per lb.");
break;
case 'c':
case 'C':
System.out.println("15 cents per lb.");
break;
default:
System.out.println("Invalid choice.");
} // switch

} // petFood

public static void password( ) {
String input; // To hold the user's input

// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

// Prompt the user to enter the secret word.
System.out.print("Enter the password: ");
input = keyboard.nextLine();

/* 1. cambiar a .compareToIgnoreCase
* 2. cambiar el if a un conditional operator
*/

// Determine whether the user entered the secret word.
if (input.compareToIgnoreCase("PROSPERO") == 0)L
{
System.out.println("Congratulations! You know the " +
"secret word!");
}
else
{
System.err.println("Invalid password");
}
} // password
//if (input.equalsIgnoreCase("PROSPERO"))
//{
//System.out.println("Congratulations! You know the " +
//"secret word!");
//}
//else
//{
//System.err.println("Invalid password");
//}
//} // password

public static void stringCompare( ) {
String name1 = "Mark",
name2 = "Mark",
name3 = "Mary";

/*
* 1. Cambiar a .equalsIgnoreCase
* 2. cambiar a .compareTo
*/

// Compare "Mark" and "Mark"

if (name1.equals(name2)) {
System.out.println(name1 + " and " + name2 +
" are the same.");
}
else {
System.out.println(name1 + " and " + name2 +
" are the NOT the same.");
}

// Compare "Mark" and "Mary"

if (name1.equals(name3)) {
System.out.println(name1 + " and " + name3 +
" are the same.");
}
else {
System.out.println(name1 + " and " + name3 +
" are the NOT the same.");
}
} // stringCompare

} // class