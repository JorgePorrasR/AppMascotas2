package mx.com.systemjorge.appmascotas.Providers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PubliProvider {
    private DatabaseReference mDatabase;

    public PubliProvider() {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("publicidad");
    }

    public DatabaseReference getImagenes() {
        return mDatabase;
    }
}
