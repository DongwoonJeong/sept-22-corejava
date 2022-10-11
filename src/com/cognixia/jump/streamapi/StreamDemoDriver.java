package com.cognixia.jump.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] primitive = {2,4,6,8,10,12,14,16};
		
		//In need to convert the above array of ints to an array of objects impretive way to do it.
		Integer[] pri= new Integer[primitive.length];
		for(int i=0; i < primitive.length; i++) {
			pri[i] = primitive[i];
			}
		
		// with stream //be useful when getting bunch of data from database
		Integer[] intObjs = Arrays.stream(primitive).boxed().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(primitive));
		System.out.println(Arrays.toString(pri));
		System.out.println(Arrays.toString(intObjs));
		
		List<Integer> numbers = Arrays.asList(pri);
		System.out.println("\nFor Each example:");
		numbers.forEach(System.out::println);
		
		numbers.forEach(n->System.out.println(n + " custom message!"));
		
		
		//use reduce to get the sum
		int sum = numbers.stream().reduce(0, (num1, num2) ->(num1+num2));
		System.out.println(sum);
		//use reduce for logical binary choices, get max value
		int max= numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();
		/*?==if num1 is bigger then num2 return num1*/
		/*: == else if*/
		System.out.println(max);
		//Let's stream some custom objects.
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("John", 110_000, "production"));
		employees.add(new Employee("Doe", 200_000, "Director"));
		employees.add(new Employee("Jane", 150_000, "Script Writer"));
		employees.add(new Employee("Doe", 150_000, "IT"));
		employees.add(new Employee("Arun", Integer.MAX_VALUE, "secret"));
		
		//return the employee with the lowest salary
		Employee lowest = employees.stream().reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).get();
		System.out.println(lowest);
		//find the max
		String searchValue = "Tom";
		Optional<Employee> search = employees.stream().filter(e -> e.getName().equalsIgnoreCase(searchValue)).findFirst();
		if(search.isPresent()) {
		System.out.println(search.get());
		}else System.out.println(searchValue + " not found.");
		
		//.map() applies a custom function to all entries in the stream
		List<Integer> employeesAfterRaise = employees.stream().map(e -> e.getSalary(e.setSalary()*2).collect(Collectors.toList());
		System.out.println(employees);
		
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		System.out.println(employees);
		
		
		
		
		
		
		
		
		
	}

}
