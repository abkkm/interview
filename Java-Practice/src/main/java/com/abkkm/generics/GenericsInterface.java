package com.abkkm.generics;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

interface Function<T,R>{
	R apply(T value);
}


class GenericsList<T>{
	
	private T[] obj;
	
	public GenericsList(T[] obj) {
		super();
		this.obj = obj;
	}
	

	public <R> Map<R,T> toMap(Function<? super T,? super R> keepMaper)throws Exception{
		Map<R,T> map = new HashMap<R,T>();
		for (int i =0 ; i < obj.length ; i++ ) {
			R r =(R) keepMaper.apply(obj[i]);
			map.put(r, obj[i]);
		}
		return map;
	}
}

public class GenericsInterface {
	
	@Test
	public void test() throws Exception{

//		GenericsList<String> genericsList = new GenericsList<String>(new String[] {"a1","b2","c3"});
//		
//		Map<Character, String> map = genericsList.toMap(new Function<String,Character>() {
//			@Override
//			public Character apply(String value) {
//				// TODO Auto-generated method stub
//				return value.charAt(0);
//			}
//		});
//		

//		//Map<Character, String> map = genericsList.toMap(value -> value.charAt(0));
//		for (Map.Entry<Character, String> entry : map.entrySet()) {
//			Character key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println("key:"+key+" value:"+val);
//		}
		

		Fruit[] f = {new Fruit("apple","100"),new Fruit("banana","50")};
		GenericsList<Fruit> genericsList = new GenericsList<>(f);
		Map<String, Fruit> map = genericsList.toMap(value -> value.getName());
		for (Map.Entry<String, Fruit> entry : map.entrySet()) {
			String key = entry.getKey();
			Fruit val = entry.getValue();
			System.out.println("key:" + key + " value:" + val);
		}
		
	}
}
