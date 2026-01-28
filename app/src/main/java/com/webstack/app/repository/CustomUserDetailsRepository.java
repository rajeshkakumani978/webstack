package com.webstack.app.repository;

import com.webstack.app.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomUserDetailsRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByUsername(String userName);

}
