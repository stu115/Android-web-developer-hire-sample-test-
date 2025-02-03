import java.io.*; 

import java.math.*; 

import java.security.*; 

import java.text.*; 

import java.util.*; 

import java.util.concurrent.*; 

import java.util.regex.*; 

 
 int n = 0; 

    public static void fizzBuzz(int n) { 

    // Write your code here 

     int i = 0; 

         while(i<n){ 

    i++; 

    if (i%3==0 & i%5==0){ 

    System.out.println("FizzBuzz"); 

} 

  

 if (i%3==0 & i%5!=0){ 

    System.out.println("Fizz"); 

} 

  

if (i%5==0 & i%3!=0){ 

    System.out.println("Buzz"); 

}  

 

if (i%3!=0 & i%5!=0){ 

    System.out.println(i); 

} 

         } 
