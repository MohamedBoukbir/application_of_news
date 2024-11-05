package com.nosql.miniprojet.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "post")
public class NewsEntity {
    @Id
    private String id;

    private String userId;

    private String originalUserId;

    private String content;

    private String image;
    @Indexed(unique = true)
    private String url;

    private Instant createdAt;

    List<String> love = new ArrayList<>();

    List<String> share = new ArrayList<>();

    List<CommentEntity> comment = new ArrayList<>();
}
