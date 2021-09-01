package annoutation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

	@BeforeClass
	public static void beforCalss() { //@BeforeClass 어노테이션 메소드는 public static void
		System.out.println("@BeforClass");
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterCalss");
	}
	
	@Before
	public void beforMethod() {
		System.out.println("@Before - 각 테스트 수행 전 실행");
	}

	
	@After
	public void afterMethod() {
		System.out.println("@After - 각 테스트 수행 후 실행");
	}
	
	@Test
	public void test_method01() {
		System.out.println("@Test - 테슽 메소드 1");
	}
	
	@Test
	public void test_method02() {
		System.out.println("@Test - 테슽 메소드 2");
	}
	
	
	@Ignore
	public void ignorTest() {
		System.out.println("@Ignore - 테스트에서 제외됨");
	}
	
}
