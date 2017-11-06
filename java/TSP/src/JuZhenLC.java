

public class JuZhenLC {
	static int p[] = { 30, 35, 15, 5, 10, 20, 25 };
	public static void main(String[] args) {	
		System.out.println("最少的连乘次数为："+getMatrixChain(1,6));
	}
	public static int getMatrixChain(int i, int j) {
		int min = 0;
		if (i == j) {
			return 0;
		}
		for (int r = i; r < j; r++) {
			int time = getMatrixChain(i, r)
					+ getMatrixChain(r + 1, j) + p[i - 1] * p[r] * p[j];
			
			if (r == i) {
				min = time;
			}
			if (min > time) {
				min = time;
			}
		}
		return min;

	}
}