package cn.com.xiaofen.reobject;

import org.junit.Test;

/*��������Class����*/
public class T5 {
	@Test
	public void test(){
		/*���ظ����Class����*/
		Class c = javax.swing.JButton.class.getSuperclass();
		/*����Class���ֵ����й����ࡢ�ӿڡ�ö�١���Ա�������̳еĳ�Ա*/
		Class<?>[] d = Character.class.getClasses();
		/*����Class�е����нӿں���ʾ������ö��*/
		Class<?>[] e = Character.class.getDeclaredClasses();
		/*���ص�ǰ�������Class����*/
		Class f=Character.class.getDeclaringClass();
			
		//java.lang.reflect.Field.getDeclaringClass()
		//java.lang.reflect.Method.getDeclaringClass()
		//java.lang.reflect.Constructor.getDeclaringClass()
	}
}
