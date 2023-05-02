package paiza.rankA.A051;

import java.util.Scanner;

public class A051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineSplit = line.split(" ");
        
        int N = Integer.valueOf(lineSplit[0]);
        int M = Integer.valueOf(lineSplit[1]);
        
        int[][] map = new int[N][M];
        
        for(int i=0;i<N;i++) {
        	String[] values = sc.nextLine().split(" ");
        	
        	for(int j=0;j<values.length;j++) {
        		map[i][j] = Integer.valueOf(values[j]);
        	}
        }
        
        sc.close();
        
        System.out.println(calc(map));
	}
	
	private static int calc(int[][] map) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(i == 0) continue;
				else if(j == 0){
					map[i][j] += Math.max(map[i-1][j], map[i-1][j+1]);
					continue;
				}else if(j == map[i].length - 1) {
					map[i][j] += Math.max(map[i-1][j], map[i-1][j-1]);
					continue;
				}else {
					map[i][j] += Math.max(map[i-1][j], Math.max(map[i-1][j-1], map[i-1][j+1]));
				}
			}
			printMap(map);
		}
		
		int result = 0;
		for(int i=0;i<map[map.length-1].length;i++) {
			result = Math.max(result, map[map.length-1][i]);
		}
		
		return result;
	}
	
	public static void printMap(int[][] map) {
		for(int[] row : map) {
			for(int r : row) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println();
	}
}
