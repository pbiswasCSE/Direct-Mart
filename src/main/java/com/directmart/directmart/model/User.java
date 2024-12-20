package com.directmart.directmart.model;

import jakarta.persistence.*; // Use javax.persistence.* if using older Java versions

@Entity // Marks the class as a JPA entity
@Table(name = "users") // Maps to the "users" table in the database
public class User {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID values
    private Long id;
    private String name;
    private String nid;
    private String email;
    private String password;


    public User() {
    }
    
    public User(String name, String nid, String email, String password) {
        this.name = name;
        this.nid = nid;
        this.email = email;
        this.password = password;
    }

    // Getters and setters for each field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
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

    public static void addAttribute(String string, String user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAttribute'");
    }

    public static void addAttribute(String string, User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAttribute'");
    }
}
