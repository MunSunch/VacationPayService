package com.munsun.vacation_service.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "Vacation pay calculation results")
public class VacationPayDtoOut {
    @Schema(description = "calculated amount")
    private String vacationPay;
}
