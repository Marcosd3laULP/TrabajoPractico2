package com.studios91.trabajopractico2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class BreadcastReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {


            if (context.checkSelfPermission(android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(context, "pantalla desbloqueada detectada", Toast.LENGTH_SHORT).show();
                Log.d("BreadCast", "Detectado desbloqueo de pantalla");

                Intent llamada = new Intent(Intent.ACTION_CALL);
                llamada.setData(Uri.parse("tel:2664618598"));

                llamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(llamada);

            }

        }

    }
}