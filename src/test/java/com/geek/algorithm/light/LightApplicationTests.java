package com.geek.algorithm.light;

import com.geek.algorithm.light.Algorithm.solution.AddDigits;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class LightApplicationTests {

	@Test
	void contextLoads() {
		AddDigits addDigits = new AddDigits();
		addDigits.addDigits(38);
	}

}
