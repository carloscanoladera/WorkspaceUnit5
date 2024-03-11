package numeric;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Random;

public class BigDecimalExample {

	public static void main(String[] args) {

		BigDecimal bdFromString = new BigDecimal("0.1");
		BigDecimal bdFromCharArray = new BigDecimal(new char[] { '3', '.', '1', '6', '1', '5' });
		BigDecimal bdlFromInt = new BigDecimal(42);
		BigDecimal bdlFromInt2 = new BigDecimal(6);
		BigDecimal bdFromLong = new BigDecimal(123412345678901L);
		BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
		BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);

		// Addition of two BigDecimals
		bdFromString = bdFromString.add(bdlFromInt);
		System.out.println("BigDecimal1 = " + bdFromString);

		// Multiplication of two BigDecimals
		bdFromString = bdFromString.multiply(bdFromString);
		System.out.println("BigDecimal1 = " + bdFromString);

		// Subtraction of two BigDecimals
		bdFromString = bdFromString.subtract(bdlFromInt);
		System.out.println("BigDecimal1 = " + bdFromString);

		// Division of two BigDecimals
		bdlFromInt = bdlFromInt.divide(bdlFromInt2);
		System.out.println("bdFromBigInteger = " + bdlFromInt);

		// BigDecima1 raised to the power of 2
		bdFromString = bdFromString.pow(2);
		System.out.println("BigDecimal1 = " + bdFromString);

		// Negate value of BigDecimal1
		bdFromString = bdFromString.negate();
		System.out.println("BigDecimal1 = " + bdFromString);

	}

}
