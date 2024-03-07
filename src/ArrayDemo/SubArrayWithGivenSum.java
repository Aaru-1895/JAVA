package ArrayDemo;

public class SubArrayWithGivenSum {
	public static void findSubarray(int N, int S, int[] A) {
	int start = 0;
    int end = 0;
    int currentSum = 0;

    while (end < N || currentSum > S) {
        if (currentSum == S) {
            System.out.println((start + 1) + " " + (end));
            return;
        } else if (currentSum < S) {
            currentSum += A[end];
            end++;
        } else {
            currentSum -= A[start];
            start++;
        }
    }

    System.out.println("-1"); // If no subarray is found
}

public static void main(String[] args) {
    int N = 5;
    int S = 12;
    int[] A = {1, 2, 3, 7, 5};

    findSubarray(N, S, A);
}

}
