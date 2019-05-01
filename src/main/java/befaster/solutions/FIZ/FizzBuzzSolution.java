package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String res = number % 3 == 0 ? "fizz" : "";
        if(number % 15 == 0) res += " ";
        if(number % 5 == 0) res += "buzz";
        return res;
    }

}


