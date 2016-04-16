package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Bonga on 4/1/2016.
 */
@Entity
@javax.persistence.Table(name="BALLISTIC")
public class Ballistic extends Department implements Serializable{
    @Id
    @Column(name= "REFERENCE")
    private String reference;
    @Column(name= "NAME")
    private String name;
    @Column(name= "TYPE")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




        public Ballistic(Builder builder) {


            name = builder.name;
            reference = builder.reference;
            type = builder.type;

        }


        public static class Builder {

            //Equivalent to setters
            private String name;
            private String reference;
            private String type;



            public Builder (String name) {
                this.name = name; //compalsury
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