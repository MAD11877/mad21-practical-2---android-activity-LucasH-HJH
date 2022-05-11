package sg.edu.np.mad.week2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!"); //Log messages

        Button flwBtn = findViewById(R.id.flwBtn); //Follow Button
        //Button msgBtn = findViewById(R.id.msgBtn); //Message Button

        //Create new User object
        User user = new User();
        user.setName("Lucas"); //Set Username
        user.setDescription("Testing"); //Set Description
        user.setId(123); //Set ID
        user.setFollowed(false); //Set Followed

        flwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Follow
                if (user.isFollowed() == false)
                {
                    flwBtn.setText("Unfollow");
                    user.setFollowed(true);
                }
                //Unfollow
                else
                {
                    flwBtn.setText("Follow");
                    user.setFollowed(false);
                }

                Log.v(TAG, "Follow Button Pressed"); //When Button pressed
            }
        });
    }
}