package com.munsun.vacation_service.controllers;

import com.munsun.vacation_service.dto.response.VacationPayDtoOut;
import com.munsun.vacation_service.services.VacationPayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;

@RestController
@RequiredArgsConstructor
public class VacationPayController {
    private final VacationPayService service;

    @CrossOrigin
    @GetMapping("/calculate")
    public VacationPayDtoOut calculateSalary(@RequestHeader @Positive Long salary,
                                             @RequestHeader @Positive Integer countDays)
    {
        return service.calculate(salary, countDays);
    }
}
