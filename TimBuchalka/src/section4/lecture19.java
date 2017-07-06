package section4;

public class lecture19 {

	public static void main(String[] args) {
		byte aByte = 65;
		short aShort = 9876;
		int aInt = 7784756;
		
		long aLong = 50000 + (10 * (aByte + aShort + aInt));
		
		System.out.println("aLong = " + aLong);
	}
}
