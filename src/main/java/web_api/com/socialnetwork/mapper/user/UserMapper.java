package web_api.com.socialnetwork.mapper.user;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import web_api.com.socialnetwork.Dto.user.UserResDto;
import web_api.com.socialnetwork.Entity.User;
import web_api.com.socialnetwork.mapper.MapperI;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper extends MapperI<User, UserResDto> {
}
