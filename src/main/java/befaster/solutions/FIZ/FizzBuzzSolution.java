package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
       boolean isFizz = number % 3 ==0 || String.valueOf(number).contains("3");
       boolean isBuzz = number % 5 ==0 || String.valueOf(number).contains("5");
       boolean isDeluxe = number > 10 && digitsAreIdentical(number) && number % 2 == 0;
        boolean isFakeDeluxe = number > 10 && digitsAreIdentical(number) && number % 2 != 0;

        if(isFizz &&  isBuzz && isDeluxe){
          return "fizz buzz deluxe";
      }
      else if (isFizz && isDeluxe){
          return "fizz deluxe";
      }
      else if (isBuzz && isDeluxe) {
          return "buzz deluxe";
      }
      else if (isFizz && isBuzz) {
          return "fizz buzz";
      }
      else if (isFizz) {
          return "fizz";
      }
      else if (isBuzz) {
          return "buzz";
      }
      else if (isDeluxe) {
          return "deluxe";
      }
      else if (isFakeDeluxe) {
          return "fake deluxe";
      }
      else{
          return String.valueOf(number);
      }
    }

    private boolean digitsAreIdentical(int number){
        String numStr = String.valueOf(number);
        char firstDigit = numStr.charAt(0);
        for(int i = 1; i<numStr.length(); i++){
            if(numStr.charAt(i) != firstDigit){
                return false;
            }
        }
        return true;
    }

}


