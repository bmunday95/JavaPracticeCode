package codingProblems;

public class FizzBuzz {

  //  It's a small programming puzzle where you write code which prints numbers from 0-100,
  //  but instead prints fizz if the number is divisible by 3, buzz if it's divisible by 5,
  //  and fizzbuzz when it's divisible by both 3 & 5

  public void fizzBuzz() {

    for (int i = 0; i < 101; i++) {
      //fizzbuzz first, then fizz, then buzz
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("Fizzbuzz");

      } else if (i % 3 == 0) {
        System.out.println("Fizz");

      } else if (i % 5 == 0) {
        System.out.println("Buzz");

      } else {
        System.out.println(i);
      }
    }
  }
}
