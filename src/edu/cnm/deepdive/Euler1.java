package edu.cnm.deepdive;

public class Euler1 {

  public static void main(String[] args) {
     int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      String value = "";
      if (i % 3 == 0) {
        sum += i;
      }
      if (i % 5 == 0) {
        sum += i;
      }

    }
    System.out.println(sum);
  }

}

