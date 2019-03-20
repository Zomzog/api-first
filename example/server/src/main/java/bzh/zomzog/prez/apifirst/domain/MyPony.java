package bzh.zomzog.prez.apifirst.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MyPony {

    private long id;
    private String name;
    private String color;
    private LocalDateTime createdAt;
    private String hiddenField;
}
