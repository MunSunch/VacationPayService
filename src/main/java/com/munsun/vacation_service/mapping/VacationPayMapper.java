package com.munsun.vacation_service.mapping;

import com.munsun.vacation_service.dto.response.VacationPayDtoOut;

public interface VacationPayMapper {
    VacationPayDtoOut map(Double averageWeekendSalary);
}
