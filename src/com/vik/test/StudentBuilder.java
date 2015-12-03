package com.vik.test;

public class StudentBuilder {
    private String firstName;
    private String lastName;

    private StudentBuilder(Builder builder) {
        firstName = builder.f_Name;
        lastName = builder.l_Name;
    }

    public static class Builder {
        private String f_Name;
        private String l_Name;

        public Builder setFirstName(String fName) {
            f_Name = fName;
            return this;
        }

        public Builder setLastName(String lName) {
            l_Name = lName;
            return this;
        }

        public StudentBuilder build() {
            return new StudentBuilder(this);
        }

    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String args[]) {

        StudentBuilder studentBuilder = new StudentBuilder.Builder().setFirstName("Vikram").setLastName("Ramasahayam").build();
        System.out.println(studentBuilder);
    }

}
