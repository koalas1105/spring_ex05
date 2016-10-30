package rml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rml.dao.UserMapper;
import rml.model.User;

import java.util.List;

@Service("muserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
		
	public UserMapper getMuserMapper() {
		return userMapper;
	}

	public void setMuserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public int insert(User muser) {
		
		return userMapper.insert(muser);
	}

	@Override
	public int update(User muser) {
		
		return userMapper.updateByPrimaryKey(muser);
	}

	@Override
	public int delete(Integer id) {
	
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

}
