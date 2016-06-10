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
	 * ���ʷ�����Ϣ
	 */
	@Test
	public void testInfo() throws Exception {
		FieldT<Object> fieldT = new FieldT<>();
		c = fieldT.getClass();
		/* ��ȡ���з��������� */
		Method[] allMethods = c.getDeclaredMethods();
		for (Method m : allMethods) {
			out.format("%s%n", m.toGenericString());
			/* ��ӡ�������� */
			out.format(fmt, "ReturnType", m.getReturnType());
			out.format(fmt, "GenericReturnType", m.getGenericReturnType());
			/* ��ȡ�������� */
			Class<?>[] pType = m.getParameterTypes();
			Type[] gpType = m.getGenericParameterTypes();
			/* ��ӡ�������� */
			for (int i = 0; i < pType.length; i++) {
				out.format(fmt, "ParameterType", pType[i]);
				out.format(fmt, "GenericParameterType", gpType[i]);
				out.format(fmt, "GenericParameterName", gpType[i]);
			}
			/* ��ȡ�쳣���� */
			Class<?>[] xType = m.getExceptionTypes();
			Type[] gxType = m.getGenericExceptionTypes();
			for (int i = 0; i < xType.length; i++) {
				out.format(fmt, "ExceptionType", xType[i]);
				out.format(fmt, "GenericExceptionType", gxType[i]);
			}
			/* ��ӡ������������ */
			out.format(fmt, "ParamCount", m.getParameterCount());
			/* ��ӡ������������ */
			Parameter[] param = m.getParameters();
			for (Parameter p : param) {
				out.format(fmt, "ParameterName", p.getName());
			}
			/* �����������η� */
			out.format("  Modifiers:  %s%n", Modifier.toString(m.getModifiers()));
		}
	}
	/**
	 * ���÷���
	 * */
	@Test
	public void testInvoke() throws Exception{
		FieldT<Object> fieldT = new FieldT<>();
		c = fieldT.getClass();
		/*��ȡָ������*/
		Method method =c.getMethod("setSex", String.class);
		/*���÷���*/
		method.invoke(fieldT, "hello");
		out.format("  result:  %s%n", fieldT.getSex());
	}
}
