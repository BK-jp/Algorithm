package paiza.rankC.C056;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C056 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] split = line.split(" ");
        int N = Integer.valueOf(split[0]);
        int M = Integer.valueOf(split[1]);
        
        int[][] student = new int[N][2];
        
        for(int i=0;i<N;i++) {
        	line = sc.nextLine();
        	split = line.split(" ");
        	
        	student[i][0] = Integer.valueOf(split[0]);
        	student[i][1] = Integer.valueOf(split[1]);
        }
        
        sc.close();
        
        List<Integer> result = calc(student, M);
        for(Integer r : result) {
        	System.out.println(r);
        }
    }
	
	private static List<Integer> calc(int[][] student, int point) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<student.length;i++) {
			int personalPoint = student[i][0] - (student[i][1] * 5) < 0 ? 0 : student[i][0] - (student[i][1] * 5);
			
			if(personalPoint >= point) list.add(i+1);
		}
		
		return list;
	}
}
