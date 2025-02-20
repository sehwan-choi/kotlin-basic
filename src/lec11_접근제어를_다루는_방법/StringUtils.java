package lec11_접근제어를_다루는_방법;

public abstract class StringUtils {

  private StringUtils() {}

  public boolean isDirectoryPath(String path) {
    return path.endsWith("/");
  }

}

