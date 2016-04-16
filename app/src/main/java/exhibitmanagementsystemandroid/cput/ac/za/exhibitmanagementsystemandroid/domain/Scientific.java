package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

/**
 * Created by Bonga on 4/1/2016.
 */
public class Scientific extends Department {
    private String name;
    private Double mass;

    @Override
    public String getName() {
        return name;
    }

    public Double getMass() {
        return mass;
    }


    public Scientific(Builder builder) {


        name = builder.name;
        mass = builder.mass;

    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private Double mass;


        public Builder (String name) {
            this.name = name; //compalsury
        }

        public Builder mass(Double mass) {
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
