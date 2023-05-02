package paiza.rankA.A055;

import java.util.Scanner;

public class A055 {
	private static int H;
	private static int W;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] lineSplit = line.split(" ");
        
        H = Integer.valueOf(lineSplit[0]);
        W = Integer.valueOf(lineSplit[1]);
        
        char[][] map = new char[H][W];
        int[] position = new int[2];
        
        for(int i=0;i<H;i++) {
        	String mapInput = sc.nextLine();
        	
        	for(int j=0;j<mapInput.length();j++) {
        		if(mapInput.charAt(j) == 'S') {
        			map[i][j] = '.';
        			position[0] = i;
        			position[1] = j;
        		}else {
        			map[i][j] = mapInput.charAt(j);
        		}
        	}
        }
        
        sc.close();
        
        System.out.println(escape(map, position[1], position[0]));
	}
	
	private static String escape(char[][] map, int x, int y) {
		if(x == W-1 || x == 0 || y == 0 || y == H-1) return "YES";
		else {
			map[y][x] = 'X';
			
			if(map[y+1][x] == '.') {
				String result = escape(map, x, y+1);
				if(result.equals("YES")) return result;
			}
			map[y+1][x] = 'X';
			
			if(map[y-1][x] == '.') {
				String result = escape(map, x, y-1);
				if(result.equals("YES")) return result;
			}
			map[y-1][x] = 'X';
			
			if(map[y][x+1] == '.') {
				String result = escape(map, x+1, y);
				if(result.equals("YES")) return result;
			}
			map[y][x+1] = 'X';
			
			if(map[y][x-1] == '.') {
				String result = escape(map, x-1, y);
				if(result.equals("YES")) return result;
			}
			
			return "NO";
		}
	}
}
