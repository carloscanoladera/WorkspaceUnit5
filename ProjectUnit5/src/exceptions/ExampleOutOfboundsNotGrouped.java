package exceptions;

public class ExampleOutOfboundsNotGrouped {

	public static void main(String[] args) {
	
		try {
			
			showArray();
			
		}
		catch (ArrayIndexOutOfBoundsException e){
			
	
			System.out.println("The array entry is out of the array bounds");
			
		}
		catch (IndexOutOfBoundsException e){
			
			
			System.out.println("Illegal index. Entry out of bounds");
			
		}
		
		
	}

	private static void showArray() {
		// TODO Auto-generated method stub
		
		int [] array = {4,2,6};
		
		for (int i=0 ; i<=3 ; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}
	
}
