package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain;
import java.io.Serializable;
import java.lang.reflect.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by Bonga on 4/1/2016.
 */
public class Fire  implements  Serializable{

    private  String type;

    public String getType() {
        return type;
    }
}
