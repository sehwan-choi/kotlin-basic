package lec03_Type_다루는_방법;

public class Lec03Main {

  public static void main(String[] args) {
  }

  public static void objIsPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

  public static void objIsNotPerson(Object obj) {
    if (!(obj instanceof Person)) {
      // 추가 로직
    }
  }

}
