package sda.pl.usersviewer.connector;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
@Getter
@Setter
@Component
public class ReqresSampleUsersDataResponse {
    @JsonProperty("page")
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    @JsonProperty("total")
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("data")
    private List<User> users;
}

