package numeric;

import java.math.BigInteger;

public class BigIntegerEjemplo {

	static BigInteger factorialRecursive(BigInteger n) {
		if (n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return n.multiply(factorialRecursive(n.subtract(BigInteger.ONE)));
	}

	static BigInteger factorialBig(int N) {
		// Initializa el resultado
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

		// Multiplica f por 2, 3, ...N
		for (int i = 2; i <= N; i++)
			f = f.multiply(BigInteger.valueOf(i));

		return f;
	}

	static double factorial(double n) {
		if (n == 1.0)
			return 1.0;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger bi1 = BigInteger.ZERO.setBit(63); // 0100000000000000000000000000000000000000
		String str = bi1.toString(2);

		System.out.println(bi1);
		System.out.println(bi1.bitLength());
		System.out.println(bi1.signum());

		System.out.println("factorialBig(1000) con un BigInteger:" + factorialBig(1000));
		System.out.println("factorial(1000) con un double:" + factorial(1000));

	}

}
