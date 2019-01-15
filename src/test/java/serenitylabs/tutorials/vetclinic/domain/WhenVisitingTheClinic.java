package serenitylabs.tutorials.vetclinic.domain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import org.junit.Test;

public class WhenVisitingTheClinic {

  @Test
  public void cats_and_dogs_complain_to_the_assistant() {
    Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
    Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("Black","White");

    ComplaintRegister complaintRegister = new ComplaintRegister();
    VetAssistant assistant = new VetAssistant(complaintRegister);

    assistant.recordComplaintFrom(fido);
    assistant.recordComplaintFrom(felix);

    assertThat(complaintRegister.getComplaints(), hasItems("Grrrr", "Meow"));
  }

  @Test
  public void the_vet_Should_know_when_a_pet_vaccination_is_due() {
    NeedsVaccinations felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("Black","White");

    LocalDate today = LocalDate.now();
    LocalDate nextYear = today.plusYears(1);

    felix.wasVaccinatedOn(today);

    assertThat(felix.nextVaccinationDue(), is(equalTo(nextYear)));
  }

  @Test
  public void dogs_need_vaccinations_every_six_months() {
    NeedsVaccinations fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

    LocalDate today = LocalDate.now();
    LocalDate InSixMonthsTime = today.plusMonths(6);

    fido.wasVaccinatedOn(today);

    assertThat(fido.nextVaccinationDue(), is(equalTo(InSixMonthsTime)));

  }
}
