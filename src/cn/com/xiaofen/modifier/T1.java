package cn.com.xiaofen.modifier;

import static java.lang.System.out;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class T1 {
	@Test
	public void test() throws ClassNotFoundException {
		String str = "cn.com.xiaofen.modifier.Hello";
		Class c = Class.forName(str);
		/*打印标准类名*/
		out.format("Class:%n  %s%n%n", c.getCanonicalName());
		/*打印访问修饰符*/
		out.format("Modifiers:%n  %s%n%n", Modifier.toString(c.getModifiers()));
		/*返回一个数组TypeVariable对象代表通过这个通用的声明，声明的类型变量。 */
		out.format("Type Parameters:%n");
		TypeVariable[] tv = c.getTypeParameters();
		if (tv.length != 0) {
			out.format("  ");
			for (TypeVariable t : tv)
				out.format("%s ", t.getName());
			out.format("%n%n");
		} else {
			out.format("  -- No Type Parameters --%n%n");
		}
		/*打印实现的接口*/
		out.format("Implemented Interfaces:%n");
		Type[] intfs = c.getGenericInterfaces();
		if (intfs.length != 0) {
			for (Type intf : intfs)
				out.format("  %s%n", intf.toString());
			out.format("%n");
		} else {
			out.format("  -- No Implemented Interfaces --%n%n");
		}
		/*打印继承结构*/
		out.format("Inheritance Path:%n");
		List<Class> l = new ArrayList<Class>();
		printAncestor(c, l);
		if (l.size() != 0) {
			for (Class<?> cl : l)
				out.format("  %s%n", cl.getCanonicalName());
			out.format("%n");
		} else {
			out.format("  -- No Super Classes --%n%n");
		}
		/*打印添加的注解*/
		out.format("Annotations:%n");
		Annotation[] ann = c.getAnnotations();
		if (ann.length != 0) {
			for (Annotation a : ann)
				out.format("  %s%n", a.toString());
			out.format("%n");
		} else {
			out.format("  -- No Annotations --%n%n");
		}
	}
	private static void printAncestor(Class<?> c, List<Class> l) {
		Class<?> ancestor = c.getSuperclass();
		if (ancestor != null) {
			l.add(ancestor);
			printAncestor(ancestor, l);
		}
	}
}
