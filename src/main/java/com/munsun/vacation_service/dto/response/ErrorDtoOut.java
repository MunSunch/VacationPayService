package com.munsun.vacation_service.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Error")
public class ErrorDtoOut {
    @Schema(description = "error message")
    private String message;
}
