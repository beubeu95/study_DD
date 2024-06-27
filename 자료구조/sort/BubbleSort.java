import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {
    // 버블 정렬 메소드
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        //64 25 12 22 11 50
        // 배열의 요소들을 반복하여 정렬
        for (int i = 0; i < n - 1; i++) {
            // 마지막 i개의 요소는 이미 정렬되었으므로 비교할 필요 없음
            for (int j = 0; j < n - 1 - i; j++) {
                // 인접한 요소를 비교하여 순서가 잘못된 경우 교환
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
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

        // 버블 정렬 수행
        bubbleSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
