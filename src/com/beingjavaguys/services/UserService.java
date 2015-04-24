package com.beingjavaguys.services;
/**
 *
 * @author Nagesh Chauhan
 */

import java.util.List;
import com.beingjavaguys.domain.User2;

public interface UserService {

 public void insertData(User2 user);
 public List<User2> getUserList();
 public void deleteData(String id);
 public User2 getUser(String id);
 public void updateData(User2 user);

}

