package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;

import javax.persistence.Column;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Bonga on 4/1/2016.
 */

@Entity
@javax.persistence.Table(name="CHEMISTRY")
public class Chemistry extends Department implements Serializable{
    @Id
    @Column(name= "ID")
    private  String id;
    @Column(name= "MASS")
    private  String mass;
    @Column(name= "AMOUNT")
    private  String amount;
    @Column(name= "TYPE")
    private String type;
    @Column(name= "EFFECT")
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
