package designPatterns.creationalDesignPatterns.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    // methods to build parts of the product at a time
    UserDTOBuilder withFirstName(String fName);

    UserDTOBuilder withLastName(String lName);

    UserDTOBuilder withBirthDay(LocalDate lDate);

    UserDTOBuilder withAddress(Address address);

    // method to assemble final product
    UserDTO build();

    // (optional) method to fetch already created object
    UserDTO getUserDTO();
}
