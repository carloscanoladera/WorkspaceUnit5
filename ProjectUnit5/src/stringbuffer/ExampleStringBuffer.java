package stringbuffer;

public class ExampleStringBuffer {
	
	public static void main(String[] args) {

		StringBuffer Two = new StringBuffer(20);
		StringBuffer One = new StringBuffer("Hello World");
		Two.append("Hello there");
		Two.replace(0,5,"Yellow");

		One.append("Bye World");
		System.out.println("One:" + One);

		System.out.println("Capacity:" + One.capacity());
		One.ensureCapacity(100);
		System.out.println("Capacity:" + One.capacity());
		One.insert(11, "-Something in the middle-");
		System.out.println("String" + One.toString());
		System.out.println("Length:" + One.length());
		System.out.println("String Two:" + Two);
		System.out.println("Reverse:" + Two.reverse());
		
	  

	}

}
