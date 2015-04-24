package com.beingjavaguys.jdbc;
/**
 *
 * @author Nagesh Chauhan
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.beingjavaguys.domain.User2;

public class UserRowMapper implements RowMapper<User2> {

 @Override
 public User2 mapRow(ResultSet resultSet, int line) throws SQLException {
  UserExtractor userExtractor = new UserExtractor();
  return userExtractor.extractData(resultSet);
 }

}

