package com.example.common.security;

import com.example.service.UserModelService;
import com.example.web.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户登录认证信息查询
 *
 * @author liuming
 * @date 2019/05/09
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserModelService userModelService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO user = userModelService.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        // 用户权限列表，根据用户拥有的权限标识与如 @PreAuthorize("hasAuthority('sys:menu:view')") 标注的接口对比，决定是否可以调用接口
//        Set<String> permissions = sysUserService.findPermissions(user.getName());
//        List<GrantedAuthority> grantedAuthorities =
//            permissions.stream().map(GrantedAuthorityImpl::new).collect(Collectors.toList());
        return new JwtUserDetails(user.getUsername(), user.getPassword(), user.getSalt(), null);
    }
}