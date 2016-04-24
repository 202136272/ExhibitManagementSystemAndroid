package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Bonga on 4/1/2016.
 */


public class Ballistic extends Department implements Serializable{

    private Long id;
    private String reference;
    private String name;
    private String type;

    public String getName() {
        return name;
    }


    public String getReference() {
        return reference;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




        public Ballistic(Builder builder) {

            id = builder.id;
            name = builder.name;
            reference = builder.reference;
            type = builder.type;

        }


        public static class Builder {

            //Equivalent to setters
            private Long id;
            private String name;
            private String reference;
            private String type;


            public Builder  id(Long id) {
                this.id = id;

                return this;
            }
            public Builder  name(String name)

            {
                this.name = name;

                return this;
            }

            public Builder reference(String reference) {
                this.reference = reference;
                return this;
            }

            public Builder type(String type) {
                this.type = type;
                return this;
            }



            public Builder copy(Ballistic ballistic){
                this.name = ballistic.getName();
                this.reference = ballistic.getReference();
                this.type = ballistic.getType();

                return this;
            }
            public Ballistic build() {
                return new Ballistic(this);
            }
        }

    }