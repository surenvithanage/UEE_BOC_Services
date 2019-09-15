package com.uee.boc.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.uee.boc.dto.MessageDTO;
import com.uee.boc.mapping.Message;
import com.uee.boc.service.MessageService;

@Service
@Transactional
public class MessageServiceImpl implements MessageService{

	@Override
	public MessageDTO add(Message u) {
		return null;
	}

	@Override
	public List<MessageDTO> getAll() {
		return null;
	}

	@Override
	public MessageDTO getById(Long id) {
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		return false;
	}

}
