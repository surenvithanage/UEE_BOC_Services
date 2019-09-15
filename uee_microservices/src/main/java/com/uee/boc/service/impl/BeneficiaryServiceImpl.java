package com.uee.boc.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uee.boc.dto.BeneficiaryDTO;
import com.uee.boc.dto.UserDTO;
import com.uee.boc.mapping.Beneficiary;
import com.uee.boc.mapping.User;
import com.uee.boc.repository.BeneficiaryRepository;
import com.uee.boc.service.BeneficiaryService;

@Service
@Transactional
public class BeneficiaryServiceImpl implements BeneficiaryService {
	
	@Autowired
	private BeneficiaryRepository beneficiaryRepository; 

	@Override
	public BeneficiaryDTO add(Beneficiary u) {
		return getBeneficiaryDTOFromBeneficiary(beneficiaryRepository.save(u));
	}

	@Override
	public List<BeneficiaryDTO> getAll() {
		return beneficiaryRepository.findAll().stream().map(beneficiary -> getBeneficiaryDTOFromBeneficiary(beneficiary)).collect(Collectors.toList());
	}

	@Override
	public BeneficiaryDTO getById(Long id) {
		Optional<Beneficiary> oUser = beneficiaryRepository.findById(id);
		Beneficiary user = null;
		if (oUser.isPresent()) {
			user = oUser.get();
		} else {

		}
		return getBeneficiaryDTOFromBeneficiary(user);
	}

	@Override
	public boolean deleteById(Long id) {
		boolean result = false;
		try {
			beneficiaryRepository.deleteById(id);
			result = true;
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
	
	private BeneficiaryDTO getBeneficiaryDTOFromBeneficiary(Beneficiary beneficiary) {
		BeneficiaryDTO beneficiaryDTO = new BeneficiaryDTO();

		beneficiaryDTO.setAccountNumber(beneficiary.getAccountNumber());
		beneficiaryDTO.setBeneficiaryId(beneficiary.getBeneficiaryId());
		beneficiaryDTO.setEmail(beneficiary.getEmail());
		beneficiaryDTO.setName(beneficiary.getName());
		beneficiaryDTO.setNickName(beneficiary.getNickName());
		return beneficiaryDTO;
	}


}
