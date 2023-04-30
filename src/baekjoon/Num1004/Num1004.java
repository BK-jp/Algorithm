package baekjoon.Num1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1004 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.valueOf(reader.readLine());
		int[] start = new int[2];
		int[] end = new int[2];
		
		String[] values = reader.readLine().split(" ");
		start[0] = Integer.valueOf(values[0]);
		start[1] = Integer.valueOf(values[1]);
		end[0] = Integer.valueOf(values[2]);
		end[1] = Integer.valueOf(values[3]);
		
		StringBuilder sb = new StringBuilder();
		
		for(int t=0;t<testCase;t++) {
			int plantNumber = Integer.valueOf(reader.readLine());
			int[][] plants = new int[plantNumber][3];
			
			for(int i=0;i<plantNumber;i++) {
				values = reader.readLine().split(" ");
				
				plants[i][0] = Integer.valueOf(values[0]);
				plants[i][1] = Integer.valueOf(values[1]);
				plants[i][2] = Integer.valueOf(values[2]);
			}
			
			sb.append(calc(start, end, plants)+"\n");
		}
		
		System.out.println(sb.toString());
	}
	
	private static int calc(int[] start, int[] end, int[][] plants) {
		System.out.println("start = "+start[0]+", "+start[1]);
		System.out.println("end = "+end[0]+", "+end[1]);
		
		System.out.println("plants");
		for(int[] p : plants) {
			System.out.println(p[0]+" "+p[1]+" "+p[2]);
		}
		
		return 0;
	}
}
