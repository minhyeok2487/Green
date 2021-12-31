package mh.comstudy.StringClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ch05Ex01 {
	public static void main(String[] args) {
		String queryStr = "user=hong&msg=hello&job=killer";
		StringTokenizer st = new StringTokenizer(queryStr, "&");
		HashMap<String, String> messagesMap = new HashMap<String, String>();
		while(st.hasMoreTokens()) {
			String tk = st.nextToken();
			System.out.println(tk);
			String[] keyValue = tk.split("=");
			//System.out.println(Arrays.toString(keyValue));
			messagesMap.put(keyValue[0],keyValue[1]);
		}
		System.out.println();
		System.out.println(messagesMap.get("user"));
		System.out.println(messagesMap.get("msg"));
		System.out.println(messagesMap.get("job"));
		System.out.println();
		
		Iterator<String> it = messagesMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("%s = %s\n",key,messagesMap.get(key));
		}
	}
}
