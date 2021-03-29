package com.homework.task02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	
	static void menu() {
		System.out.println("1 ");
		System.out.println("2 ");
		
	}
	

	public static void main(String[] args) {
		
		 Scanner scaner = new Scanner (System.in);
		
		Auto[][] arr = new Auto[8][8];
		
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	            arr[i][j] = new Auto(getRandomPower(200, 360),
						getRandomCreatedAge(1890, 2016),
						getRandomMaterial(1,2),
						getRandomWheelDiametr(20, 38),
						getRandomNumderOfCylinders(2,6));
	        }
	    }
	    for (Auto[] anArr : arr) {
	        for (Auto an : anArr) {
	        	/*System.out.print(anAnArr + " ");*/
	        	
	        	 
	        	while (true) {
	    			menu();
	    		switch (scaner.next()) {
	    		
	    		case "1":{
	    			Arrays.deepToString(anArr);
	    			System.out.println(Arrays.deepToString(anArr));
	    			break;
	    		}
	    		case"2":{
	    			Arrays.fill(anArr, null);
	    			System.out.println(Arrays.toString(anArr));
	    			break;
	    		}
	    		
	    		}
	    		}
	        	 
	        }    
	    }
	    
	   
		
		
	}
	
	
	
	
	
	public static int getRandomPower(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomCreatedAge(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomWheelDiametr(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomNumderOfCylinders(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomMaterial(int min, int  max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	

}
