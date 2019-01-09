package serenitylabs.tutorials.vetclinic.domain;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {

    public WhenWeCreateANewDog(){
    }

    @Test
    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
    }

    @Test
    public void a_dog_should_be_printed_in_a_readable_form(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        assertThat(fido.toString(), is(equalTo("Fido the black labrador")));
        //assertThat(fido.toString(), is(equalToIgnoringCase("Fido the Black Labrador")));
        assertThat(fido.toString(), startsWith("Fido"));
        assertThat(fido.toString(), endsWith("labrador"));
        assertThat(fido.toString(), containsString("black"));

    }

    @Test
    public void a_dog_would_have_several_colours(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador")
                      .andOfColour("Black", "White");

        //assertThat(fido.getColour(), contains("Black","White"));
        assertThat(fido.getColour(), hasItem("Black"));
        //assertThat(fido.getColour(), not(hasItem("Red")));

    }
}
