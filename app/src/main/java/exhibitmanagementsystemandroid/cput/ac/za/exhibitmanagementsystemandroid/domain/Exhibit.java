package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import java.io.Serializable;

/**
 * Created by Leonard Dukashe on 2016/03/28.
 */

public class Exhibit implements Serializable {
    private Long id;
    private String casNumber;
    private String sceneType; // ballistic, biology, chemistry, precious metals, questioned doc, scientific
    private String station;
    private String description;

    public Long getId() {
        return id;
    }

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

        id = builder.id;
        casNumber = builder.casNumber;
        station = builder.station;
        description = builder.description;
        sceneType = builder.sceneType;

    }


    public static class Builder {

        //Equivalent to setters
        private Long id;
        private String casNumber;
        private String station;
        private String description;
        private String sceneType;

        public Builder id(Long id) {
            this.id = id;//compalsury
            return this;
        }

        public Builder casNumber(String casNumber) {
            this.casNumber = casNumber;
            return this;
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
            this.id = exhibit.getId();
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



