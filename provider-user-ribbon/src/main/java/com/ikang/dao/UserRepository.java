package com.ikang.dao;

import com.ikang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xuyang
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
