package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import junit.framework.Assert;

import java.util.Set;

import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain.Administrator;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.factory.AdministratorFactory;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.AdministratorRepository;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.Impl.AdministratorRepositoryImpl;

public class MainActivity extends Activity {
    String msg = "Android : ";


    private Long id;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

        Button button_readAll = (Button) findViewById(R.id.button_send);
        Button button_delete = (Button) findViewById(R.id.button_send);
        Button button_update = (Button) findViewById(R.id.button_send);
        Button button_save = (Button) findViewById(R.id.button_send);

        button_readAll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button clicko
                AdministratorRepository repo = new AdministratorRepositoryImpl(getApplicationContext());
                //READ ALL
                Set<Administrator> administrators = repo.findAll();
                String data = "";
                for(Administrator admin : administrators){
                    data += admin.getId() + "   " + admin.getName() + "\n";
                }

                for (int i=0; i < 2; i++) {

                    Toast.makeText(getApplicationContext(), "SQL Lite Data\n" + data, Toast.LENGTH_LONG).show();

                }
            }
        });

        button_save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button clicko
                AdministratorRepository repo = new AdministratorRepositoryImpl(getApplicationContext());

                Administrator adminSave = AdministratorFactory.CreateAdministrator("Admin", "USER","1");
                //READ ALL
                 Administrator savedEntity = repo.save(adminSave);

                String data = savedEntity.getId() + "  " + savedEntity.getName() + "  " + savedEntity.getSurname()
                        + "   " + savedEntity.getPersalNumber();

                for (int i=0; i < 2; i++) {

                    Toast.makeText(getApplicationContext(), "SQL Lite Data\n" + data, Toast.LENGTH_LONG).show();

                }

                id = savedEntity.getId();
            }
        });

        button_delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button clicko
                AdministratorRepository repo = new AdministratorRepositoryImpl(getApplicationContext());

                Administrator deletedEntity = repo.findById(id);

                String data = deletedEntity.getId() + "  " + deletedEntity.getName() + "  " + deletedEntity.getSurname()
                        + "   " + deletedEntity.getPersalNumber();

                for (int i=0; i < 2; i++) {

                    Toast.makeText(getApplicationContext(), "SQL Lite Data\n" + data, Toast.LENGTH_LONG).show();

                }

            }
        });

        button_update.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button clicko
                AdministratorRepository repo = new AdministratorRepositoryImpl(getApplicationContext());
                //READ ALL
                Set<Administrator> administrators = repo.findAll();
                String data = "";
                for(Administrator admin : administrators){
                    data += admin.getId() + "   " + admin.getName() + "\n";
                }

                for (int i=0; i < 2; i++) {

                    Toast.makeText(getApplicationContext(), "SQL Lite Data\n" + data, Toast.LENGTH_LONG).show();

                }
            }
        });




    }

}
