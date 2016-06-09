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
		/* ���һ��Object�����ʵ������Ч�ģ�����򵥵Ļ�øö����Class����ķ�ʽΪObject.getClass() */
		"foo".getClass();
		/* ����Console��Ӧ��Class���� */
		Class c = System.console().getClass();
		/* ��ȡö�����͵�Class���� */
		Class d = E.A.getClass();
		/* ��ȡ�����Ӧ��Class���� */
		byte[] bytes = new byte[1024];
		Class e = bytes.getClass();
		/*��ȡ�������Class������ΪSetΪ�ӿڣ�������ص���HashSet��Class����*/
		Set<String> s = new HashSet<String>();
		Class f = s.getClass();
	}
}
