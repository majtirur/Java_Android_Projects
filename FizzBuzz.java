// This is a Java comment

/*
Write a java program to print numners below 100
which are divisble by 3, 5 or 3 and 5?

class Name {
    return-value methodName(argument parameters) {
        //do something
    }
}
*/

class FizzBuzz {
    public static void main(String args[]){
        System.out.println("Hello, I want to FizzBuzz!");
        
        for(int num=1; num<=100; num++) {
            if( (num%3 == 0) && (num%5 == 0) ) {
                System.out.println(num + " FizzBuzz");
                }
            else if( num%5 == 0) {
                System.out.println(num + " Buzz");
               }
            else if( num%3 == 0) {
                System.out.println(num + " Fizz");
                }
            else {
                System.out.println(num + "@#$%");
            }
        }
    }
}

/*
compile: javac FizzBuzz.java
execute: java FizzBuzz # run main method of FizzBuzz class
*/
