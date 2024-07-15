package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message = "Subject is necessary.")
    @Size(max=200)
    private String subject;

    @NotEmpty(message = "Content is necessary.")
    private String content;
}
