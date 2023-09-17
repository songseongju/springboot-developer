package com.multicampus.springbootdeveloper.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.multicampus.springbootdeveloper.domain.User;
//email로 사용자 정보 가져오겠다.    FROM users WHERE email = #{email}
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
