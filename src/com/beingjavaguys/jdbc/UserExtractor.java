package com.beingjavaguys.jdbc;
/**
 *
 * @author Nagesh Chauhan
 */


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.beingjavaguys.domain.User2;

public class UserExtractor implements ResultSetExtractor<User2> {

 public User2 extractData(ResultSet resultSet) throws SQLException,
   DataAccessException {
  
  User2 user = new User2();
  
  user.setUserId(resultSet.getInt(1));
  user.setFirstName(resultSet.getString(2));
  user.setLastName(resultSet.getString(3));
  user.setGender(resultSet.getString(4));
  user.setCity(resultSet.getString(5));
  
  return user;
 }

}

