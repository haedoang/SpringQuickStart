package kr.co.haedoang.user.impl;

import org.springframework.stereotype.Service;

import kr.co.haedoang.user.UserService;
import kr.co.haedoang.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private UserDAO userDAO;
	
	//setter Injection 활용하기.
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO= userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
