package edu.cnm.deepdive;

public class Test {

  private int sum;


  public static void main(String[] args) {

  }

  void ThreeOrFive() {
    for (int i = 1; i <= 1000; i++) {
      String value = "";
      if (i % 3 == 0) {
        sum += i;
      }
      if (i % 5 == 0) {
        sum += i;
      }

    }

  }

}




