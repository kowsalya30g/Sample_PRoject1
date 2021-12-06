package ProblemsonMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceCharacter {
	static void charCount(String s) {
		LinkedHashMap<Character,Integer> charCountMap = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(charCountMap.containsKey(c) && c!=' ') {
				charCountMap.put(c, charCountMap.get(c) + 1); 
			}
			
			else if(c!=' ') {
				charCountMap.put(c, 1);
			}
		}
		for(Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue()); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String: ");
		String str = sc.nextLine();
		charCount(str);
	}

}
