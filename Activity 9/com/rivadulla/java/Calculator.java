package com.rivadulla.java;

import java.util.Scanner;

public class Calculator {
	
	public class myOperations {
		   
	      public double Addition(double a,double b) {
	         double Sum = a+b;
	         return Sum;
	      }
	      public double Subtraction(double a,double b) {
	         double Difference = a-b;
	         return Difference;
	      }
	      public double Multiplication(double a,double b) {
	         double Product = a*b;
	         return Product;
	      }
	      public double Division(double a,double b) {
	         double Quotient = a/b;
	         return Quotient;
	      }
	      public double Exponent(double a,double b) {
	         double Product=Math.pow(a, b);
	         return Product;
	      }
	      public double Modulo(double a,double b) {
	         double Remainder = a%b;
	         return Remainder;
	      }
	   
	   }

}
