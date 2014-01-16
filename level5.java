/**
 * Java Programming - Level 5
 * http://ideone.com/xIUwb3
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class SmartObjects {
    public static void main(String[] args) {
		trajectory t = new trajectory(new vec(0, 4), new vec(1, 4));
		System.out.println(t.at(9).length);
    }
	static class vec {
		private int length, x, y;
		public vec (int x, int y) {
			this.x = x;
			this.y = y;
			this.length = (int)Math.sqrt(x * x + y * y);
		}
		public vec add (vec v) {
			return new vec(x + v.x, y + v.y);
		}
	}
	static class trajectory {
		private vec position, speed;
		public trajectory (vec position, vec speed) {
			this.position = position;
			this.speed = speed;
		}
		public vec at(int i) {
			if(i > 0)
				return at(i - 1).add(this.speed);
			else 
				return this.position;
		}
	}
}