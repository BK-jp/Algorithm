package paiza.rankA.A066;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class A066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int N = Integer.valueOf(line);
        
        int[][] dates = new int[N][2];
        
        for(int i=0;i<N;i++) {
        	String values = sc.nextLine();
        	String[] valuesSplit = values.split(" ");
        	
        	dates[i][0] = Integer.valueOf(valuesSplit[0]);
        	dates[i][1] = Integer.valueOf(valuesSplit[1]);
        }
        
        sc.close();
        
        System.out.println(calc(dates));
	}
	
	private static int calc(int[][] dates) {
		Stack<Integer> stack = new Stack<>();
		
		Arrays.sort(dates, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		for(int i=0;i<dates.length;i++) {
			if(stack.empty()) {
				for(int d=dates[i][0];d<=dates[i][1];d++) {
					stack.push(d);
				}
			}else {
				if(dates[i][0] - stack.peek() > 1) {
					int count = 0;
					while(!stack.empty()) {
						stack.pop();
						count++;
					}
					resultList.add(count);
					
					for(int d=dates[i][0];d<=dates[i][1];d++) {
						stack.push(d);
					}
				}else {
					for(int d=stack.peek()+1;d<=dates[i][1];d++) {
						stack.push(d);
					}
				}
			}
			System.out.println(stack);
		}
		
		if(!stack.empty()) {
			int count = 0;
			while(!stack.empty()) {
				stack.pop();
				count++;
			}
			resultList.add(count);
		}
		
		Collections.sort(resultList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		return resultList.get(0);
	}
}
