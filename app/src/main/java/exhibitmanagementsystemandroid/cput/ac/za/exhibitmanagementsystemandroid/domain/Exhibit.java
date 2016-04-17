package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Leonard Dukashe on 2016/03/28.
 */
@Entity
@Table(name = "EXHIBIT")
public class Exhibit implements Serializable {
    @Id
    @Column(name = "CAS_NUMBER")
    private String casNumber;
    @Column(name = "SCENE_TYPE")
    private String sceneType; // ballistic, biology, chemistry, precious metals, questioned doc, scientific
    @Column(name = "STATION")
    private String station;
    @Column(name = "DESCRIPTION")
    private String description;

    public String getCasNumber() {
        return casNumber;
    }

    public String getStation() {
        return station;
    }

    public String getDescription() {
        return description;
    }

    public String getSceneType() {
        return sceneType;
    }

    public Exhibit(Builder builder) {

        casNumber = builder.casNumber;
        station = builder.station;
        description = builder.description;
        sceneType = builder.sceneType;

    }


    public static class Builder {

        //Equivalent to setters
        private String casNumber;
        private String station;
        private String description;
        private String sceneType;


        public Builder (String casNumber) {
            this.casNumber = casNumber; //compalsury
        }

        public Builder station(String station) {
            this.station = station;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder sceneType( String sceneType){
            this.sceneType = sceneType;
            return this;
        }



        public Builder copy(Exhibit exhibit){
            this.casNumber = exhibit.getCasNumber();
            this.station = exhibit.getStation();
            this.description = exhibit.getDescription();
            this.sceneType = exhibit.getSceneType();

            return this;
        }
        public Exhibit build() {
            return new Exhibit(this);
        }
    }


}



