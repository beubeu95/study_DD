import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuickSort {
    // 퀵 정렬 메소드
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 배열을 분할하고 피벗의 위치를 반환
            int pi = partition(arr, low, high);

            // 피벗을 기준으로 좌우 배열을 재귀적으로 정렬
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
            System.out.println(Arrays.toString(arr));
        }
    }

    // 배열을 분할하고 피벗의 위치를 반환하는 메소드
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 마지막 요소를 피벗으로 선택
        int i = (low - 1); // 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같은 경우
            if (arr[j] <= pivot) {
                i++;
                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 피벗을 올바른 위치로 이동
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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

        // 퀵 정렬 수행
        quickSort(arr, 0, arr.length - 1);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
