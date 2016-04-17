package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Bonga on 4/1/2016.
 */
@Entity
@Table(name = "SCIENTIFIC")
public class Scientific extends Department implements Serializable {
    @Column(name = "NAME")
    private String name;
    @Column(name = "MASS")
    private String mass;

    @Override
    public String getName() {
        return name;
    }

    public String getMass() {
        return mass;
    }


    public Scientific(Builder builder) {


        name = builder.name;
        mass = builder.mass;

    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String mass;


        public Builder (String name) {
            this.name = name; //compalsury
        }

        public Builder mass(String mass) {
            this.mass = mass;
            return this;
        }


        public Builder copy(Scientific scientific){
            this.name = scientific.getName();
            this.mass = scientific.getMass();

            return this;
        }
        public Scientific build() {
            return new Scientific(this);
        }
    }


}
