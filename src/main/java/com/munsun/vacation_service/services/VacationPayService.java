package com.munsun.vacation_service.services;

import com.munsun.vacation_service.dto.response.VacationPayDtoOut;

public interface VacationPayService {
    VacationPayDtoOut calculate(Long salary, Integer countDays);
}
