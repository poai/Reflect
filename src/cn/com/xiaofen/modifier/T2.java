package cn.com.xiaofen.modifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import static java.lang.System.out;
import org.junit.Test;

public class T2 {
	@Test
	public void test() {
		try {
			String str="cn.com.xiaofen.modifier.Hello";
			Class<?> c = Class.forName(str);
			out.format("Class:%n  %s%n%n", c.getCanonicalName());
			Package p = c.getPackage();
			out.format("Package:%n  %s%n%n", (p != null ? p.getName() : "-- No Package --"));
			printMembers(c.getConstructors(), "Constuctors");
			printMembers(c.getFields(), "Fields");
			printMembers(c.getMethods(), "Methods");
			printClasses(c);
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
	private static void printMembers(Member[] mbrs, String s) {
		out.format("%s:%n", s);
		for (Member mbr : mbrs) {
			if (mbr instanceof Field)
				/*打印字段*/
				out.format("  %s%n", ((Field) mbr).toGenericString());
			else if (mbr instanceof Constructor)
				/*打印构造器*/
				out.format("  %s%n", ((Constructor) mbr).toGenericString());
			else if (mbr instanceof Method)
				/*打印方法*/
				out.format("  %s%n", ((Method) mbr).toGenericString());
		}
		if (mbrs.length == 0)
			out.format("  -- No %s --%n", s);
		out.format("%n");
	}

	private static void printClasses(Class<?> c) {
		out.format("Classes:%n");
		Class<?>[] clss = c.getClasses();
		for (Class<?> cls : clss)
			out.format("  %s%n", cls.getCanonicalName());
		if (clss.length == 0)
			out.format("  -- No member interfaces, classes, or enums --%n");
		out.format("%n");
	}
}
