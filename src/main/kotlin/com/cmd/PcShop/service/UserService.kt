package com.cmd.PcShop.service

import com.cmd.PcShop.web.response.UserInfoResponse
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Service

@Service
class UserService {
    fun getUserInfo(oauth2User: OAuth2User): UserInfoResponse {
        val name: String = oauth2User.attributes["name"].toString()
        val pictureUri: String = oauth2User.attributes["picture"].toString()
        return UserInfoResponse(name, pictureUri)
    }
}