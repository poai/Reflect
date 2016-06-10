package cn.com.xiaofen.construct;

import static java.lang.System.out;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import org.junit.Test;

import cn.com.xiaofen.modifier.Hello;

public class T1 {
	Class<?> c;

	/**
	 * 访问构造器的基本信息
	 */
	@Test
	public void testFind() throws Exception {
		c = Class.forName("cn.com.xiaofen.modifier.Hello");
		/* 获取所有可用构造器 */
		Constructor[] allConstructors = c.getDeclaredConstructors();
		for (Constructor ctor : allConstructors) {
			/* 获取并打印参数类型 */
			Type[] pType = ctor.getGenericParameterTypes();
			for (int i = 0; i < pType.length; i++) {
				out.format("GenericParameterType %s%n", pType[i]);
			}

			/* 打印构造器访问修饰符 */
			out.format("modifier: %s%n", Modifier.toString(ctor.getModifiers()));
			out.println("-------------");
		}
	}
	/**
	 * 实例化对象
	 * */
	@Test
	public void testNewInstance() throws Exception {
		c = Class.forName("cn.com.xiaofen.modifier.Hello");
		/*获取一个String类型的构造器*/
		Constructor<?> constructor=c.getConstructor(String.class);
		/*使用有参数构造器实例化对象*/
		Hello<?, ?> hello=(Hello<?, ?>) constructor.newInstance("hello");
		out.println(hello.getMessage());
		/*使用无参数构造器实例化对象*/
		hello=(Hello<?, ?>) c.newInstance();
		out.println(hello.getMessage());
	}
}
