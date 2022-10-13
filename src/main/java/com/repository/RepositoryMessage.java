package com.repository;

import com.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMessage extends JpaRepository<Message, Long> {
}
