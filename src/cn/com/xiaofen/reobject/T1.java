package cn.com.xiaofen.reobject;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/*Object.getClass()*/
public class T1 {
	public enum E {
		A, B
	}
	@Test
	public void test_1() {
		/* 如果一个Object对象的实例是有效的，则最简单的获得该对象的Class对象的方式为Object.getClass() */
		"foo".getClass();
		/* 返回Console对应的Class对象 */
		Class c = System.console().getClass();
		/* 获取枚举类型的Class对象 */
		Class d = E.A.getClass();
		/* 获取数组对应的Class对象 */
		byte[] bytes = new byte[1024];
		Class e = bytes.getClass();
		/*获取泛型类的Class对象，因为Set为接口，因而返回的是HashSet的Class对象*/
		Set<String> s = new HashSet<String>();
		Class f = s.getClass();
	}
}
