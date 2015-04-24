package com.beingjavaguys.services;
/**
 *
 * @author Nagesh Chauhan
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.beingjavaguys.dao.UserDao;
import com.beingjavaguys.domain.User2;


public class UserServiceImpl implements UserService {

 @Autowired
 UserDao userdao;

 @Override
 public void insertData(User2 user) {
  userdao.insertData(user);
 }

 @Override
 public List<User2> getUserList() {
  return userdao.getUserList();
 }

 @Override
 public void deleteData(String id) {
  userdao.deleteData(id);
  
 }

 @Override
 public User2 getUser(String id) {
  return userdao.getUser(id);
 }

 @Override
 public void updateData(User2 user) {
  userdao.updateData(user);
  
 }


 
}

