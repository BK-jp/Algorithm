package paiza.rankS.S007;

import java.util.Scanner;
import java.util.Stack;

public class S007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		sc.close();
		
		System.out.println(calc(line));
	}
	
	private static String calc(String line) {
		long[] count = new long[26];
		
		count = settingCount(line, count);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<count.length;i++) {
			sb.append((char)(i+97)+" "+count[i]+"\n");
		}
		
		return sb.toString();
	}
	
	private static long[] settingCount(String line, long[] count) {
		if(line.indexOf(')') != -1) {
			String replaceString = line.substring(line.substring(0, line.indexOf(')')).lastIndexOf('('), line.indexOf(')')+1);
			String innerString = replaceString.substring(1, replaceString.length()-1);
			
			String beforeString = line.substring(0, line.indexOf(replaceString));
			String multipleString = "";
			Stack<Character> stack = new Stack<Character>();
			for(int i=beforeString.length()-1;i>=0;i--) {
				if(beforeString.charAt(i) >= '0' && beforeString.charAt(i) <= '9') {
					stack.push(beforeString.charAt(i));
					continue;
				}
				break;
			}
			
			while(!stack.isEmpty()) {
				multipleString += stack.pop();
			}
			
			String newString = "";
			String number = "";
			for(int i=0;i<innerString.length();i++) {
				if(innerString.charAt(i) >= '0' && innerString.charAt(i) <= '9') {
					number += innerString.charAt(i);
				}else {
					if(number.equals("")) {
						newString += multipleString+innerString.charAt(i);
					}else {
						newString += String.valueOf(Long.valueOf(number) * Long.valueOf(multipleString != "" ? multipleString : "1"))+((char)innerString.charAt(i));
						number = "";
					}
				}
			}
			
			line = line.replace(multipleString+replaceString, newString);
			
			return settingCount(line, count);
		}
		
		long[] newCount = calcString(line);
		for(int i=0;i<count.length;i++) {
			count[i] += newCount[i];
		}
		
		return count;
	}
	
	private static long[] calcString(String str) {
		long[] count = new long[26];
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				String beforeString = str.substring(0, i);
				String multipleString = "";
				
				Stack<Character> stack = new Stack<Character>();
				for(int j=beforeString.length()-1;j>=0;j--) {
					if(beforeString.charAt(j) >= '0' && beforeString.charAt(j) <= '9') {
						stack.push(beforeString.charAt(j));
						continue;
					}
					break;
				}
				
				while(!stack.isEmpty()) {
					multipleString += stack.pop();
				}
				
				count[str.charAt(i)-97] += Long.valueOf(multipleString != "" ? multipleString : "1");
			}
		}
		
		return count;
	}
}
