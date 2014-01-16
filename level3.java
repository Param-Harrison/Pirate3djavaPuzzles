/**
 * Java Programming - Level 3
 * http://ideone.com/g2YiPd
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class SmartObjects {
    public static void main(String[] args) {
		System.out.println(new vec(3, 5).dot(2, 7));
    }
	static class vec {
		private int x1, y1;
		public vec (int x1, int y1) {
			this.x1 = x1;
			this.y1 = y1;
		}
		public int dot (int x2, int y2) {
			return x1 * x2 + y1 * y2;
		}
	}
}