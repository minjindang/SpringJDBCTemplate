package com.beingjavaguys.dao;
/**
 *
 * @author Nagesh Chauhan
 */

import java.util.List;
import com.beingjavaguys.domain.User2;

public interface UserDao {
 public void insertData(User2 user);
 public List<User2> getUserList();
 public void updateData(User2 user);
 public void deleteData(String id);
 public User2 getUser(String id);

}

