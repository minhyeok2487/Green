package org.comstudy.ch08.json;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestJsonObj2 {

	public void TestJsonObj2Read() throws FileNotFoundException{
		InputStream is = this.getClass().getResourceAsStream("members.json");
		JSONTokener tk = new JSONTokener(is);
		JSONObject jobj = new JSONObject(tk);
		
		System.out.println(jobj.toString(0));
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		new TestJsonObj2(); 

	}

}
