package jp.co.f2.spring.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.f2.spring.bms.entity.User;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}