package com.example.chieegateway.CommunityDtos;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class CommentDto {

    private String id;

    private String boardId;

    private String userId;

    private String content;

    private long good;

    private List<CommentDto> childList = new ArrayList<>();
}
