/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gumerae;

/**
 *
 * @author SCC-COLLEGE
 */
public class account {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    /**
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param password
     * @throws IllegalArgumentException
     */
    public Account(int id, String firstName, String lastName, String email, String username, String password) throws IllegalArgumentException {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        setPassword(password); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must be at least 8 characters long, containing both uppercase and lowercase letters.");
        }
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            
            if (hasUppercase && hasLowercase) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "AccountRegistration{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + "******" + '\'' + 
                '}';
    }

    public static void main(String[] args) {
        try {
            Accounts account = new Accounts(1, "John", "Doe", "johndoe@example.com", "johndoe", "Password123");
            System.out.println(account);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
}
