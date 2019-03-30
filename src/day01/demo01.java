package day01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class demo01 {
	public static void main(String[] args) {
		String str = "hello world";
		//indexOf返回字符所在字符串的索引，不含此字符返回-1
		System.out.println(str.indexOf('x'));
		//charAt返回索引位置的字符
		System.out.println(str.charAt(1));
		//codePointAt返回索引位置的ASCII码值
		System.out.println(str.codePointAt(1));
		//compareToIgnoreCase忽略大小写后，比较如果相同则返回0，否则返回原字符串减去新字符串的第一个不同的字符的ASCII码值
		System.out.println(str.compareToIgnoreCase("HELLO WORLD"));
		System.out.println(str.compareTo("hello vorlddd"));
		System.out.println(str.compareTo("hello xorld"));
		
		System.out.println(str.contains("hello"));
		System.out.println(str.concat("!!!"));
		System.out.println(str.toUpperCase());
		System.out.println(str.endsWith("world"));
		System.out.println(str.startsWith("hello"));
		System.out.println(str.replace('o', 'e'));
		System.out.println(str.replaceAll("o|l", "e"));
		System.out.println(str.replaceAll("hello", "e"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("x ");
		sb.append(1.2);
		sb.append('a');
		sb.append(true);
		System.out.println(sb);
		
		System.out.println("-----------------");
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 4; i++) {
			list.add(String.valueOf(i*i));
		}
		List<String> list1 = new ArrayList<String>();
		for(int i = 0; i < 4; i++) {
			list.add(String.valueOf(i));
		}
		list.addAll(list1);
		System.out.println(list);
	
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(list);
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < 4; i++) {
			map.put(String.valueOf(i), String.valueOf(i*i));
		}
		System.out.println(map);
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "|" + entry.getValue());
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.get("3"));
		System.out.println(map.containsKey("A"));
		
		System.out.println(map.replace("3", "27"));
		System.out.println(map.get("3"));
		
		System.out.println("-------------------");
		
		 Set<String> set = new HashSet<String>();
		 for(int i = 0; i < 3; i++) {
			 set.add(String.valueOf(i));
		 }
		 for(int i = 0; i < 3; i++) {
			 set.add(String.valueOf(i));
		 }
		 System.out.println(set);
		 
		 set.remove("1");
		 System.out.println(set);
		 System.out.println(set.contains("1"));
		 System.out.println(set.isEmpty());
		 System.out.println(set.size());
		 
		 set.addAll(Arrays.asList(new String[] {"A", "B", "C"}));
		 System.out.println(set);
		 
		 for(String s: set) {
			 System.out.println(s);
		 }
		 
		 System.out.println("------------------------");
		 
		 Random random = new Random();
		 random.setSeed(6);
		 System.out.println(random.nextInt(1000));
		 System.out.println(random.nextFloat());
		 
		 Date date = new Date();
		 System.out.println(date);
		 System.out.println(date.getTime());
		 
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(df.format(date));
		 
	}
	
}
