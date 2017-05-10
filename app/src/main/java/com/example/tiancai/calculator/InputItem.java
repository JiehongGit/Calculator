package com.example.tiancai.calculator;

public class InputItem {
	//输入项
	private String input;
	private int type;

    //调用父类的构造方法
	public InputItem() {
		super();
	}

	public InputItem(String input, int type) {
		super();
		this.input = input;
		this.type = type;
	}

	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

    //接口
	interface InputType {
		//int类型
		public static final int INT_TYPE = 0;

		//double类型
		public static final int DOUBLE_TYPE=1;

		//操作符类型
		public static final int OPERATOR_TYPE = 2;
		public static final int ERROR = 3;
	}

	@Override
	public String toString() {
		return "InputItem [input=" + input + ", type=" + type + "]";
	}

}
