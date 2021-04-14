package com.geek.algorithm.light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class LightApplication {

	public static void main(String[] args) {
		SpringApplication.run(LightApplication.class, args);
//		try{
//			System.out.println("a");
//			throw new Exception("");
//		} catch(Exception e) {
//			System.out.println("b");
//		} finally{
//			System.out.println("c");
//		}

		char[] temp = new char[5];
		Arrays.fill(temp, '0');
		System.out.println("toString:" + temp.toString());
		System.out.println("Arrays.toString: "+ Arrays.toString(temp));
		System.out.println("new String(): "+ new String(temp));
	}



}
