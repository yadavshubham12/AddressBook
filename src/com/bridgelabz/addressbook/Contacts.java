package com.bridgelabz.addressbook;

import java.util.Objects;

public class Contacts {

     public String firstName;

     public String lastName;

     public String city;

     public String address;

     public String state;

     public int zip;

     public long phoneNum;

     public String email;

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getState() {
          return state;
     }

     public void setState(String state) {
          this.state = state;
     }

     public int getZip() {
          return zip;
     }

     public void setZip(int zip) {
          this.zip = zip;
     }

     public long getPhoneNum() {
          return phoneNum;
     }

     public void setPhoneNum(long phoneNum) {
          this.phoneNum = phoneNum;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
          
     }

     public void createContact() {
     }

     @Override
     public String toString() {
          return "CreateContact{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", city='" + city + '\'' +
                  ", address='" + address + '\'' +
                  ", state='" + state + '\'' +
                  ", zip=" + zip +
                  ", phoneNum=" + phoneNum +
                  ", email='" + email + '\'' +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Contacts contacts = (Contacts) o;
          return zip == contacts.zip && phoneNum == contacts.phoneNum && Objects.equals(firstName, contacts.firstName) && Objects.equals(lastName, contacts.lastName) && Objects.equals(city, contacts.city) && Objects.equals(address, contacts.address) && Objects.equals(state, contacts.state) && Objects.equals(email, contacts.email);
     }

     @Override
     public int hashCode() {
          return Objects.hash(firstName, lastName, city, address, state, zip, phoneNum, email);
     }
}
