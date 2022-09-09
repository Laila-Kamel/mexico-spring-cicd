package io.nology.mexicospringcicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathControllerTest {
	@Autowired
	private MathController controller;
	
	@Test
	public void rectangleAreaReturnsCorrectArea() {
		Integer height=100;
		Integer width=200;
		Integer result=controller.rectangleArea(height, width);
		Integer expected=20000;
		assertEquals(expected,result);
	}
}
