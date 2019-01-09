package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import static com.google.common.collect.Range.greaterThan;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class WhenCalculatingTotalPrices {

    @Test
    public void total_consultation_price_should_include_20_percent_tax() throws Exception {
        // GIVEN
        int netPrice = 100;

        // WHEN
        int totalPrice = TotalConsultationPrice.includingTax().forANetPriceOf(netPrice);

        // THEN
        assertThat(totalPrice, equalTo(120));
    }


}
