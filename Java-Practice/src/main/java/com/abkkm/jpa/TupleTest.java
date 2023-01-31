package com.abkkm.jpa;

import javax.persistence.Tuple;

import org.hibernate.jpa.spi.NativeQueryTupleTransformer;

public class TupleTest {
	public static void main(String[] args) throws Exception, SecurityException, NoSuchMethodException {
	
		NativeQueryTupleTransformer tupleTransformer = new NativeQueryTupleTransformer();
		Object[] obj = new String[] {"1","2","3"};
		String[] alias = new String[] {"name","sex","age"};
		Tuple tuple = (Tuple)tupleTransformer.transformTuple(obj, alias);
		
		Student student = NativeResultProcessUtils.processResult(tuple, Student.class);
		System.out.println(student);
		
	}
}
