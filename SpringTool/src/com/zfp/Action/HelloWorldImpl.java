package com.zfp.Action;

import com.zfp.dao.HelloWord;

public class HelloWorldImpl implements HelloWord {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
        System.out.println("这是helloword接口的实现！");
	}

}
