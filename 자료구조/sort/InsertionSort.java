import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {
    // 삽입 정렬 메소드
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        //64 25 12 22 11 50
        // 두 번째 요소부터 시작하여 배열의 각 요소를 순회
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // key 값보다 큰 요소를 한 칸씩 뒤로 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // key 값을 적절한 위치에 삽입
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력 받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬할 숫자들을 공백으로 구분하여 입력하세요:");
        String input = reader.readLine();

        // 입력된 문자열을 공백 기준으로 나누어 정수 배열로 변환
        String[] stringArray = input.split(" ");
        int[] arr = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        // 정렬 전 배열 출력
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        // 삽입 정렬 수행
        insertionSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}