package com.healthme.dao;

import com.healthme.entity.User;
import com.healthme.entity.UserFlag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author root
 */
@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select u.* from User u left join User_flag uf on u.id = uf.user_id where uf.flag =1", nativeQuery = true)
    public List<User> getAll();
}
