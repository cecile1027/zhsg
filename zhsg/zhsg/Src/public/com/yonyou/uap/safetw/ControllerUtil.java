package com.yonyou.uap.safetw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

import org.docx4j.model.datastorage.XPathEnhancerParser.filterExpr_return;
import org.json.JSONException;
import org.json.JSONObject;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class ControllerUtil {
	public static String readFile(File file) throws IOException {
		String retStr = "";
		StringBuffer sb = new StringBuffer();
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(
					new FileInputStream(file), "gbk"));
			String tempStr = "";
			while ((tempStr = bufferedReader.readLine()) != null) {
				sb.append(tempStr);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
				bufferedReader = null;
			}
		}
		retStr = sb.toString();
		return retStr;
	}

	public static boolean isKeyInJson(JSONObject obj, String keyName) {
		if (obj == null) {
			return false;
		}
		Iterator<String> keyIt = obj.keys();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			if (keyName.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public static Object getObjectByKey(JSONObject obj, String keyName)
			throws JSONException {
		if (obj == null) {
			return null;
		}
		Iterator<String> keyIt = obj.keys();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			if (keyName.equals(key)) {
				return obj.get(key);
			}

		}
		return null;

	}

	/**
	 * trans map to json object
	 * 
	 * @param map
	 * @return
	 * @throws JSONException
	 */
	public static String transMapToJsonStr(Map map) {
		StringBuffer jsonStr = new StringBuffer();
		jsonStr.append("{");
		if (map != null && !map.isEmpty()) {
			for (Object key : map.keySet()) {
				if (map.get(key) != null) {
					jsonStr.append("\"").append(key.toString()).append("\"")
							.append(":\"").append(map.get(key).toString())
							.append("\",");
				}
				jsonStr.append("\"").append(key.toString()).append("\"")
						.append(":\"").append("\"").append("\"");
			}

		}
		String tempStr = jsonStr.substring(0, jsonStr.length() - 1) + "}";
		return tempStr.replace("\"{", "{").replace("}\"", "}");
	}

	public static JSONObject transMapToJson(Map map) throws JSONException {
		JSONObject jsonObj = new JSONObject();
		Iterator i$;
		if ((map != null) && (!map.isEmpty())) {
			for (i$ = map.keySet().iterator(); i$.hasNext();) {
				Object key = i$.next();
				if (map.get(key) != null) {
					jsonObj.put(key.toString(), map.get(key));
				}else {
					jsonObj.put(key.toString(), "");
				}
			}
		}
		


		return jsonObj;
	}
	

	
	/*public static JSONObject transMapToJson2(Map map) throws JSONException {
		JSONObject jsonObj = new JSONObject();
		Iterator i$;
		if ((map != null) && (!map.isEmpty())) {
			for (i$ = map.keySet().iterator(); i$.hasNext();) {
				Object key = i$.next();
				if (map.get(key) != null) {
					if(java.util.ArrayList.class.isInstance(map.get(key))){
						ArrayList<Map> list=(ArrayList)map.get(key);
						
						StringBuffer sBuffer=new StringBuffer();
						Iterator<Map> it=list.iterator();
						
						while(it.hasNext()){
							sBuffer.append(",");
							sBuffer.append(ControllerUtil.transMapToJson((Map)it.next()));
						}

						jsonObj.put(key.toString(), sBuffer.toString());
					} else {
						jsonObj.put(key.toString(), map.get(key));
					}
				}else {
					jsonObj.put(key.toString(), "");
				}	
				
			}
			
		}

		return jsonObj;
	}*/

	public static void main(String[] args) {
		String testJsonStr = "{\"key1\":[{\"value1\":\"11\"},{\"value2\":\"22\"}],\"key2\":\"33\"}";
		try {
			JSONObject jsonObj = new JSONObject(testJsonStr);
			Iterator<String> keyIt = jsonObj.keys();
			while (keyIt.hasNext()) {
				System.out.println(keyIt.next());
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
