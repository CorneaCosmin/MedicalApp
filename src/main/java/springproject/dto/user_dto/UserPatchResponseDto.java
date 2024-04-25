package springproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class UserPatchResponseDto {

    private String username;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int age;
    private String country;
    private String address;
    private String mail;
    private String gender;
    private String phoneNumber;
    private String CNP;

}
