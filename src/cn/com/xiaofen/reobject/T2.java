package cn.com.xiaofen.reobject;

import java.io.PrintStream;

import org.junit.Test;

/*.class �﷨*/
public class T2 {
	@Test
	public void test_1(){
		boolean b;
		//Class c = b.getClass();   // �������
		Class a = boolean.class;  // ��ȷ
		Class d = java.io.PrintStream.class;//��ȷ
		Class e = int[][][].class;//��ȷ
	}
}
