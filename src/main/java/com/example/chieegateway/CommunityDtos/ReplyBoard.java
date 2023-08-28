package com.example.chieegateway.CommunityDtos;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReplyBoard {
    public String boardId;
    public String title;
    public String content;

    public String location;

    public String userId;

    public long views;

    public List<String> comments = new ArrayList<>();
}
