package com.example.desafiobackend.exception.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorData implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String title;
    private int code;
    private String detail;
    public static ErrorData of(String title, String detail, int code) {
        return ErrorData.builder()
                .title(title)
                .detail(detail)
                .code(code)
                .build();
    }
}
