package com.example.eventManagement.Entites;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName" )
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "evenements")
    @OneToMany(mappedBy = "user")
    private List<String> evenements;


    public long getId() {

        return 0;
    }

    public Object getFirstName() {

        return firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public Object getEmail() {
        return email;
    }

    public Object getPassword() {
        return password;
    }

    public void setFirstName(Object firstName) {
    }

    public void setLastName(Object lastName) {
    }

    public void setEmail(Object email) {
    }

    public void setPassword(Object password) {
    }
}
