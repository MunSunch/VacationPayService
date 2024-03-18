package com.munsun.vacation_service.controllers;

import com.munsun.vacation_service.dto.response.ErrorDtoOut;
import com.munsun.vacation_service.dto.response.VacationPayDtoOut;
import com.munsun.vacation_service.services.VacationPayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;

@Validated
@RestController
@RequiredArgsConstructor
@Tag(name="Vacation Pay Controller", description = "allows you to calculate vacation pay")
public class VacationPayController {
    private final VacationPayService service;

    @CrossOrigin
    @GetMapping("/calculate")
    @Operation(summary = "calculation of vacation pay")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Calculated amount",
                    content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = VacationPayDtoOut.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid format",
                    content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDtoOut.class)) }),
            @ApiResponse(responseCode = "500", description = "Server's error",
                    content = { @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDtoOut.class)) })})
    public VacationPayDtoOut calculateSalary(
            @RequestHeader @Parameter(description = "average salary for 12 months") @Positive(message = "salary must positive") Long salary,
            @RequestHeader @Parameter(description = "number of vacation days") @Positive(message = "countDays must positive") Integer countDays)
    {
        return service.calculate(salary, countDays);
    }
}
