package hw1;

public class hw1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0x0000;
		char a = 0xFFF7;
		char b = 0x0001;
		char c = 0x7FFF;
		
		result = a & b;
		System.out.printf("a.0x%04X\n", result);
		
		result = a | b;
		System.out.printf("b.0x%04X\n", result);
		
		result = a & c;
		System.out.printf("c.0x%04X\n", result);
		
		result = a | c;
		System.out.printf("d.0x%04X\n", result);
		
		result = b & c;
		System.out.printf("e.0x%04X\n", result);
		
	}

}
