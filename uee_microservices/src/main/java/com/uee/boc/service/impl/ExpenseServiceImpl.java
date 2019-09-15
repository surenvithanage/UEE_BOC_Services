package com.uee.boc.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uee.boc.dto.ExpenseDTO;
import com.uee.boc.mapping.Expense;
import com.uee.boc.repository.ExpenseRepository;
import com.uee.boc.service.ExpenseService;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService{

	@Autowired
	private ExpenseRepository expenseRepository; 
	
	@Override
	public ExpenseDTO add(Expense u) {
		return getExpenseDTOFromBeneficiary(expenseRepository.save(u));
	}

	@Override
	public List<ExpenseDTO> getAll() {
		return expenseRepository.findAll().stream().map(beneficiary -> getExpenseDTOFromBeneficiary(beneficiary)).collect(Collectors.toList());

	}

	@Override
	public ExpenseDTO getById(Long id) {
		Optional<Expense> oUser = expenseRepository.findById(id);
		Expense user = null;
		if (oUser.isPresent()) {
			user = oUser.get();
		} else {

		}
		return getExpenseDTOFromBeneficiary(user);
	}

	@Override
	public boolean deleteById(Long id) {
		boolean result = false;
		try {
			expenseRepository.deleteById(id);
			result = true;
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
	
	private ExpenseDTO getExpenseDTOFromBeneficiary(Expense expense) {
		ExpenseDTO expenseDTO = new ExpenseDTO();

		expenseDTO.setAmount(expense.getAmount());
		expenseDTO.setCategory(expense.getCategory());
		expenseDTO.setDescription(expense.getDescription());
		expenseDTO.setExpenseId(expense.getExpenseId());
		return expenseDTO;
	}


}
