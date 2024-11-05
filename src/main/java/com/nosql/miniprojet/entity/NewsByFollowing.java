package com.nosql.miniprojet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsByFollowing {
    private UserEntity user;
    private NewsEntity post;
}
