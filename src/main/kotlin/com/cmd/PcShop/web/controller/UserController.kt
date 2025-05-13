package com.cmd.PcShop.web.controller

import com.cmd.PcShop.service.UserService
import com.cmd.PcShop.web.response.UserInfoResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    @Autowired
    private val userService: UserService
) {
    @GetMapping
    fun getUserName(@AuthenticationPrincipal oAuth2User: OAuth2User) : UserInfoResponse {
        return userService.getUserInfo(oAuth2User)
    }
}