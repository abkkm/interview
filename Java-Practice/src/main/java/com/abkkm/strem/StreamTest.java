package com.abkkm.strem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Dishf{
	int f;

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
}


class Dish extends Dishf{
	String name;
	int price;
	int calories;

	public Dish(String name, int calories) {
		super();
		this.name = name;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", calories=" + calories + "]";
	}

}

class Dish2 extends Dish{

	public Dish2(String name, int calories) {
		super(name, calories);
		// TODO Auto-generated constructor stub
	}
	private String zlo;
	public String getZlo() {
		return zlo;
	}
	public void setZlo(String zlo) {
		this.zlo = zlo;
	}
	
	
}
public class StreamTest {
	
	public static void main(String[] args) {
		
		Dishf dishf = new Dishf();
		List<Dish> menu = Arrays.asList(new Dish("pork", 800), new Dish("beef", 700), new Dish("chicken", 400), new Dish("chicken123", 400),
				new Dish("french fries", 530), new Dish("rice", 350), new Dish("fruit", 120), new Dish("pizza", 550),new Dish2("zlo", 0)
				);

		
		//流过滤
		List<Dish> lowCaloriesDishName=menu.stream()
				.filter(d->d.getCalories()<400)
				.collect(Collectors.toList());
		for(Dish name:lowCaloriesDishName)
			System.out.println(name);
		
		menu.stream().filter(new Predicate<Dish>() {
			public boolean test(Dish t) {
				return t.getCalories() < 400;
			};
		}).collect(Collectors.toList());
		
		
		Optional<Dish> findAny = menu.stream().filter(t -> t.getCalories()<400).findAny();
		System.out.println(findAny.get());
		
		Optional<Dish> max = menu.stream().max((o1, o2) -> o1.getCalories()-o2.getCalories());
		Optional<Dish> max1 = menu.stream().max(Comparator.comparingInt(Dish::getCalories));
		System.out.println(max.get());
		System.out.println(max1.get());
		
		
		Optional<Integer> findFirst = menu.stream().map(t -> t.getCalories()).findFirst();
		System.out.println(findFirst.get());
		
	

		Map<Boolean, List<Dish>> collect = menu.stream().collect(Collectors.partitioningBy(t -> t.getCalories()>300));
		System.out.println(collect);
		
		Map<Integer, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(t -> t.getCalories()));
		System.out.println(collect1);

		List<Dish> collect2 = menu.stream().sorted(Comparator.comparing(Dish::getCalories)).collect(Collectors.toList());
		System.out.println(collect2);
		
		Map<String, Dish> map = menu.stream().collect(Collectors.toMap(new Function<Dish, String>() {
			public String apply(Dish t) { return t.getName();};
		}, new Function<Dish, Dish>() {
			public Dish apply(Dish t) { return t;};
		}));
		System.out.println("_________________________________________");
		System.out.println(map);
		
		Function<? super Dish, ? extends String> keyMapper =new Function<Dish, String>() {
			public String apply(Dish t) { return t.getName();};
		};
		
	}

}
