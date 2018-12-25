package chapter2;

import edu.princeton.cs.algs4.StdDraw;

public class SelectionBars {
	public static void sort(double[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;i<n;j++)
				if(less(a[j],a[min])) min=j;
			show(a, i, min);
			exch(a, i, min);
		}
	}
	
	private static boolean less(double a,double b) {
		return a<b;
	}
	
	private static void exch(double[] a,int i,int j){
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
	}
	
	private static void show(double[] a,int i,int min) {
		StdDraw.setYscale(-a.length);
	}
	
	
}
