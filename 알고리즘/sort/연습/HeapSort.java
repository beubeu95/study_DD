package 연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HeapSort {
    // 제네릭 힙 정렬 메소드
    public static <T extends Comparable<T>> void heapSort(T[] arr) {
        int n = arr.length;

        // 힙 빌드
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 요소 하나씩 힙에서 추출
        for (int i = n - 1; i > 0; i--) {
            // 현재 루트를 끝으로 이동
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 힙의 나머지 요소에 대해 heapify 호출
            heapify(arr, i, 0);
            System.out.println(Arrays.toString(arr));
        }
    }

    // 힙을 유지하는 메소드
    private static <T extends Comparable<T>> void heapify(T[] arr, int n, int i) {
        int largest = i; // 루트
        int left = 2 * i + 1; // 왼쪽 자식
        int right = 2 * i + 2; // 오른쪽 자식

        // 왼쪽 자식이 루트보다 큰 경우
        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        // 오른쪽 자식이 현재 가장 큰 요소보다 큰 경우
        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        // 가장 큰 요소가 루트가 아닌 경우
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // 영향을 받은 하위 트리를 heapify 호출
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력 받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬할 숫자들을 공백으로 구분하여 입력하세요:");
        String input = reader.readLine();

        // 입력된 문자열을 공백 기준으로 나누어 배열로 변환
        String[] stringArray = input.split(" ");
        Integer[] arr = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        // 정렬 전 배열 출력
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));

        // 제네릭 힙 정렬 수행
        heapSort(arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
