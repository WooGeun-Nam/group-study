package prob1;

public class ArrayUtil {
	
	// 1. int 배열 -> double 배열
	public static double[] intToDouble(int[] source)  {
		double[] result = new double[source.length];
		
		for (int i = 0; i < source.length; i++) {
			result[i] = (double) source[i];
		}
		return result;
	}
	
	// 2. double 배열 -> int 배열
	public static int[] doubleToInt(double[] source) {
		int[] result = new int[source.length];
		
		for (int i = 0; i < source.length; i++) {
			result[i] = (int) source[i];
		}
		return result;
	}
	
	// 3. int 배열 연결
	public static int[] concat(int[] is, int[] is2) {
		int sumIdx = is.length + is2.length;
		int[] result = new int[sumIdx];
		
		int idx = 0;
		for (int n : is) {
			result[idx++] = n;
		}
		
		for (int n : is2) {
			result[idx++] = n;
		}
		
		return result;
	}
}