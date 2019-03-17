package com.example.multilingu;

import android.content.res.Resources;
import android.support.v4.os.ConfigurationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView languageName;
    TextView languageCode;
    Locale locale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        languageName = findViewById(R.id.tvLanguage);
        languageCode = findViewById(R.id.tvLanguageCode);
        locale = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration()).get(0);

        languageName.setText(locale.getDisplayName());
        languageCode.setText(locale.getLanguage());
    }
}
