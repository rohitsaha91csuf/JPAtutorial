package org.example.entity;


import javax.persistence.*;
import java.util.UUID;
//java POJO
@Entity

@NamedQueries({
        @NamedQuery(name= "Employee.findAll", query="select emp from Employee emp order by emp.email desc"),
        @NamedQuery(name="Employee.findByEmail", query="Select emp from Employee emp where emp.email= :paramEmail")
})
public class Employee {
    @Column(columnDefinition = "VARCHAR(36)")
    @Id
    private String id;

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Column(unique = true)
    private String email;

    public Employee(){
        this.id= UUID.randomUUID().toString();
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
