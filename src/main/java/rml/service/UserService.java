package rml.service;

import rml.model.User;

import java.util.List;

public interface UserService {

	List<User> getAll();

    User selectByPrimaryKey(Integer id);
	
    int insert(User muser);
    
    int update(User muser);
    
    int delete(Integer id);
}
