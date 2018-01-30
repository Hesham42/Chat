package com.example.root.chat.ui.activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.root.chat.R;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.StorageReference;

import de.hdodenhof.circleimageview.CircleImageView;

public class Setting extends AppCompatActivity {

    private FirebaseUser mCurrentUser;
    //Android Layout
    private CircleImageView mDisplayImage;
    private TextView mName;
    private TextView mStatus;

    private Button mStatusBtn;
    private Button mImageBtn;
    private static final int GALLERY_PICK = 1;

    // Storage Firebase
    private StorageReference mImageStorage;

    private ProgressDialog mProgressDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
}
