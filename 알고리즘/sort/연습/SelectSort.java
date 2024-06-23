package 연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        // 정렬할 숫자들을 공백으로 구분하여 입력
        String input = rd.readLine();

        String[] stringArray = input.split(" ");
        Integer[] arr = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        // 제네릭 선택 정렬 수행
        selectionSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // 가장 작은 요소를 현재 위치와 교환
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
