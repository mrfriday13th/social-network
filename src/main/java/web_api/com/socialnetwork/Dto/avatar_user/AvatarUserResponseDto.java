package web_api.com.socialnetwork.Dto.avatar_user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvatarUserResponseDto {
    private long id;
    private String urlImage;
}
