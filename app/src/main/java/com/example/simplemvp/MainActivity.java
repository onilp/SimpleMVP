package com.example.simplemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContract.View{
    MainContract.Presenter presenter;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        editText =findViewById(R.id.editTextName);
    }

    public void saveName(View view) {
        String name = editText.getText().toString();
        presenter.buttonClicked(name);


    }

    @Override
    public void showToast(String name) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

    }
}
