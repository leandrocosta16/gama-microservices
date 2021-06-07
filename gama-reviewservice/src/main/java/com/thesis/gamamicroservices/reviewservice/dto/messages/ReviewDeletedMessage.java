package com.thesis.gamamicroservices.reviewservice.dto.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDeletedMessage {
    int reviewId;
    int productId;
}
