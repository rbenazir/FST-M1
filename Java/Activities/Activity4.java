package activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,0,9,71,6};
		System.out.println("Array before sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		insertionSort(arr);

	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
int size = arr.length, i;
        
        for (i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array after sort");
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}
	}

}
