package cn.com.xiaofen.reobject;

import org.junit.Test;

/*Class.forName()*/
public class T3 {
	@Test
	public void test(){
		/*���һ�����ȫ�޶���������Ч�������ͨ��Class.forName()��̬������ȡһ��Classʵ������������ԭʼ���͡��������͵���������ͨ������ Class.getName()����ã����﷨�������������ͺ�ԭʼ����*/
		try {
			Class a=Class.forName("cn.com.xiaofen.reobject.T1");
			Class cDoubleArray = Class.forName("[D");//double[].class
			Class cStringArray = Class.forName("[[Ljava.lang.String;");//String[][].class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
