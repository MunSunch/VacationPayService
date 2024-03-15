package com.munsun.vacation_service.mapping.impl;

import com.munsun.vacation_service.dto.response.VacationPayDtoOut;
import com.munsun.vacation_service.mapping.VacationPayMapper;
import org.springframework.stereotype.Component;

@Component
public class DefaultVacationPayMapper implements VacationPayMapper {
    @Override
    public VacationPayDtoOut map(Double averageWeekendSalary) {
        return new VacationPayDtoOut(averageWeekendSalary.toString());
    }
}
