package lec04_연산자를_다루는_방법;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);
    System.out.println(money1.plus(money2));
  }

}
