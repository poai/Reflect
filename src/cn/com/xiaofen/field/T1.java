package cn.com.xiaofen.field;

import static java.lang.System.out;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class T1 {
	private Class<?> c = null;

	/**
	 * 访问字段的类型
	 */
	@Test
	public void testType() throws Exception {
		c = Class.forName("cn.com.xiaofen.field.FieldT");
		/* 根据字段名臣获取Field对象 */
		Field field = c.getField("val");
		/* 打印字段的类型 */
		out.format("%s%n", field.getType());
		/* 字段的标准类型 */
		out.format("%s%n", field.getGenericType());
	}

	/**
	 * 检索和访问方法的修饰符
	 */
	@Test
	public void testModifiers() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		c = Class.forName("cn.com.xiaofen.field.FieldT");
		/* 根据字段名臣获取Field对象 */
		Field field = c.getField("NAME");
		/* 获取字段的访问修饰符 */
		int mod = field.getModifiers();
		out.println(Modifier.toString(mod));
		/*字段查找参考官方API*/
	}
	/**
	 * 获取和设置字段的值
	 * */
	@Test
	public void testValue() throws Exception{
		FieldT<Object> fieldT=new FieldT<>();
		c = fieldT.getClass();
		/*获取字段对象*/
		Field field=c.getDeclaredField("age");
		/*为字段设置值*/
		field.setInt(fieldT, 100);
		/*获取字段的值*/
		out.println(field.getInt(fieldT));
	}
}
