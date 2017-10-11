import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.xuka.myapplication.MainActivity;
import com.example.xuka.myapplication.R;

/**
 * Created by xuka on 10/11/2017.
 */

public class loginActivity extends AppCompatActivity {
    private ImageButton imgbanhxeo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imgbanhxeo = (ImageButton) findViewById(R.id.img);

        imgbanhxeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
    }

