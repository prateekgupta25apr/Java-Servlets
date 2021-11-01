package org.prateekgupta.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_details")
@NamedQueries({
        @NamedQuery(name = "getUserEntityByEmail",
                query = "from UserEntity where email=:providedEmail"),
})
public class UserEntity {
    private String name;
    @Id
    private String email;
    private String password;
    private String contactNumber;
    private String dob;
    private String gender;
    private String status;
    private String city;
    private String nationality;
}
