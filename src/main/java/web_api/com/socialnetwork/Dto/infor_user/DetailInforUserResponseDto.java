package web_api.com.socialnetwork.Dto.infor_user;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailInforUserResponseDto {
    private long id;
    private String currentAvatarId;
    private String role;
    private String username;
    private boolean gender;
    private String email;
    private String firstName;
    private String lastName;
    private  String phone;
    private Timestamp created_at;
    private Timestamp updated_at;

}
