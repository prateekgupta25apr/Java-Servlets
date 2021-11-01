package org.prateekgupta.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private String contactNumber;
    private String dob;
    private String gender;
    private String status;
    private String city;
    private String nationality;

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                ", city='" + city + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
