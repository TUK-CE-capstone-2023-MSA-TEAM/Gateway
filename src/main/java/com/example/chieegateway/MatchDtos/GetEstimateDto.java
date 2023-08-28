package com.example.chieegateway.MatchDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEstimateDto {
    String id;
    int cost;
    String email;
    String content;
    String type;
}
