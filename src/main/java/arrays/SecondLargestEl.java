package arrays;

public class SecondLargestEl {

	public static int secondLargestNumber(int[] arr)

	{

		if (arr.length == 0) {
			throw new IllegalArgumentException("Empty array");
		}
		if (arr.length == 1) {
			throw new IllegalArgumentException(
					"Array contains only one element");
		}

		int equalElements = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[0] == arr[i])
				equalElements++;
		}
		if (equalElements == arr.length) {
			throw new IllegalArgumentException("All elements are equal");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == largest) {
				arr[i] = Integer.MIN_VALUE;
			}

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}

		}
		return secondLargest;

	}

}