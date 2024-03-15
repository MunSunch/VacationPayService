package com.munsun.vacation_service.tests.services;

import com.munsun.vacation_service.services.impl.providers.PayProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class VacationPayProviderUnitTests {
    @Autowired
    private PayProvider provider;

    @DisplayName("calculation of vacation pay for 35 days excluding weekends and holidays")
    @Test
    public void testCalculate35Days() {
        var expected = 46974.3015;
        var actual = provider.calculate(40_000L, 35);

        assertThat(actual)
                .isEqualTo(expected);
    }
}
