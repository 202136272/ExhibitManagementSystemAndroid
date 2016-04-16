package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import org.hibernate.annotations.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//
/**
 * Created by Bonga on 4/1/2016.
 */
@Entity
@javax.persistence.Table(name="BIOLOGY")
public class Biology extends Department implements Serializable {
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



    public Biology(Builder builder) {


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



        public Builder copy(Biology biology){
            this.name = biology.getName();
            this.reference = biology.getReference();
            this.type = biology.getType();

            return this;
        }
        public Biology build() {
            return new Biology(this);
        }
    }

}
