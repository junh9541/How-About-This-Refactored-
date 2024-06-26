package com.HUFS19.backend.dto.profile;

import com.HUFS19.backend.dto.auth.LoginStatusDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ProfileDetailDto {
    ProfileDto profile;
    List<UserSnsDto> snsList;
    LoginStatusDto loginStatus;

}
