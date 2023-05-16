package map_Assignment;

import java.util.HashMap;
import java.util.Map;

public class C_01_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I love India Pune";
		
		char ch;
		int count =0;
		
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		
		for (int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			
			if(map.containsKey(ch))
			{
				 count=map.get(ch);
				 count++;
				 map.replace(ch, count);
				 
			}
			
			else
			{
			map.put(ch, 1);
			}
			
			
			

	}
		for(Character ch1: map.keySet())
		{
			
			System.out.println(ch1+" "+map.get(ch1));
		}

	}
}
