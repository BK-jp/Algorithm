package paiza.rankC.C037;

import java.util.Scanner;

public class C037 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        
        System.out.println(parseDate(line));
    }
	
	private static String parseDate(String s) {
		String[] split = s.split(" ");
		String[] date = split[0].split("/");
		String[] time = split[1].split(":");
		
		int month = Integer.valueOf(date[0]);
		int day = Integer.valueOf(date[1]);
		int hour = Integer.valueOf(time[0]);
		int minute = Integer.valueOf(time[1]);
		
		if(hour >= 24) {
			day += hour / 24;
			hour = hour % 24;
		}
		
		return String.format("%02d", month)+"/"+String.format("%02d", day)+" "+String.format("%02d", hour)+":"+String.format("%02d", minute);
	}
}
