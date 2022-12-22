package prob1;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
//		int[] a = {10, 20, 30, 40}
//		int[] a = new int[4];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
		
		double[] d = ArrayUtil.intToDouble(new int[] {10, 20, 30, 40});
		System.out.println(Arrays.toString(d));
		
		int[] arrInt = ArrayUtil.doubleToInt(new double[] {11.1, 22.2, 33.3, 44.4});
		System.out.println(Arrays.toString(arrInt));
		
		int[] arrConcat = ArrayUtil.concat(new int[] {1, 2, 3}, new int[] {4, 5, 6});
		System.out.println(Arrays.toString(arrConcat));
	}
}