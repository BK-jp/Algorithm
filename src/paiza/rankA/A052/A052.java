package paiza.rankA.A052;

import java.util.Scanner;

public class A052 {
	private static int N;
	private static int A;
	private static int B;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        N = Integer.valueOf(line);
        
        String[] valueSplit = sc.nextLine().split(" ");
        
        A = Integer.valueOf(valueSplit[0]);
        B = Integer.valueOf(valueSplit[1]);
        
        sc.close();
        int[] step = new int[N+1];
        System.out.println(calc(step, A, B, 1));
	}
	
	private static int calc(int[] step, int start, int end, int depth) {
		if(start == 1) return 0;
		if(start >= N) {
			int count = 0;
			for(int s : step) count += s;
			return N - count;
		}
		
		for(int i=start;i<=end;i+=(B-A)) {
			if(i < N) {
				if(step[i] != 1) {
					step[i] = 1;
				}
			}else {
				if(step[N] != 1) {
					step[N] = 1;
				}
				break;
			}
		}
		
		return calc(step, A * (depth+1), B * (depth+1), depth+1);
	}
	
}
