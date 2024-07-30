package web_api.com.socialnetwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web_api.com.socialnetwork.Dto.user.UserResDto;
import web_api.com.socialnetwork.Dto.utils.user.UserResponseUtils;
import web_api.com.socialnetwork.Entity.InforUser;

import org.springframework.security.core.context.SecurityContextHolder;
import web_api.com.socialnetwork.Entity.User;
import web_api.com.socialnetwork.Repo.UserRepository;
import web_api.com.socialnetwork.service.UserService;
import web_api.com.socialnetwork.utils.CommonConstants;

import java.net.Authenticator;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private  final UserRepository userRepository;
    private  final UserResponseUtils userResponseUtils;

    @Override
    public UserResDto getInfoUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByUsername(authentication.getName()).orElseThrow(()-> new UsernameNotFoundException(CommonConstants.USER_NOT_FOUND));
     return userResponseUtils.convert(user);
    }

}
