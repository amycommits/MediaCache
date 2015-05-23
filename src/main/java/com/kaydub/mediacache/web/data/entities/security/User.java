
package com.kaydub.mediacache.web.data.entities.security;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Kevin W.
 */
@Entity
@Table(name = "USR_USER")
public class User implements Serializable {

    @Id
    @Column(name="USERNAME", length=50)
    private String username;
    
    @Column(name="PASSWORD")
    private String password;
    
    @Column(name="EMAIL", length=180)
    private String email;
    
    @Column(name="ENABLED")
    private Integer enabled;
    
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    @Cascade({CascadeType.ALL })
    private List<UserRole> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

}
