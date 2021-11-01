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
        @NamedQuery(name = "getLoginEntityByEmail",
                query = "from LoginEntity where email=:providedEmail"),
        @NamedQuery(name = "updatePassword",
                query = "update LoginEntity set password=:providedPassword " +
                        "where email=:providedEmail")
})
public class LoginEntity {
    @Id
    private String email;
    private String password;
}
