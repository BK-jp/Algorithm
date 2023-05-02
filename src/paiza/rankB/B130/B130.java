package paiza.rankB.B130;

import java.util.Scanner;

public class B130 {
	private static int N;
	private static int M;
	private static int end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] values = line.split(" ");
        
        N = Integer.valueOf(values[0]);
        M = Integer.valueOf(values[1]);
        
        char[][] map = new char[N][M];
        
        for(int i=0;i<N;i++) {
        	String text = sc.nextLine();
        	
        	for(int j=0;j<M;j++) {
        		map[i][j] = text.charAt(j);
        	}
        }
        
        end = N * M;
        
        char[][] block = new char[3][3];
        for(int i=0;i<3;i++) {
        	String text = sc.nextLine();
        	for(int j=0;j<3;j++) {
        		block[i][j] = text.charAt(j);
        	}
        }
        
        sc.close();
        
        System.out.println(calc(map, block, 0));
	}
	
	private static String calc(char[][] map, char[][] block, int depth) {
		if(depth > end) return "No";
		else {
			int y = (depth / M) % N;
			int x = depth % M;
			
			if(check(map, block, x, y, 0)) return "Yes";
			else return calc(map, block, depth+1);
		}
	}
	
	private static boolean check(char[][] map, char[][] block, int x, int y, int count) {
		if(count == 4) return false;
		
		for(int i=0;i<block.length;i++) {
			for(int j=0;j<block[i].length;j++) {
				if(y+i >= map.length) {
					if(block[i][j] == '#') return check(map, rotate(block), x, y, count+1);
				}else if(x+j >= map[y+i].length){
					if(block[i][j] == '#') return check(map, rotate(block), x, y, count+1);
				}else {
					if(map[y+i][x+j] == '#' && block[i][j] == '#') return check(map, rotate(block), x, y, count+1);
				}
			}
		}
		
		return true;
	}
	
	private static char[][] rotate(char[][] block){
		char[][] result = new char[3][3];
		for(int i=0;i<block.length;i++) {
			for(int j=0;j<block[i].length;j++) {
				result[3-j-1][i] = block[i][j];
			}
		}
		
		return result;
	}
}
