/**
 * Java Programming - Level 4
 * http://ideone.com/VrYi1I
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class SmartObjects {
    public static void main(String[] args) {
		vec v1 = new vec(0, -5);
		vec v2 = new vec(6, 15);
		vec v3 = new vec(2, 7);
		System.out.println(v1.middle(v2).dot(v3));
    }
	static class vec {
		private int x, y;
		public vec (int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int dot (vec v) {
			return x * v.x + y * v.y;
		}
		public vec middle (vec v) {
			return new vec((x + v.x) / 2, (y + v.y) / 2);
		}
	}
}