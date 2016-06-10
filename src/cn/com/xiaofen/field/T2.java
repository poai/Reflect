package cn.com.xiaofen.field;

import static java.lang.System.out;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

import org.junit.Test;

public class T2 {
	private static final String fmt = "%24s: %s%n";
	private Class<?> c = null;

	/**
	 * 访问方法信息
	 */
	@Test
	public void testInfo() throws Exception {
		FieldT<Object> fieldT = new FieldT<>();
		c = fieldT.getClass();
		/* 获取所有方法并遍历 */
		Method[] allMethods = c.getDeclaredMethods();
		for (Method m : allMethods) {
			out.format("%s%n", m.toGenericString());
			/* 打印方法类型 */
			out.format(fmt, "ReturnType", m.getReturnType());
			out.format(fmt, "GenericReturnType", m.getGenericReturnType());
			/* 获取参数类型 */
			Class<?>[] pType = m.getParameterTypes();
			Type[] gpType = m.getGenericParameterTypes();
			/* 打印参数类型 */
			for (int i = 0; i < pType.length; i++) {
				out.format(fmt, "ParameterType", pType[i]);
				out.format(fmt, "GenericParameterType", gpType[i]);
				out.format(fmt, "GenericParameterName", gpType[i]);
			}
			/* 获取异常类型 */
			Class<?>[] xType = m.getExceptionTypes();
			Type[] gxType = m.getGenericExceptionTypes();
			for (int i = 0; i < xType.length; i++) {
				out.format(fmt, "ExceptionType", xType[i]);
				out.format(fmt, "GenericExceptionType", gxType[i]);
			}
			/* 打印方法参数数量 */
			out.format(fmt, "ParamCount", m.getParameterCount());
			/* 打印方法参数名称 */
			Parameter[] param = m.getParameters();
			for (Parameter p : param) {
				out.format(fmt, "ParameterName", p.getName());
			}
			/* 解析方法修饰符 */
			out.format("  Modifiers:  %s%n", Modifier.toString(m.getModifiers()));
		}
	}
	/**
	 * 调用方法
	 * */
	@Test
	public void testInvoke() throws Exception{
		FieldT<Object> fieldT = new FieldT<>();
		c = fieldT.getClass();
		/*获取指定方法*/
		Method method =c.getMethod("setSex", String.class);
		/*调用方法*/
		method.invoke(fieldT, "hello");
		out.format("  result:  %s%n", fieldT.getSex());
	}
}
