package id.ac.poliban.dts.alfin.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btRealmadrid = findViewById(R.id.btRealmadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btLancester = findViewById(R.id.btLancester);
        Button btFlorentina = findViewById(R.id.btFlorentina);

        btRealmadrid.setOnClickListener(v -> {
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Guweh Barcelona Fans Club", Toast.LENGTH_SHORT).show();
        });
        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "i'm Barcelona", Toast.LENGTH_SHORT).show());
        btLancester.setOnClickListener(v -> Toast.makeText(this, "i'm Lancester", Toast.LENGTH_SHORT).show());
        btFlorentina.setOnClickListener(v -> Toast.makeText(this, "i'm Florentina", Toast.LENGTH_SHORT).show());
    }
}
