package org.prateekgupta.dao;

import org.prateekgupta.entity.LoginEntity;
import org.prateekgupta.entity.UserEntity;

public interface DAO {
    String save(UserEntity entity);
    UserEntity getUserEntityByEmail(String email);
    LoginEntity getLoginEntityByEmail(String email);
    String delete(String email);
    String updatePassword(LoginEntity entity);
}
