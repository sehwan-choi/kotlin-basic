package lec14_다양한_클래스를_다루는_방법;

public class Lec14Main {

  public static void main(String[] args) {
    handleCountry(JavaCountry.KOREA);
  }

  private static void handleCountry(JavaCountry country) {
    if (country == JavaCountry.KOREA) {
      // 로직 처리
    }

    if (country == JavaCountry.AMERICA) {
      // 로직 처리
    }
  }

}

