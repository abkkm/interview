package com.abkkm.generics;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GenericsClass {

		@Test
		public void genericsClass() {
			Object object = new Object();
			
			ArrayList<Fruit> fruit1 = new ArrayList<>(Arrays.asList(new Fruit()));
			
			ArrayList<Fruit> fruit2 = new ArrayList<>(Arrays.asList(new Apple()));
			
			
		}
}
