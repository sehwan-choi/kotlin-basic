package lec10_상속을_다루는_방법;

public class JavaDerived extends JavaBase {

  public JavaDerived() {
    super();
  }

  @Override
  public int getMember() {
    return 10;
  }

}
