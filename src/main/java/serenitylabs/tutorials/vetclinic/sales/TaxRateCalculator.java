package serenitylabs.tutorials.vetclinic.sales;

import java.util.function.Function;
import serenitylabs.tutorials.vetclinic.sales.model.LineItem;

/**
 * Created by john on 03/07/17.
 */
public interface TaxRateCalculator extends Function<LineItem, TaxRate> {}
