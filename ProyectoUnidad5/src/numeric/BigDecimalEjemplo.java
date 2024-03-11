package numeric;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Random;

public class BigDecimalEjemplo {

	public static void main(String[] args) {

		BigDecimal bdFromString = new BigDecimal("0.1");
		BigDecimal bdFromCharArray = new BigDecimal(new char[] { '3', '.', '1', '6', '1', '5' });
		BigDecimal bdlFromInt = new BigDecimal(42);
		BigDecimal bdlFromInt2 = new BigDecimal(6);
		BigDecimal bdFromLong = new BigDecimal(123412345678901L);
		BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
		BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);

		// sumamos dos BigDecimals
		bdFromString = bdFromString.add(bdlFromInt);
		System.out.println("BigDecimal1 = " + bdFromString);

		// Multiplicacion de dos BigDecimals
		bdFromString = bdFromString.multiply(bdFromString);
		System.out.println("BigDecimal1 = " + bdFromString);

		// resta de dos BigDecimals
		bdFromString = bdFromString.subtract(bdlFromInt);
		System.out.println("BigDecimal1 = " + bdFromString);

		// Division de dos BigDecimals
		bdlFromInt = bdlFromInt.divide(bdlFromInt2);
		System.out.println("bdFromBigInteger = " + bdlFromInt);

		// BigDecima1 elevado a 2
		bdFromString = bdFromString.pow(2);
		System.out.println("BigDecimal1 = " + bdFromString);

		// valor signo cambiado de  BigDecimal1
		bdFromString = bdFromString.negate();
		System.out.println("BigDecimal1 = " + bdFromString);

	}

}
