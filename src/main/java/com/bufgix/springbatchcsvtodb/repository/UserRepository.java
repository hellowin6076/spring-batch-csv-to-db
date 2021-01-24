package com.bufgix.springbatchcsvtodb.repository;

import com.bufgix.springbatchcsvtodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
