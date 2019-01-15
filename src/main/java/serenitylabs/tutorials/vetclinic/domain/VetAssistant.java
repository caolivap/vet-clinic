package serenitylabs.tutorials.vetclinic.domain;

public class VetAssistant {

  private final ComplaintRegister complaintRegister;

  public VetAssistant(ComplaintRegister complainRegister) {

    complaintRegister = complainRegister;
  }

  public void recordComplaintFrom(Animal someAnimal) {
    complaintRegister.recordComplaint(someAnimal.complaint());
  }
}
