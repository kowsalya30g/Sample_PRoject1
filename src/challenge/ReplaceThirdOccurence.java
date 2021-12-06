package challenge;

import java.util.Scanner;

public class ReplaceThirdOccurence {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	  System.out.println("Enter  string ");
  	  String str=sc.nextLine();
  	  String s = tolower(str);
  	  System.out.println(thirdOccurence(s));
  	  
	}
	private static String thirdOccurence(String s) {
		String temp = " ";
		String t = " ";
		for(int i=0;i<s.length();i++) {
			int len = temp.length();
			int count = 0;
			int c = 0;
			for(int j=0;j<len;j++) {
				if(s.charAt(i)==temp.charAt(j)) {
					count++;
				}
			}
			for(int k=0;k<t.length();k++) {
				if(s.charAt(i)==t.charAt(k)) {
					c++;
				}
			}
			if(count == 2 && c == 0) {
				temp = temp + "*";
				t=t+s.charAt(i);
			}else {
				temp = temp + s.charAt(i);
			}
		}
		return temp;
	
	}
	
	private static String tolower(String s) {
		String g = " ";
		for(int i=0;i<s.length();i++) 
  	  {
  	    char ch;
		if(s.charAt(i)>='A' && s.charAt(i)<='Z') 
  		  
  			  ch=(char)(s.charAt(i)+32);
  			  else 
  				  ch=s.charAt(i);
  			  g+=ch;
  	 }
		return g;
	}

}
