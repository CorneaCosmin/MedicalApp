package springproject.dto;

import lombok.Data;

@Data
public class UserAuthenticateRequestDto {

    private String username;
    private String password;

}
