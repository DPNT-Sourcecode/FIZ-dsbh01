package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	if(number % 15 == 0) {return "fizz buzz";}
        String res = number % 3 == 0 ? "fizz" : number.toString();
        if(number % 15 == 0) res += " ";
        if(number % 5 == 0) res = "buzz";
        return res;
    }

}





