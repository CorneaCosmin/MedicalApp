package springproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;









    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    private int age;

    private String country;

    private String address;

    private String gender;

    private String phoneNumber;

    private String CNP;






    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
