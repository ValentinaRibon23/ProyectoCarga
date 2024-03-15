package com.upc.cargadirecta.providers;

import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;

public class TokenProvider {

    private DatabaseReference mDatabase;

    public TokenProvider() {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Tokens");
    }

    public void create(final String idUser) {
        if (idUser == null) return;

        // Obtener el token del dispositivo utilizando FirebaseMessaging
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(Task<String> task) {
                        if (!task.isSuccessful()) {
                            Log.w("TokenProvider", "Fetching FCM registration token failed", task.getException());
                            return;
                        }

                        // Get new FCM registration token
                        String token = task.getResult();
                        // Guardar el token en la base de datos de Firebase
                        mDatabase.child(idUser).setValue(token);
                    }
                });
    }

    public DatabaseReference getToken(String idUser) {
        return mDatabase.child(idUser);
    }
}
