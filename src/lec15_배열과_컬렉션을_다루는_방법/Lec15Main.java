package lec15_배열과_컬렉션을_다루는_방법;

import java.util.Arrays;
import java.util.List;

public class Lec15Main {

  public static void main(String[] args) {

    int[] arr = {100,200};
    for (int i = 0 ; i < arr.length ; i++) {
      System.out.println(arr[i]);
    }

    List<Integer> array = Arrays.asList(100, 200);

    // 리스트에서 하나 가져오기
    System.out.println(array.get(0));

    // 리스트 전체 출력 For each
    for (int num : array) {
      System.out.println(num);
    }

    // 리스트 전체 출력 전통적인 for 문
    for (int i = 0 ; i < arr.length ; i++) {
      System.out.println(i);
    }
  }

}
