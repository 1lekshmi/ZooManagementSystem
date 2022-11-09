package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GuineaFowl extends AbstractAnimal implements LargeAnimal, CanBeGroomed{
    private LocalDateTime lastGroomed;

    public GuineaFowl (LocalDate dateOfBirth){
        super(dateOfBirth);
    }

    @Override
    public void groom(){
        lastGroomed = LocalDateTime.now();
    }

    @Override
    public String toString(){
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }


}
