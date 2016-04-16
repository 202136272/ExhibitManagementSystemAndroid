package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

/**
 * Created by Bonga on 4/2/2016.
 */
public class Department {
    private String name;
    private  String location;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }



/*    public Department(Builder builder) {


        name = builder.name;
        location = builder.location;

    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String location;


        public Builder (String name) {
            this.name = name; //compalsury
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }


        public Builder copy(Department department){
            this.name = department.getName();
            this.location = department.getLocation();

            return this;
        }
        public Department build() {
            return new Department(this);
        }
    }*/

}
