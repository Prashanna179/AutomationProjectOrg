package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Programs {

public static void main(String args[])
{
HashMap<Integer , String> h = new HashMap<Integer,String>();
h.put(1, "John Smith");      
h.put(2, "Alice Johnson");
h.put(3, "David Wilson");
h.put(4, "Emily Brown");
h.put(5, "Emily Brown Aysil");

Set<Entry<Integer, String>> entry = h.entrySet();
ArrayList<String> a = new ArrayList<String>();
for(Entry<Integer,String> e : entry)
{
	
	a.add(e.getValue());
	
}

System.out.println(a);

System.out.println(a.stream().sorted().collect(Collectors.toList()));

List<String> l = a.stream().sorted().collect(Collectors.toList());

/*Comparator<String> c = new Comparator<String>()
{

	@Override
	public int compare(String o1, String o2) {
		
	String s1[] = o1.split(" ");
	String s2[] = o2.split(" ");
	return Character.valueOf(s1[s1.length-1].charAt(0)).compareTo(Character.valueOf(s2[s2.length-1].charAt(0)));
	
	}
};

l.sort(c);
System.out.println(l);*/

l.sort((o1,o2)->{
	String s1[] = o1.split(" ");
	String s2[] = o2.split(" ");
	return Character.valueOf(s1[s1.length-1].charAt(0)).compareTo(Character.valueOf(s2[s2.length-1].charAt(0)));
});
System.out.println(l);

HashMap<Integer , List<String>> h1 = new HashMap<Integer,List<String>>();
h1.put(1,l);
System.out.println(h1);





//Reverse each word of String

String s = "hello welcome to Java class";
String ss[] = s.split(" ");

String finalWord = "";
for(int i=0;i<ss.length;i++)
{
	String word = ss[i];
	String reverseWord = "";
	//reverse the word
	
	for(int j=word.length()-1;j>=0;j--)
	{
		reverseWord = reverseWord + word.charAt(j);
	}
	
	finalWord = finalWord + reverseWord + " ";
}

    System.out.println(finalWord);
    
StringBuilder sb = new StringBuilder(s);
sb.reverse().toString();
System.out.println(sb);
}
}




