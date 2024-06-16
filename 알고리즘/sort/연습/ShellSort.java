package 연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShellSort {
    // 셸 정렬 메소드
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // 초기 간격을 배열의 길이의 절반으로 설정
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 간격에 따라 배열 요소들을 비교 및 정렬
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;

                // 간격에 따라 요소들을 비교하며 삽입 위치를 찾음
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // 키 값을 삽입
                arr[j] = key;
                System.out.println(Arrays.toString(arr));
            }
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

        // 셸 정렬 수행
        shellSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
