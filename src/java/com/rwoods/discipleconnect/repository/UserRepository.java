package com.rwoods.discipleconnect.repository;

import com.rwoods.discipleconnect.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findUserById(String userId);
}