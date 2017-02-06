/* 

If a number is divisible by 3, 5 or 3 and 5,
print FIZZ, BUZZ, FIZZBUZZ respectively

Test FizzBuzz class with sample data 

*/

class FizzBuzzTest {
    public static void main(String args[]) {
        FizzBuzz A = new FizzBuzz(31);
        if(A.divBy3and5())
            System.out.println("FizzBuzz");
        else if(A.divByThree())
            System.out.println("Fizz");
        else if(A.divByFive())
            System.out.println("Buzz");
        else
            System.out.println("NOBUZZ :(");
    }
}

class FizzBuzz {
    private int number = 0;

    FizzBuzz(int num) {
        number = num;
    }

    boolean divByThree() {
        if(number % 3 == 0)
            return true;
        return false;
    }
    
    boolean divByFive() {
        if(number % 5 == 0)
            return true;
        return false;
    }
    
    boolean divBy3and5() {
        if((number % 3 ==0) && (number % 5 == 0))
            return true;
        return false;
    }
}
