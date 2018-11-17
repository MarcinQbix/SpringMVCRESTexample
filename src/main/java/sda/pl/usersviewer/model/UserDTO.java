package sda.pl.usersviewer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
private int id;
    private String firstName;
    private String LastName;
    private String avatar;
    private LocalDate dateOfBird;
    private int age;


}
