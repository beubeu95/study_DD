package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeSort {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("배열의 크기와 저장횟수를 공백을 두고 작성해주세요!");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println("배열을 크기에 맞춰 공백을 두고 작성해주세요!");
        st = new StringTokenizer(br.readLine());


        int arr [] = new int [N];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println("정렬전 배열 : "+ Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("정렬후 배열 : "+ Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr,  left, middle);
            mergeSort(arr,  middle+1, right);

            merge(arr, left, middle, right);

        }
    }

    public static void merge(int[] arr, int left, int middle ,int right){

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];


        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[middle + 1 + j];
        }

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
            System.out.println(Arrays.toString(arr));
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
            System.out.println(Arrays.toString(arr));
        }
    }
}
