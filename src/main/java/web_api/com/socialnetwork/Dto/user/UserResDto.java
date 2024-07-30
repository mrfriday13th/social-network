package web_api.com.socialnetwork.Dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import web_api.com.socialnetwork.Entity.AvatarUser;
import web_api.com.socialnetwork.Entity.Role;
@Getter
@Setter
@NoArgsConstructor
public class UserResDto {
   private Long id;

   private String username;

   private String cunrrentAvatarId;

   private String urlImage;

   private String lastName;

   private String firstName;

   private boolean gender;
}
