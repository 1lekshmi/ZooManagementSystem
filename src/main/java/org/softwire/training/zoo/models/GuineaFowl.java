package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GuineaFowl extends AbstractAnimal implements LargeAnimal{
    private LocalDateTime lastGroomed;

    public GuineaFowl (LocalDate dateOfBirth){
        super(dateOfBirth);
    }


}
