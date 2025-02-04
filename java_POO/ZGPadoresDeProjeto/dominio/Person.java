package java_POO.ZGPadoresDeProjeto.dominio;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public Person(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private int age;

        public PersonBuilder() {
        }


        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, email, age);
        }
    }
}
