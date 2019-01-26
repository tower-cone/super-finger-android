package towercone.superfingerandroid;


import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import static android.content.Context.FINGERPRINT_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;
import static towercone.superfingerandroid.UtilsKt.pushFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FingerFragment extends Fragment {


    public FingerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_finger, container, false);

        Button button_police = root.findViewById(R.id.button_police);
        button_police.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //pushFragment(getFragmentManager(), new Fragment_Police());

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_fingerprint, null, false);

                builder.setTitle(R.string.app_name)
                        .setCancelable(true)
                        .setView(view)
                        .setNegativeButton("Закрыть",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });

                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        Button button_doctor = root.findViewById(R.id.button_doctor);
        button_doctor.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //pushFragment(getFragmentManager(), new Fragment_Doctor());

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Важное сообщение!")
                        .setMessage("Приложите палец!")
                        .setCancelable(false)
                        .setNegativeButton("Закрыть",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        Button button_seller_ = root.findViewById(R.id.button_seller);
        button_seller_.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //pushFragment(getFragmentManager(), new Fragment_Seller());

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Важное сообщение!")
                        .setMessage("Приложите палец!")
                        .setCancelable(false)
                        .setNegativeButton("Закрыть",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        return root;
    }

}
