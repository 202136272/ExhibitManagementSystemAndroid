package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Bonga on 4/1/2016.
 */
@Entity
@Table(name = "QUESTIONED_DOC")
public class QuestionedDoc extends Department implements Serializable{
    @Id
    @Column(name = "REFERENCE")
    private String reference;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATE")
    private  String date;
   // boolean value;

    public String getName() {
        return name;
    }

    public String getReference() {
        return reference;
    }

    public String getDate() {
        return date;
    }

    /*public boolean isValue() {
        return value;
    }
*/


    public QuestionedDoc(Builder builder) {


        name = builder.name;
        reference = builder.reference;
        date = builder.date;
        //date = builder.date;
    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String reference;
        private String date;



        public Builder (String name) {
            this.name = name; //compalsury
        }

        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }



        public Builder copy(QuestionedDoc questionedDoc){
            this.name = questionedDoc.getName();
            this.reference = questionedDoc.getReference();
            this.date = questionedDoc.getDate();

            return this;
        }
        public QuestionedDoc build() {
            return new QuestionedDoc(this);
        }
    }

}
