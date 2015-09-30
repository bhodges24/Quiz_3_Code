package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void First_Perimeter_Test() {
		Triangle my_triangle = new Triangle();
		double my_perimeter = my_triangle.getPerimeter();
		assertTrue(my_perimeter == 3.0);
		
	}
	@Test
	public void Second_Perimeter_Test() {
		Triangle my_triangle = new Triangle(3, 4, 5);
		double my_perimeter = my_triangle.getPerimeter();
		assertTrue(my_perimeter == 12.0);
	}
	@Test
	public void Third_Perimeter_Test() {
		Triangle my_triangle = new Triangle(5, 12, 13);
		double my_perimeter = my_triangle.getPerimeter();
		assertTrue(my_perimeter == 30);
	}
	@Test
	public void Fourth_Perimeter_Test() {
		Triangle my_triangle = new Triangle(6, 8, 10);
		double my_perimeter = my_triangle.getPerimeter();
		assertTrue(my_perimeter == 24);
	}
	@Test
	public void First_Area_Test() {
		Triangle my_triangle = new Triangle();
		double my_area = my_triangle.getArea();
		assertTrue(my_area == (Math.sqrt(3)/4));
}
	@Test
	public void Second_Area_Test() {
		Triangle my_triangle = new Triangle(3, 4, 5);
		double my_area = my_triangle.getArea();
		assertTrue(my_area == 6.0);
}
	@Test
	public void Third_Area_Test() {
		Triangle my_triangle = new Triangle(5, 12, 13);
		double my_area = my_triangle.getArea();
		assertTrue(my_area == 30);
}
	@Test
	public void Fourth_Area_Test() {
		Triangle my_triangle = new Triangle(6, 8, 10);
		double my_area = my_triangle.getArea();
		assertTrue(my_area == 24);
}
	
}
	