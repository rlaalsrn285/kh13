package oop.key4;

public class Area {
		
		public static int square(int a) {
			return a*a;
		}
		public static double tri(int a , int b ) {
			return  ( (a*b)/2d );
		}
		public static float circle(int a) {
			return a*a*3.14f;
		}
		public static int subway(int a) {
			int b = 2023;
			int c = b-a;
			int d = 0;
			if (c >=20 && c < 65) {
				d = 1400;
			}else if (c >=14 && c < 20) {
				d = 800;
			}else if (c >=8 && c > 14) {
				d = 500;
			}else {
				d = 0;
			}
			return d;
		}
		
		public static boolean leap(int a) {
			if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
				return true;
			}else {
				return false;
		}
		}
		public static double bmi(double a , double b) {
			double c = a/100;
			return b / (c*c);
		}
		
}


