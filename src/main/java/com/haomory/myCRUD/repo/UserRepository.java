package com.haomory.myCRUD.repo;

import com.haomory.myCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void deleteById(Long id);
}
