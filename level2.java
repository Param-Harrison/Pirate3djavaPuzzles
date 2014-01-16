/**
 * Java Programming - Level 2
 * http://ideone.com/aDlF9V
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class SmartObjects {
    public static void main(String[] args) {
		System.out.println(dot(3, 5, 2, 7));
    }
	public static int dot(int x1, int y1, int x2, int y2) {
		int a = x1 * x2;
		int b = y1 * y2;
		return a + b;
	}
}