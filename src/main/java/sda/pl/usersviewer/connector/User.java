package sda.pl.usersviewer.connector;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Getter
@Setter
public class User {
    @JsonProperty("id")
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String LastName;
    @JsonProperty("avatar")
    private String avatar;
}

