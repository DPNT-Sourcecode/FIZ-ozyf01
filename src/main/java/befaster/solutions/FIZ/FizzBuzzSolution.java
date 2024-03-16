package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
       boolean isFizz = number % 3 ==0 || String.valueOf(number).contains("3");
       boolean isBuzz = number % 5 ==0 || String.valueOf(number).contains("5");
      if(isFizz &&  isBuzz){
          return "fizz buzz";
      }
      else if (isFizz){
          return "fizz";
      }
      else if (isBuzz) {
          return "buzz";
      }
      else{
          return String.valueOf(number);
      }
    }

}


