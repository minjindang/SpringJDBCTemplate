package com.beingjavaguys.dao;
/**
 *
 * @author Nagesh Chauhan
 */

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.beingjavaguys.domain.User2;
import com.beingjavaguys.jdbc.UserRowMapper;

public class UserDaoImpl implements UserDao {

 @Autowired
 DataSource dataSource;

 public void insertData(User2 user) {

  String sql = "INSERT INTO user "
    + "(first_name,last_name, gender, city) VALUES (?, ?, ?, ?)";

  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

  jdbcTemplate.update(
    sql,
    new Object[] { user.getFirstName(), user.getLastName(),
      user.getGender(), user.getCity() });

 }

 public List<User2> getUserList() {
  List userList = new ArrayList();

  String sql = "select * from user2";

  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  userList = jdbcTemplate.query(sql, new UserRowMapper());
  return userList;
 }

 @Override
 public void deleteData(String id) {
  String sql = "delete from user2 where user_id=" + id;
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  jdbcTemplate.update(sql);

 }

 @Override
 public void updateData(User2 user) {

  String sql = "UPDATE user2 set first_name = ?,last_name = ?, gender = ?, city = ? where user_id = ?";
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

  jdbcTemplate.update(
    sql,
    new Object[] { user.getFirstName(), user.getLastName(),
      user.getGender(), user.getCity(), user.getUserId() });

 }

 @Override
 public User2 getUser(String id) {
  List<User2> userList = new ArrayList<User2>();
  String sql = "select * from user2 where user_id= " + id;
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  userList = jdbcTemplate.query(sql, new UserRowMapper());
  return userList.get(0);
 }

}

