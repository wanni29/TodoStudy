import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice {

    public static void main(String[] args) {
        String text = "Java is a versatile and popular programming language" +
                "It is widely userd for various applications.";

        // 단어 빈도 계산
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[.,]", "");
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // 빈도에 따른 정렬
        List<Map.Entry<String, Integer>> sortedEntires = new ArrayList<>(wordFrequency.entrySet());
        Collections.sort(sortedEntires, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // 결과 출력
        System.out.println("단어 빈도 : ");
        for (Map.Entry<String, Integer> entry : sortedEntires) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // 공부할것
    // 1. hashMap의 특징과 개념 및 활용코드 (stream 이랑 섞어서 진행하세요!)
    // 2. 정규표현식 특징과 개념 및 활용코드 (가장 흔히 쓰이는 경우의 수 3가지만 마스터리 하세요!)
    // 3. getOrDefault()메소드와 비슷한 메소드 찾고
    // 4. compareTo()메소드 및 클래스 특징과 개념 및 활용코드 (API 제작하세요!)
    // 5. collections() 메소드 및 클래스 특징과 개념 및 활용코드 (API 제작하세요!)
    // 6. lterator의 특징과 개념 및 활용코드 (API 제작하세요!)
    // 7. stream 활용 코드 제작하세요!
    // 8. 깊은복사에 대한 개념 공부하고, 예제코드 작성하세요!

}
