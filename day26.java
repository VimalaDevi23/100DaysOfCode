https://codersdaily.in/blog/check-leap-year-hackerrank-solution

package UdemyPrograms;

import java.util.Scanner;
import java.util.stream.IntStream;


public class LeapYearUsingJava8 {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        if (checkLeapYear(inputYear.nextInt())){
            System.out.println("Its a leap year");
        }else{
            System.out.println("Its not a leap year");
        }
    }
    public static boolean checkLeapYear(int inputYear){
      return IntStream.of(4,100,400)
              .anyMatch(divisor -> inputYear % divisor==0);
    }
}
