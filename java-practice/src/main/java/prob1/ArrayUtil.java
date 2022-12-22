package prob1;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] d = new double[a.length];
		
		for(int i = 0; i < d.length; i++) {
			d[i] = a[i];
		}
		
		return d;
	}

	public static int[] doubleToInt(double[] d) {
		int[] a = new int[d.length];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)d[i];
		}
		
		return a;
	}
	
	public static int[] concat(int[] a1, int[] a2) {
		int addedLength = a1.length + a2.length;
		int[] rarray = new int[addedLength];
		for(int i=0; i<a1.length;i++)
			rarray[i] = a1[i];
		for(int i=a1.length;i<addedLength;i++)
			rarray[i] = a2[i-a1.length];
		return rarray;
	}

}