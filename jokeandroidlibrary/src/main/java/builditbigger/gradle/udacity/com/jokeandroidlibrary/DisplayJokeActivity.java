package builditbigger.gradle.udacity.com.jokeandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokeTextView = (TextView) findViewById(R.id.jokeTextView);
        String jokeStr = getResources().getString(R.string.joke);
        if(getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().get(jokeStr) != null) {
            jokeTextView.setText(getIntent().getExtras().get(jokeStr).toString());
        }
    }
}
