package lec12_object_키워드를_다루는_방법;

public abstract class StringUtils {

  private StringUtils() {}

  public static boolean isDirectoryPath(String path) {
    return path.endsWith("/");
  }

}
