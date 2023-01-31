package com.abkkm.list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class GenericList {
	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(1);
		iList.add(2);
		List<? extends Number > nList = iList;
		for (Number num : nList) {
			System.out.println(num);
		}
		List<Object> oList = new ArrayList<Object>();
		oList.add((Object)1);
		List<? super String> sList=oList;
		Object object = sList.get(0);
		System.out.println(object);
		
	
		
	}
	
}
