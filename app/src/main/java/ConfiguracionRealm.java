import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class ConfiguracionRealm extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration myConfig = new RealmConfiguration.Builder()
                .name("actividad.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(myConfig);

    }
}
