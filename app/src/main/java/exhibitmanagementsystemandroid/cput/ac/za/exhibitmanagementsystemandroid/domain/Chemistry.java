package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import javax.persistence.Column;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Bonga on 4/1/2016.
 */

public class Chemistry extends Department implements Serializable{

    private  String id;
    private  String mass;
    private  String amount;
    private String type;
    private String effect ;

    public String getId() {
        return id;
    }

    public String getMass() {
        return mass;
    }

    public String getAmount() {
        return amount;
    }

   /*
    public String getName() {
        return name;
    }
    */

    public String getEffect() {
        return effect;
    }
}
