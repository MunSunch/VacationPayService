package com.munsun.vacation_service.controllers;

import com.munsun.vacation_service.dto.response.VacationPayDtoOut;
import com.munsun.vacation_service.services.VacationPayService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;

@Validated
@RestController
@RequiredArgsConstructor
public class VacationPayController {
    private final VacationPayService service;

    @CrossOrigin
    @GetMapping("/calculate")
    public VacationPayDtoOut calculateSalary(@RequestHeader @Positive(message = "salary must positive") Long salary,
                                             @RequestHeader @Positive(message = "countDays must positive") Integer countDays)
    {
        return service.calculate(salary, countDays);
    }
}
