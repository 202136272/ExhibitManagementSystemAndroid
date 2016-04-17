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
@Table(name = "PRECIOUS_METALS")
public class PreciousMetals extends Department implements Serializable{
    @Id
    @Column(name = "DENSITY")
    private String density;
    @Column(name = "MASS")
    private String mass;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "MELTING_POINT")
    private  String meltingPoint;

    public String getMass() {
        return mass;
    }

    public String getType() {
        return type;
    }

    public String getDensity() {
        return density;
    }

    public String getMeltingPoint() {
        return meltingPoint;
    }



    public PreciousMetals(Builder builder) {

        mass = builder.mass;
        type = builder.type;
        density = builder.density;
        meltingPoint = builder.meltingPoint;
    }


    public static class Builder {

        //Equivalent to setters
        private String mass;
        private String type;
        private String density;
        private String meltingPoint;



        public Builder (String mass) {
            this.mass = mass; //compalsury
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }


        public Builder density(String density) {
            this.density = density;
            return this;
        }

        public Builder meltingPoint(String meltingPoint) {
            this.meltingPoint = meltingPoint;
            return this;
        }

        public Builder copy(PreciousMetals preciousMetals){
            this.mass = preciousMetals.getMass();
            this.type = preciousMetals.getType();
            this.density = preciousMetals.getDensity();
            this.meltingPoint = preciousMetals.getMeltingPoint();

            return this;
        }
        public PreciousMetals build() {
            return new PreciousMetals(this);
        }
    }

}
