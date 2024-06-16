package 연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RadixSort {

    // 기수 정렬 메소드
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // 자리수마다 정렬
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    // 배열의 최대값을 구하는 메소드
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 자리수에 따른 계수 정렬 메소드
    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // 해당 자리수의 숫자에 대한 카운트 저장
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // 실제 위치를 계산하기 위해 카운트 배열 수정
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 출력 배열을 생성
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // 정렬된 배열을 원본 배열로 복사
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
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

        // 기수 정렬 수행
        radixSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
