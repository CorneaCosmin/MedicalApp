package springproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserPatchRequestDto {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String country;
    private String address;
    private String mail;
    private String gender;
    private String phoneNumber;
    private String CNP;

}
