package SpringBootMailSender.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;


@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class EmailFileDTO {
    private String[] toUser;
   private String subject;
   private String message;
   private MultipartFile file;

}
