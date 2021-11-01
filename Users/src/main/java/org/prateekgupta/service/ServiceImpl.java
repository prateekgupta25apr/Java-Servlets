package org.prateekgupta.service;

import org.prateekgupta.dao.DAO;
import org.prateekgupta.dao.DAOImpl;
import org.prateekgupta.dto.LoginDTO;
import org.prateekgupta.dto.UserDTO;
import org.prateekgupta.entity.LoginEntity;
import org.prateekgupta.entity.UserEntity;

public class ServiceImpl implements Service {
    @Override
    public String validateAndSave(UserDTO dto) {
        UserEntity entity = new UserEntity();
        if (dto != null) {
            if (!dto.getName().equals("")) entity.setName(dto.getName());
            else return "Invalid name";

            if (!dto.getEmail().equals("")) entity.setEmail(dto.getEmail());
            else return "Invalid email";

            if (dto.getPassword().equals(dto.getConfirmPassword()))
                entity.setPassword(dto.getPassword());
            else return "Password mismatch";

            if (!dto.getContactNumber().equals(""))
                entity.setContactNumber(dto.getContactNumber());
            else return "Invalid contact";

            if (dto.getDob() != null) entity.setDob(dto.getDob());
            else return "Invalid DOB";

            if (dto.getGender() != null) entity.setGender(dto.getGender());
            else return "Invalid gender";

            if (!dto.getStatus().equals("")) entity.setStatus(dto.getStatus());
            else return "Invalid status";

            if (!dto.getCity().equals("")) entity.setCity(dto.getCity());
            else return "Invalid city";

            if (dto.getNationality() != null) entity.setNationality(dto.getNationality());
            else return "Invalid nationality";

        }
        DAO dao = new DAOImpl();
        return dao.save(entity);
    }

    @Override
    public String validateAndGetByEmail(LoginDTO dto) {
        DAO dao = new DAOImpl();
        UserEntity entity = dao.getUserEntityByEmail(dto.getEmail());
        if (entity == null) return "Invalid Email";
        if (entity.getPassword().equals(dto.getPassword())) {
            return "<h1> User Details </h1><br>" +
                    "<b>Name:</b> " + entity.getName() + "<br>" +
                    "<b>Email:</b> " + entity.getEmail() + "<br>" +
                    "<b>Contact Number:</b> " + entity.getContactNumber() + "<br>" +
                    "<b>Date of Birth:</b> " + entity.getDob() + "<br>" +
                    "<b>Gender:</b> " + entity.getGender() + "<br>" +
                    "<b>Status:</b> " + entity.getStatus() + "<br>" +
                    "<b>City:</b> " + entity.getCity() + "<br>" +
                    "<b>Nationality:</b> " + entity.getNationality() + "<br><br><br><br>";
        } else return "Invalid Password";
    }

    @Override
    public String validateAndDelete(LoginDTO dto) {
        DAO dao = new DAOImpl();
        LoginEntity entity = dao.getLoginEntityByEmail(dto.getEmail());
        if (entity == null) return "Invalid Email";
        if (entity.getPassword().equals(dto.getPassword())) {
            return dao.delete(dto.getEmail());
        } else return "Invalid Password";
    }

    @Override
    public String validateAndUpdatePassword(
            LoginDTO dto, String newPassword, String conformNewPassword) {
        DAO dao = new DAOImpl();
        LoginEntity entity = dao.getLoginEntityByEmail(dto.getEmail());
        if (entity == null) return "Invalid Email";
        if (entity.getPassword().equals(dto.getPassword())) {
            if (newPassword.equals(conformNewPassword)){
                return dao.updatePassword(entity);
            }
            else return "New Password and Confirm New Password not matching";
        } else return "Invalid Old Password";
    }

    public static void main(String[] args) {
//        UserDTO dto = new UserDTO();
//        dto.setName("prateek");
//        dto.setEmail("p");
//        dto.setPassword("p");
//        dto.setConfirmPassword("p");
//        dto.setContactNumber("p");
//        dto.setDob("p");
//        dto.setGender("p");
//        dto.setStatus("p");
//        dto.setCity("p");
//        dto.setNationality("p");
        LoginDTO dto = new LoginDTO();
        dto.setEmail("k");
        dto.setPassword("l");

        Service service = new ServiceImpl();
        System.out.println(service.validateAndGetByEmail(dto));
    }
}
