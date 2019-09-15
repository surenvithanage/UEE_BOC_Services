package com.uee.boc.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uee.boc.dto.UserDTO;
import com.uee.boc.mapping.User;
import com.uee.boc.repository.UserRepository;
import com.uee.boc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO add(User u) {
		User rUser = null;
		try {
			u.setPassword(u.getPassword());
			u.setEnabled(true);
			rUser = userRepository.save(u);
		} catch (Exception e) {
			throw e;
		}
		return getUserDTOFromUser(rUser);
	}

	@Override
	public List<UserDTO> getAll() {
		return userRepository.findAll().stream().map(user -> getUserDTOFromUser(user)).collect(Collectors.toList());
	}

	@Override
	public UserDTO getById(Long id) {
		Optional<User> oUser = userRepository.findById(id);
		User user = null;
		if (oUser.isPresent()) {
			user = oUser.get();
		} else {

		}
		return getUserDTOFromUser(user);
	}

	@Override
	public boolean deleteById(Long id) {
		boolean result = false;
		try {
			userRepository.deleteById(id);
			result = true;
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
	
	private UserDTO getUserDTOFromUser(User user) {
		UserDTO userDTO = new UserDTO();

		userDTO.setChannel(user.getChannel());
		userDTO.setCreatedtime(user.getCreatedtime());
		userDTO.setEmail(user.getEmail());
		userDTO.setEnabled(user.isEnabled());
		userDTO.setLoginId(user.getLoginId());
		userDTO.setLoginIdType(user.getLoginIdType());
		userDTO.setMobile(user.getMobile());
		userDTO.setName(user.getName());
		userDTO.setPushId(user.getPushId());
		userDTO.setUserId(user.getUserId());
		return userDTO;
	}

	@Override
	public boolean getUserByEmailAndPassword(User user) {
		User u = null;
		u = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if( Objects.nonNull(u)) {
			return true;
		} else {
			return false;
		}
	}

}
