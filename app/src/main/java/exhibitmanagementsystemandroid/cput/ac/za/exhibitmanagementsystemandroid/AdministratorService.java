package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdministratorService extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator_service);


        Button adminStartService = (Button) findViewById(R.id.button_start_service);
        adminStartService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent msgIntent = new Intent(getApplicationContext(), AdministratorService.class);
                //msgIntent.putExtra(SimpleIntentService.PARAM_IN_MSG, strInputMsg);
                startService(msgIntent);

                Toast.makeText(getApplicationContext(), "Service Started\n", Toast.LENGTH_LONG).show();


            }
        });

    }
}
