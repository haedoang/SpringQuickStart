package kr.co.haedoang.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory
			= new GenericXmlApplicationContext("ApplicationContext.xml");
		
		UserService userService =(UserService)factory.getBean("userService");
		
		//검색하기
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		System.out.println(user);
	}
}
