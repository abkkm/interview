package com.abkkm.classdescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;

import com.abkkm.jpa.Student;


public class ClassTest {
	public static void main(String[] args) throws Exception{
		Class<Student> studentClass =Student.class;
		Field declaredField = studentClass.getDeclaredField("name");
		Method declaredMethod = studentClass.getDeclaredMethod("getName");
		PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(studentClass);
		for (PropertyDescriptor pDescriptor : propertyDescriptors) {
			pDescriptor.getName();
			pDescriptor.getWriteMethod();
			pDescriptor.getReadMethod();
		}
	}
	public int getArrayListCapaCity(ArrayList list) throws Exception{
	    Class c = Class.forName("java.util.ArrayList");
	    Field field = c.getDeclaredField("elementData");
	    field.setAccessible(true);
	    Object[] object = (Object[])field.get(list);
	    return object.length;
	}
}
