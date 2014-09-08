package com.ust.justin.universityofsantotomascampustour;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;


public class main extends ActionBarActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public void arch(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), arch.class));
    }

    public void quadricentennialpavilion(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), QuadricentennialPavilion.class));
    }

    public void RoqueRuanoBldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), RoqueRuanoBldg.class));
    }

    public void albertusmagnusbldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), AlbertusMagnusBldg.class));
    }

    public void amv(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), AMV.class));
    }

    public void usthospital(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), USTHospital.class));
    }

    public void usthealthservice(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), USTHealthService.class));
    }

    public void plazabenavides(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), PlazaBenavides.class));
    }

    public void benavidesmonument(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), BenavidesMonument.class));
    }

    public void mainbuilding(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), MainBuilding.class));
    }

    public void rosarium(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Rosarium.class));
    }

    public void stmartindeporresbldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), StMartinDePorresBldg.class));
    }

    public void straymundpenafortbldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), StRaymundPenafortBldg.class));
    }

    public void quadricentennialsquare(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), QuadricentennialSquare.class));
    }

    public void migueldebenavideslibrary(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), MigueldeBenavidesLibrary.class));
    }

    public void tanyankeebldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), TanYanKeeBldg.class));
    }

    public void tarc(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), TARC.class));
    }

    public void benavidesbldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), BenavidesBldg.class));
    }

    public void santisimorosarioparishchurch(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), SantisimoRosarioParishChurch.class));
    }

    public void buenaventuragarciaparedesopbldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), BuenaventuraGarciaParedesOPBldg.class));
    }

    public void beatoangelicobldg(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), BeatoAngelicoBldg.class));
    }

    public void ustMap(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), ustmap.class));
    }
/*
    public void arch(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), arch.class));
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
