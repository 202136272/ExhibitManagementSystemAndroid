package exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.Impl;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import java.io.IOException;

import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.conf.util.App;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.domain.Administrator;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.Personel.AdministratorRepository;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.repository.Personel.Impl.AdministratorRepositoryImpl;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.restapi.AdministratorAPI;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.restapi.Impl.AdministratorAPIImpl;
import exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.AdmistratorServices;

/**
 * Created by Bonga on 5/7/2016.
 */
public class AdministratorServiceImpl extends IntentService implements AdmistratorServices{

    private final AdministratorAPI api;
    private final AdministratorRepository repo;


    private static final String ACTION_ADD = "exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.action.ADD";
    private static final String ACTION_UPDATE = "exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.action.UPDATE";

    // TODO: Rename parameters
    private static final String EXTRA_ADD = "exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.extra.ADD";
    private static final String EXTRA_UPDATE = "exhibitmanagementsystemandroid.cput.ac.za.exhibitmanagementsystemandroid.services.person.extra.UPDATE";

    private static AdministratorServiceImpl service = null;


    public static AdministratorServiceImpl getInstance() {
        if (service == null)
            service = new AdministratorServiceImpl();
        return service;
    }

    private AdministratorServiceImpl() {
        super("AdministratorServiceImpl");
        api = new AdministratorAPIImpl();
        repo = new AdministratorRepositoryImpl(App.getAppContext());
    }

    @Override
    public void updateAdmistrator(Context context, Administrator administrator) {
        Intent intent = new Intent(context, AdministratorRepositoryImpl.class);
        intent.setAction(ACTION_ADD);
        intent.putExtra(EXTRA_ADD, administrator);
        context.startService(intent);
    }

    @Override
    public void createAdministrator(Context context, Administrator administrator) {
        Intent intent = new Intent(context, AdministratorRepositoryImpl.class);
        intent.setAction(ACTION_UPDATE);
        intent.putExtra(EXTRA_UPDATE, administrator);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)) {
                final Administrator administrator= (Administrator) intent.getSerializableExtra(EXTRA_ADD);
                postAdministrator(administrator);
            } else if (ACTION_UPDATE.equals(action)) {
                final Administrator administrator = (Administrator) intent.getSerializableExtra(EXTRA_UPDATE);
                updateAdministrator(administrator);
            }
        }
    }

    private void updateAdministrator(Administrator  admin) {
        //POST and Save Local
        try {
            Administrator updateAdmin =  api.updateAdministrator(admin);
            repo.save(updateAdmin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void postAdministrator(Administrator admin) {
        //POST and Save Local
        try {
            Administrator createdAdmin= api.createAdministrator(admin);
            repo.save(createdAdmin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
