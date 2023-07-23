
package com.fizzBuzz.FizzBuzz;
import java.util.stream.IntStream;

public class MyMojo {
    public static void main(String args[]) {
        doStreamFizzBuzz(100);
    }
    
    public static void doStreamFizzBuzz(int n) {
        IntStream.rangeClosed(1, n)
            .mapToObj(MyMojo::mapIntToFizzBuzz)
            .forEach(System.out::println);
    }
    
    public static String mapIntToFizzBuzz(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        
        if(i % 3 == 0) {
            return "Fizz";
        }
        
        if(i % 5 == 0) {
            return "Buzz";
        }
        
        return Integer.toString(i);
    }
}