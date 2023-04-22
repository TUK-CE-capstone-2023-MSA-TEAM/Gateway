package com.example.chieegateway.CommunityDtos;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SaveComment {
    public String boardId;
    public String userId;
    public String content;

    public long good;

    public List<SaveComment> childList = new ArrayList<>();
}
