package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String res = "";
        if(number % 3 == 0) res += "fizz";
        if(number % 5 == 0) res += "buzz";
        return res;
    }

}

