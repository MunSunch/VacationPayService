package com.munsun.vacation_service.services.impl;

import com.munsun.vacation_service.dto.response.VacationPayDtoOut;
import com.munsun.vacation_service.mapping.VacationPayMapper;
import com.munsun.vacation_service.services.VacationPayService;
import com.munsun.vacation_service.services.impl.providers.PayProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultVacationPayService implements VacationPayService {
    private final VacationPayMapper mapper;
    private final PayProvider provider;

    @Override
    public VacationPayDtoOut calculate(Long salary, Integer countDays) {
        Double vacationPay = provider.calculate(salary, countDays);
        return mapper.map(vacationPay);
    }
}
