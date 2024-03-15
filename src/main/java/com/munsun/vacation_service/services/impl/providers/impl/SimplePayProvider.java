package com.munsun.vacation_service.services.impl.providers.impl;

import com.munsun.vacation_service.services.impl.providers.PayProvider;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SimplePayProvider implements PayProvider {
    private static final BigDecimal AVERAGE_COUNT_DAYS_MONTH = new BigDecimal("29.3");
    private static final int DEFAULT_ROUND_MODE = 2;
    private static final BigDecimal TAX_PERCENT = new BigDecimal("0.13");

    @Override
    public Double calculate(Long salary, Integer countDays) {
        BigDecimal hundredPercent = new BigDecimal(1);
        var temp = BigDecimal.valueOf(salary)
                .multiply(hundredPercent.add(TAX_PERCENT))
                .divide(AVERAGE_COUNT_DAYS_MONTH, DEFAULT_ROUND_MODE)
                .multiply(BigDecimal.valueOf(countDays))
                .multiply(hundredPercent.subtract(TAX_PERCENT));
        return temp.doubleValue();
    }
}
