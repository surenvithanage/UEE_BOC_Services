package com.uee.boc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uee.boc.mapping.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
