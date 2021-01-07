package algorithm.step6.q15596;

public class Test {

	long sum(int[] a) {

		long total = 0;

		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}

		return total;
	}
}
