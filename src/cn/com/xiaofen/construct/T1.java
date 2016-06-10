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
	 * ���ʹ������Ļ�����Ϣ
	 */
	@Test
	public void testFind() throws Exception {
		c = Class.forName("cn.com.xiaofen.modifier.Hello");
		/* ��ȡ���п��ù����� */
		Constructor[] allConstructors = c.getDeclaredConstructors();
		for (Constructor ctor : allConstructors) {
			/* ��ȡ����ӡ�������� */
			Type[] pType = ctor.getGenericParameterTypes();
			for (int i = 0; i < pType.length; i++) {
				out.format("GenericParameterType %s%n", pType[i]);
			}

			/* ��ӡ�������������η� */
			out.format("modifier: %s%n", Modifier.toString(ctor.getModifiers()));
			out.println("-------------");
		}
	}
	/**
	 * ʵ��������
	 * */
	@Test
	public void testNewInstance() throws Exception {
		c = Class.forName("cn.com.xiaofen.modifier.Hello");
		/*��ȡһ��String���͵Ĺ�����*/
		Constructor<?> constructor=c.getConstructor(String.class);
		/*ʹ���в���������ʵ��������*/
		Hello<?, ?> hello=(Hello<?, ?>) constructor.newInstance("hello");
		out.println(hello.getMessage());
		/*ʹ���޲���������ʵ��������*/
		hello=(Hello<?, ?>) c.newInstance();
		out.println(hello.getMessage());
	}
}
