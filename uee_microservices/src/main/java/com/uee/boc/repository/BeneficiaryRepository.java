package com.uee.boc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uee.boc.mapping.Beneficiary;
import com.uee.boc.mapping.User;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
