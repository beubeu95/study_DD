import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSort {
    // 합병 정렬 메소드
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // 좌측 절반 정렬
            mergeSort(arr, left, middle);
            // 우측 절반 정렬
            mergeSort(arr, middle + 1, right);

            // 정렬된 두 배열을 병합
            merge(arr, left, middle, right);
        }
    }

    // 두 배열을 병합하는 메소드
    public static void merge(int[] arr, int left, int middle, int right) {
        // 두 배열의 크기 계산
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // 임시 배열 생성
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 임시 배열에 데이터 복사
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[middle + 1 + j];

        // 병합 과정
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
                System.out.println(Arrays.toString(arr));
            } else {
                arr[k] = rightArray[j];
                j++;
                System.out.println(Arrays.toString(arr));
            }
            k++;
        }

        // 남은 요소들 복사
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
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

        // 합병 정렬 수행
        mergeSort(arr, 0, arr.length - 1);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열: " + Arrays.toString(arr));
    }
}
