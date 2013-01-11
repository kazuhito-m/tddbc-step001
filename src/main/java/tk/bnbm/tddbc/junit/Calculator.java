package tk.bnbm.tddbc.junit;

public class Calculator {
	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("第二引数に0が指定されています。");
		}
		return x / y;
	}
}
