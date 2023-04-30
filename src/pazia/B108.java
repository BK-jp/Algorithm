package pazia;

import java.util.Scanner;

public class B108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] sizes = line.split(" ");
        int N = Integer.valueOf(sizes[0]);
        int M = Integer.valueOf(sizes[1]);
        
        int[] gondola = new int[N];
        int[] people = new int[M];
        
        for(int i=0;i<N;i++) {
        	gondola[i] = sc.nextInt();
        }
        
        for(int i=0;i<M;i++) {
        	people[i] = sc.nextInt();
        }
        
        int[] result = calc(gondola, people);
        
        for(int r : result) {
        	System.out.println(r);
        }
        
        sc.close();
	}
	
	private static int[] calc(int[] gondola, int[] people) {
		int[] result = new int[gondola.length];
		
		int gidx = 0;
		int pidx = 0;
		
		while(true) {
			if(pidx >= people.length) break;
			
			if(gondola[gidx] >= people[pidx]) {
				result[gidx] += people[pidx];
				people[pidx] = 0;
				pidx++;
				gidx++;
			}else {
				result[gidx] += gondola[gidx];
				people[pidx] -= gondola[gidx];
				gidx++;
			}
			
			if(gidx >= gondola.length) gidx = 0;
		}
		
		return result;
	}
}
