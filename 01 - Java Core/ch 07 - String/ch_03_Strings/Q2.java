package ch_03_Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q2 {
	
	//Q2. Count Frequency of Each Character (Case Sensitivity Off)
	//"Rishabh"
 // R - 1
//	I - 1
//	S - 1
//	H - 2
//	A - 1
//	B - 1

	public Map<Character,Integer> count(String s){
	    Map<Character , Integer> map = new LinkedHashMap<>();
		int i = 0;
		s=s.toLowerCase();
		while(i<s.length()) {
			if(map.containsKey(s.charAt(i))){
				Integer count = map.get(s.charAt(i));
				map.replace(s.charAt(i), ++count);
			}
			else {
				Integer count = map.get(s.charAt(i));
				map.put(s.charAt(i), 1);
			}
			i++;
		}
		return map;
	}

	public static void main(String[] args) {
			Q2 q2 = new Q2();
			System.out.println(q2.count("Rishabh"));
	}

}
