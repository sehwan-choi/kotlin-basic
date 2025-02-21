package lec14_다양한_클래스를_다루는_방법;

public enum JavaCountry {

  KOREA("KO"),
  AMERICA("US"),
  ;

  private final String code;

  JavaCountry(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}
