package lec10_상속을_다루는_방법;

public interface JavaFlyable {

  default void act() {
    System.out.println("파닥 파닥");
  }

}
