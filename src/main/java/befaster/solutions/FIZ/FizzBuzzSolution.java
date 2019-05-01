package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	if(isBoth(number)) {return "fizz buzz";}
        String res = isThree(number) ? "fizz" : number.toString();
        return isFive(number) ? "buzz" : res;
    }

    public Boolean isBoth(Integer number) {
    	return true;
    }
    public Boolean isThree(Integer number) {
    	return true;
    }
    public Boolean isFive(Integer number) {
    	return true;
    }
}

