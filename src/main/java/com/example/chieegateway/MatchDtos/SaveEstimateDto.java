package com.example.chieegateway.MatchDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveEstimateDto {
    int cost;

    String userId;

    String content;

    String type;
}
