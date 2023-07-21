package com.nt.main;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
	public static void main(String[]args){
		String str="Sanjivani";
		Map<Character,Integer>frequencyMap=countCharacterfrequency(str);
		System.out.println("charcater frequency");
		for(Map.Entry<Character,Integer>entry:frequencyMap.entrySet()){
		System.out.println(entry.getKey()+":"+entry.getValue());
		}
		}
		public static Map<Character,Integer> countCharacterfrequency(String str){
		Map<Character,Integer> frequencyMap=new HashMap<>();
		for(char c:str.toCharArray()){
		frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);

		}
		return frequencyMap;
		}

		}