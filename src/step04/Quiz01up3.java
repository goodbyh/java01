/* 문제: 개인이 좋아하는 영화 장르를 저장하고 출력하는 프로그램을 작성하라.
=> 장르의 선호 여부를 표현할 때 비트로 표현할 것.
=> 비트 연산자를 이용하여 검사할 것.
=> 참고 예제: Exam06.java
=> 장르
범죄, 드라마, 코미디, 로맨스, 스릴러,
가족, 판타지, 액션, SF, 애니메이션,
다큐멘터리, 공포
=> 테스트 데이터
홍길동이 좋아하는 장르 : 드라마, 액션, SF, 다큐멘터리
010000011010
*/
package step04;

public class Quiz01up3 {
  public static void main(String[] args) {
    // 장르 마스크
    int[] GENRE_MASK = {0x800, 0x400, 0x200, 0x100, 0x80,
                        0x40, 0x20, 0x10, 0x8, 0x4, 0x2, 0x1};
    String[] genreTitle = {"범죄", "드라마", "코미디", "로맨스", "스릴러",
            "가족", "판타지", "액션", "SF", "애니메이션", "다큐멘터리", "공포"};
    // 개인 장르 데이터
    int myGenre = 0b0100_0001_1010;

    // 개인이 좋아하는 장르 출력
    for (int i = 0; i < GENRE_MASK.length; i++) {
      if ((myGenre & GENRE_MASK[i]) == GENRE_MASK[i])
        System.out.println(genreTitle[i]);
    }
    
  }
}
