package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	String res = "";
    	if(isBoth(number) == false) {
	       if(isThree(number)) {
	    	   res = "fizz";
	       }
	       if(isFive(number)) {
	    	   res = "buzz";
	       }
    	}else {
    		res = "fizz buzz";
    	}
    	if(isDeluxe(number)) {
    		if(res == "") {
    			res = isFaceDeluxe(number) ? "fake deluxe" : "deluxe";
    		}else {
    			res = res + " deluxe";
    		}
    	}else {
    		if(res == "") {
    			res = number.toString();
    		}
    	}
    	return res;
    }

    public Boolean isDeluxe(Integer number) {
    	if(number <= 10 || notIdentical(number)) {
    		return false;
    	}else {
    		return true;
    	}
    }
    public Boolean notIdentical(Integer number) {
    	Integer c = number % 10;
    	number /= 10;
    	while(number != 0) {
    		if(c != number % 10) {
    			return true;
    		}
    		c = number % 10;
    		number /= 10;
    	}
    	return false;
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

