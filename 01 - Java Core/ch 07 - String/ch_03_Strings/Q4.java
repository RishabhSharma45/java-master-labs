package ch_03_Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Q4 {
	
//	Compress a String (Basic Run-Length Encoding)
	// input "aaabbccccd"
// output a3b2c4d1
	
	public String compressString(String s) {
		LinkedHashMap<Character , Integer> map = (LinkedHashMap<Character, Integer>) count(s);

		String ans = "";
		for(Entry<Character, Integer> entry : map.entrySet()) {
			Character c = entry.getKey();
			Integer i = entry.getValue();
			ans = ans + c + i ;
		}
		return ans;
	}

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
		Q4 q4 = new Q4();
		System.out.println(q4.compressString("aaabbcccc"));
	}

}
