package com.uee.boc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uee.boc.mapping.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
