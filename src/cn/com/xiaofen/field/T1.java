package cn.com.xiaofen.field;

import static java.lang.System.out;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class T1 {
	private Class<?> c = null;

	/**
	 * �����ֶε�����
	 */
	@Test
	public void testType() throws Exception {
		c = Class.forName("cn.com.xiaofen.field.FieldT");
		/* �����ֶ�������ȡField���� */
		Field field = c.getField("val");
		/* ��ӡ�ֶε����� */
		out.format("%s%n", field.getType());
		/* �ֶεı�׼���� */
		out.format("%s%n", field.getGenericType());
	}

	/**
	 * �����ͷ��ʷ��������η�
	 */
	@Test
	public void testModifiers() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		c = Class.forName("cn.com.xiaofen.field.FieldT");
		/* �����ֶ�������ȡField���� */
		Field field = c.getField("NAME");
		/* ��ȡ�ֶεķ������η� */
		int mod = field.getModifiers();
		out.println(Modifier.toString(mod));
		/*�ֶβ��Ҳο��ٷ�API*/
	}
	/**
	 * ��ȡ�������ֶε�ֵ
	 * */
	@Test
	public void testValue() throws Exception{
		FieldT<Object> fieldT=new FieldT<>();
		c = fieldT.getClass();
		/*��ȡ�ֶζ���*/
		Field field=c.getDeclaredField("age");
		/*Ϊ�ֶ�����ֵ*/
		field.setInt(fieldT, 100);
		/*��ȡ�ֶε�ֵ*/
		out.println(field.getInt(fieldT));
	}
}
