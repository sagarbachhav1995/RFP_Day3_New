package Practice_Problem;

public class Array_In_Reverse_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {5, 10, 15, 20, 25};
		System.out.println("Original Order: ");
		for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }
	}

}
