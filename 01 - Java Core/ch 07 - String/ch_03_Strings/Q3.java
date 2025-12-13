package ch_03_Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q3 {
	
	//Check if Two Strings are Anagrams (No Sorting Allowed)
	//"silent"
	//"listen"
	
	public boolean anagrams(String s1 , String s2) {
	  if(count(s1).equals(count(s2))) {
		  return true;
	  }
	  else {
		  return false;
	  }
	}
	
	public Map<Character,Integer> count(String s){
	    Map<Character , Integer> map = new TreeMap<>();
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
		Q3 q3 = new Q3();
		System.out.println(q3.anagrams("listen", "silent"));
	}

}
