package com.homework.task01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Aplication {

	public static void main(String[] args) {
	
		
		Integer[] array = {getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100),
							getRandomValueFromRange(20,100)};
		System.out.println(Arrays.toString(array));
			
		System.out.println("Asc");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println("Desc");
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
	
	public static int getRandomValueFromRange(int min, int max) {
	
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
	
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}

}
