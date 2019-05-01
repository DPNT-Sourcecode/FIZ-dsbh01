package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	String res;
    	if(isBoth(number) == false) {
	        res = isThree(number) ? "fizz" : number.toString();
	        res = isFive(number) ? "buzz" : res;
    	}else {
    		res = "fizz buzz";
    	}
    	return res + addDeluxe(number);
    }

    public String addDeluxe(Integer number) {
    	if(number <= 10 || notIdentical(number)) {
    		return "";
    	}else {
    		return "deluxe";
    	}
    }
    public Boolean notIdentical(Integer number) {
    	
    }
    public Boolean isBoth(Integer number) {
    	return isThree(number) && isFive(number);
    }
    public Boolean isThree(Integer number) {
    	return number % 3 == 0 || contains(number, 3);
    }
    public Boolean isFive(Integer number) {
    	return number % 5 == 0 || contains(number, 5);
    }
    public Boolean contains(Integer number, Integer value) {
    	while(number != 0) {
    		if(number % 10 == value) {
    			return true;
    		}
    		number /= 10;
    	}
    	return false;
    }
}





