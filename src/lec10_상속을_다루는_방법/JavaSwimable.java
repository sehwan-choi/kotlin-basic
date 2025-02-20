package lec10_상속을_다루는_방법;

public interface JavaSwimable {

  default void act() {
    System.out.println("어푸 어푸");
  }

}
