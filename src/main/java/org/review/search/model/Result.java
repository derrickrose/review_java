package org.review.search.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class Result {
    private String fileName;
    private Integer score;

    public Result withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Result withScore(Integer score) {
        this.score = score;
        return this;
    }
}
