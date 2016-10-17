package com.rwoods.discipleconnect.model;

import org.springframework.data.annotation.Id;

/**
 * Created by rahmanwoods on 10/16/16.
 */
public class User {

    @Id
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String gender;

    private String email;
    private String homeChurch;
    private String homeChurchCity;
    private String homeChurchStateProvince;


    public User() {
    }

    private User(UserBuilder builder) {
        this.firstName = builder.builderFirstName;
        this.lastName = builder.builderLastName;
        this.phoneNumber = builder.builderPhoneNumber;
        this.address = builder.builderAddress;
        this.city = builder.builderCity;
        this.stateProvince = builder.builderStateProvince;
        this.postalCode = builder.builderPostalCode;
        this.gender = builder.builderGender;
        this.email = builder.builderEmail;
        this.homeChurch = builder.builderHomeChurch;
        this.homeChurchCity = builder.builderHomeChurchCity;
        this.homeChurchStateProvince = builder.builderHomeChurchStateProvince;
    }

    public static class UserBuilder {
        private String builderUserName;
        private String builderFirstName;
        private String builderLastName;
        private String builderPhoneNumber;
        private String builderAddress;
        private String builderCity;
        private String builderStateProvince;
        private String builderPostalCode;
        private String builderGender;
        private String builderEmail;
        private String builderHomeChurch;
        private String builderHomeChurchCity;
        private String builderHomeChurchStateProvince;

        public UserBuilder(String builderUserName, String builderFirstName,
                           String builderLastName, String builderPhoneNumber,
                           String builderGender, String builderEmail,
                           String builderHomeChurch, String builderHomeChurchCity,
                           String builderHomeChurchStateProvince) {
            this.builderUserName = builderUserName;
            this.builderFirstName = builderFirstName;
            this.builderLastName = builderLastName;
            this.builderPhoneNumber = builderPhoneNumber;
            this.builderGender = builderGender;
            this.builderEmail = builderEmail;
            this.builderHomeChurch = builderHomeChurch;
            this.builderHomeChurchCity = builderHomeChurchCity;
            this.builderHomeChurchStateProvince = builderHomeChurchStateProvince;
        }


        public UserBuilder streetAddress(String newStreetAddress)
        {
            this.builderAddress = newStreetAddress;
            return this;
        }

        public UserBuilder city(String newCity)
        {
            this.builderCity = newCity;
            return this;
        }

        public UserBuilder stateProvince(String newStateProvince)
        {
            this.builderStateProvince = newStateProvince;
            return this;
        }

        public UserBuilder postalCode(String newPostalCode)
        {
            this.builderPostalCode = newPostalCode;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeChurch() {
        return homeChurch;
    }

    public String getHomeChurchCity() {
        return homeChurchCity;
    }

    public String getHomeChurchStateProvince() {
        return homeChurchStateProvince;
    }
}
