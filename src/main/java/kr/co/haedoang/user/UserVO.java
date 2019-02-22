package kr.co.haedoang.user;

import lombok.Data;

@Data
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
	public UserVO() {
		System.out.println("USERVO 객체 생성");
	}
}
