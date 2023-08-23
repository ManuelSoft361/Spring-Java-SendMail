package SpringBootMailSender.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@ToString
public class EmailDTO {
    private String[] toUser;
   private String subject;
    private String message;

}
