package com.geek.algorithm.light;

import com.geek.algorithm.light.Algorithm.solution.AddDigits;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest()
@Slf4j
class LightApplicationTests {

//	@Test
//	void contextLoads() {
//		AddDigits addDigits = new AddDigits();
//		addDigits.addDigits(38);
//	}

	@Test
	void testToString() {
		char[] temp = new char[5];
		Arrays.fill(temp, '0');
		System.out.println("toString:" + temp.toString());
		System.out.println("Arrays.toString: "+ Arrays.toString(temp));
		System.out.println("new String(): "+ new String(temp));
	}


}
