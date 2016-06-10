package cn.com.xiaofen.field;

import java.util.List;

public class FieldT<T> {
	
	public static final String NAME = "XiaoFen";
	public int age=100;
	private String sex;
	public boolean[][] b = {{ false, false }, { true, true } };
    public String name  = "Alice";
    public List<Integer> list;
    public T val;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
