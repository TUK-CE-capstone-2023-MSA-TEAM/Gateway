package com.example.chieegateway.CommunityDtos;

import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SaveBoard {
    public String title;

    public String content;

    public String location;

    public String userId;

    public long views;
}
