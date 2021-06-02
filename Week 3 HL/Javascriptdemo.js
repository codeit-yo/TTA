//alert("Welcome to Javascript");

//Single line comment example

/*Multiline 
comment
example*/

// JavaScript Variable
var data1;
var data2,data3,data4;

//store name
var name = "Yolanda"; //String => ""
var number = 300; //Number

//method 1 declear
var n1 = "cat";

//method 2 declear and assign
var n2;
n2 = "Kitty";

//method 3 assign
n3 = 32;

//--------------------------------

// display output
document.write("Hi Students!");
document.write(" My Name "+n2);
document.writeln("");
document.writeln("hello"); //new line
document.writeln("bye");

// Javascript operator

var result;
var num1,num2;


// 1. Arithmatic
result = 10+2;
//or
num1 =10;
num2 =2;
result = num1 + num2;
document.writeln("Addition is" + result);
document.writeln(num1+"+"+num2+"="+result);

num1 = "10"; //String
num2 = "2";//String

result = num1 + num2;
document.writeln("Addition is " +result);
document.writeln(num1+ "+" +num2+ "=" +result);

num1 = 3;
num2 = 4;

document.writeln("Difference: "+(num1 - num2));
document.writeln("Mutiplication:"+(num1 * num2));

num1 = 10;
num2 =2;
// num1 / num2 = 5 (remainder = 0)
document.writeln("Division:"+(num1/num2));//5
document.writeln("Remainder:" +(num1 % num2));//0

//2 Arithmatic assignment
result = 5;
//result = result + num1;//5+10==> result
result += num1;
document.writeln("Result=" +result);

// 3 Comparison Operator : true(yes) | false(no) => Boolean
//Q is 10 bigger than 2? Yes
result = 10 > 2;
document.writeln("10 < 2 ="+result);

var s1 = "abc";
var s2 = "xyz";
result = s1 == s2;
// = Assignment
// == equality
document.writeln("Check String equality =" +result);

// 4 Logical Operator (statement1 op Statement2)=> boolean
/*

AND -> &&

stmt1  stmt2    &&
T       T       T
T       F       F
F       T       F
F       F       F

OR -> ||

stmt1  stmt2    ||
T       T       T
T       F       T
F       T       T
F       F       F
*/

//Q check given number is divisible by 5 and 3?
//answer: if reminder of 12/5 is equal to "0"
var input = 12;

result = input % 5; // 12 % 5 = 2
result1 = input & 3; //12 % 3 = 0
document.writeln("remainder ="+result);
document.writeln("remainder ="+result1);

var stmt1 = result == 0; //boolean (true or False)
var stmt2 = result1 == 0; //boolean (true or false)
document.writeln("stmt1 ="+stmt1); //false
document.writeln("stmt2 ="+stmt2); //true

//5 and 3
var check = (input % 5 == 0) && (input % 3 == 0);
document.writeln("12 is divide by 5 and 3 =" +check);

//5 or 3
var check = (input % 5 == 0) || (input % 3 == 0);
document.writeln("12 is divide by 5 or 3 =" +check);

//Q check whether user is valid or not => login
/*
username = "admin"
password = "admin"
*/

var username = "admin";
var password = "admin";

var input1 = "y"; // user input
var input2 = "y123"; //user input

check = (input1==username) && (input2==password);
document.writeln("Is user valid :"+check);

// logical not !
result = 10 < 2;//false
document.writeln("10 is greater than 2 =" +result);
check = !result; //false => true
document.writeln("after negation:"+check);



