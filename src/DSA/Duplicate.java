package DSA;


	import java.util.Scanner;

	public class Duplicate {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int n = s.nextInt();
	        int[] arr = new int[n];     
	        System.out.println("Enter array elements in sorted order:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }

	        int[] result = removeDuplicates(arr);
	        System.out.println("Array after removing duplicates is:");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }

	        s.close();
	    }

	    public static int[] removeDuplicates(int[] arr) {
	        if (arr.length == 0) {
	            return arr;
	        }

	        int[] result = new int[arr.length];
	        result[0] = arr[0];
	        int Index = 1;

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[i - 1]) {
	                result[Index] = arr[i];
	                Index++;
	            }
	        }

	        int[] Result = new int[Index];
	        System.arraycopy(result, 0,Result, 0,Index);

	        return Result;
	    }
	}


