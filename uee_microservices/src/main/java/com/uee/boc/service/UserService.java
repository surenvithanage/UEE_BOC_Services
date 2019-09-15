package com.uee.boc.service;

import com.uee.boc.dto.UserDTO;
import com.uee.boc.mapping.User;

public interface UserService extends UeeService<UserDTO, User> {

	public boolean getUserByEmailAndPassword(User user);
}
