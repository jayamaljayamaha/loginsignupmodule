package POS.Backend.LoginSignupModule.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name="roleId")
    private String roleId;
    private String type;
    @OneToOne(mappedBy = "role")
    @JsonBackReference
    private User user;

    public Role(String id, String type) {
        this.roleId = id;
        this.type = type;
    }

    public Role() {
    }

    public String getId() {
        return roleId;
    }

    public void setId(String id) {
        this.roleId = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
