package omy.boston.mybostonlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teksty = (TextView) findViewById(R.id.tekstView);
        ListView listy = (ListView) findViewById(R.id.listView);

        String[] polja = getResources().getStringArray(R.array.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                                                                android. R.layout.simple_list_item_1,
                                                                polja);
        listy.setAdapter(adapter);

        listy.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        TextView odAndroida = (TextView) view.findViewById(android.R.id.text1);
                        String odAuTekst = odAndroida.getText().toString();

                        ((TextView) findViewById(R.id.tekstView)).setText(odAuTekst);
                    }
                }
        );

    }// onCreate the end!

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**Metoda za puvratak podataka**/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qLog("Zabilježena je metoda - onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**Spremanje podataka**/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qLog("Zabilježena je metoda - onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //Pračenje loga
    private void qLog(String logTekst){
        Log.d("napravi Log", logTekst);
    }
}
