package designPatterns.creationalDesignPatterns.builder;

import java.time.LocalDate;

public class DriverClass {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        // method chaining
        // method chaining is not compulsory we can still continue
        // without method chaining
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDay(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960,5,6));
        user.setFirstName("Ron");
        user.setLastName("Samson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
