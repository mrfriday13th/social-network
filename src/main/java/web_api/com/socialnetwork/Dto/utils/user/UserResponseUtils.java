package web_api.com.socialnetwork.Dto.utils.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import web_api.com.socialnetwork.Dto.user.UserResDto;
import web_api.com.socialnetwork.Dto.utils.ResponseUtilsAdapter;
import web_api.com.socialnetwork.Entity.User;
import web_api.com.socialnetwork.mapper.user.UserMapper;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class UserResponseUtils extends ResponseUtilsAdapter<User, UserResDto> {
    private final UserMapper userMapper;

    @Override
    public UserResDto convert (User objUser){
         UserResDto userResDto = userMapper.entityToDto(objUser);
         return userResDto;
    }
    @Override
    public List<UserResDto> convert(List<User> obj) {
        List<UserResDto> userResponseList = new ArrayList<>();
        obj.stream().forEach(o -> {
            UserResDto userInfoResponse = userMapper.entityToDto(o);
            userResponseList.add(userInfoResponse);
        });
        return userResponseList;
    }

}
