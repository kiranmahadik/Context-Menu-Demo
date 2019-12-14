package in.kiran.contextmenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tvOne);

        registerForContextMenu(textView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("choose any option");

        getMenuInflater().inflate(R.menu.example_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.optionOne:
                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.optionTwo:
                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                return true;

                default:
                    return super.onContextItemSelected(item);
        }


    }
}
