// Message Activity 
package com.example.hw2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Message message = (Message) bundle.getSerializable("message");

            if (message != null) {
                TextView Name = findViewById(R.id.name);
                TextView Text = findViewById(R.id.text);
                ImageView Avatar = findViewById(R.id.avatar);

                Glide.with(this).load(message.Avatar).into(Avatar);
                Name.setText(message.Name);
                Text.setText(message.Text);
            } else {
                // Handle the case where the message is null
                // This could involve showing an error message or finishing the activity
            }
        } else {
            // Handle the case where the bundle is null
            // This could involve showing an error message or finishing the activity
        }
    }
}
