/* 
Fizz buzz is a group word game for children to teach them about division.[1] Players take turns to count incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".

If a number is divisible by 3, 5 or 3 and 5,
print FIZZ, BUZZ, FIZZBUZZ respectively

Test FizzBuzz class with sample data 

*/

class FizzBuzzTest2 {
    
    public static void main(String args[]) {
        int[] numRange = {1,100};
        
        for(int iter = numRange[0]; iter <= numRange[1]; iter++) {
            // create an object 'A' of the class 'FizzBuzz' 
            // using 'new' keyword
            // execute constructor FizzBuzz(int)
            
            FizzBuzz A = new FizzBuzz(iter);
            
            // call print method of 'A' object of type 'FizzBuzz'
            A.print();
        }
        
        // call static funtion inside FizzBuzz
        System.out.println(FizzBuzz.say()); 
    }
}

class FizzBuzz {
    private int number = 0;

    FizzBuzz(int num) {
        number = num;
    }

    private boolean divisibleBy(int divisor) {
        if(number % divisor == 0)
            return true;
        return false;
    }
    
    public void print() {
        if(divisibleBy(3) && divisibleBy(5))
            System.out.println(number + " = FizzBuzz");
        else if(divisibleBy(3))
            System.out.println(number + " = Fizz");
        else if(divisibleBy(5))
            System.out.println(number + " = Buzz");
        else
            System.out.println(number + " = NOBUZZ :(");
    }
    
    
    // static functions are called without creating objects
    // like classname.static-function-name
    // FizzBuzz.say()
    
    public static String say() {
        return "Hollaaa!!";
    }
}










