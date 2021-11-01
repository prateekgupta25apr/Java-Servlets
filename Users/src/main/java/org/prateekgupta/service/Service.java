package org.prateekgupta.service;

import org.prateekgupta.dto.LoginDTO;
import org.prateekgupta.dto.UserDTO;
import org.prateekgupta.entity.LoginEntity;

public interface Service {
    String validateAndSave(UserDTO dto);
    String validateAndGetByEmail(LoginDTO dto);
    String validateAndDelete(LoginDTO dto);
    String validateAndUpdatePassword(
            LoginDTO dto,String newPassword,String conformNewPassword);
}
