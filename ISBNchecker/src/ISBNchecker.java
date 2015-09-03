// Blake Rish $ Yue Yu
public class ISBNchecker {

	
	public static boolean isISBN(String isbn) {
			
		int sum = Character.getNumericValue(isbn.charAt(0));
			
			for (int i = 1; i < 9; i++) {
				sum = sum + (i + 1) * (Character.getNumericValue(isbn.charAt(i)));
			}
			
			int r = sum % 11;
			
			if (r == Character.getNumericValue(isbn.charAt(9)) || (r == 10 && isbn.charAt(9) == 'X')) {
				return true;
		    }
			
			else {
				return false;
			}
		
		
	}
public static void main (String[] args) {
	System.out.println(isISBN ("0205080057"));
	System.out.println(isISBN ("0136091812"));
	System.out.println(isISBN ("123456789X"));
}
}
