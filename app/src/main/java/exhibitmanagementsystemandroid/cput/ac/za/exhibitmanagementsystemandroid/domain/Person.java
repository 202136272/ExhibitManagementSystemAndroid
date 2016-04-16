package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

/**
 * Created by Leonard Dukashe on 2016/03/28.
 */
public class Person {
    private String name;
    private String surname;
    private String persalNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersalNumber() {
        return persalNumber;
    }


    public Person(Builder builder) {


        name = builder.name;
        surname = builder.surname;
        persalNumber = builder.persalNumber;

    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String surname;
        private String persalNumber;



        public Builder (String name) {
            this.name = name; //compalsury
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder persalNumber(String persalNumber) {
            this.persalNumber = persalNumber;
            return this;
        }



        public Builder copy(Person person){
            this.name = person.getName();
            this.surname = person.getSurname();
            this.persalNumber = person.getPersalNumber();

            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }








}

