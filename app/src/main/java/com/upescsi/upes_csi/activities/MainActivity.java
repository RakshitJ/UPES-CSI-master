package com.upescsi.upes_csi.activities;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.Toast;
import android.widget.Toolbar;

<<<<<<< HEAD
import com.upescsi.upes_csi.fragments.AboutFragment;
import com.upescsi.upes_csi.fragments.EventsFragment;

import com.upescsi.upes_csi.fragments.NavigationDrawerFragment;
import com.upescsi.upes_csi.R;
import com.upescsi.upes_csi.fragments.TeamFragment;

import static com.upescsi.upes_csi.R.*;
=======
import com.upescsi.upes_csi.fragments.EventsFragment;
import com.upescsi.upes_csi.fragments.NavigationDrawerFragment;
import com.upescsi.upes_csi.R;
>>>>>>> upstream/master


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    public android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(layout.activity_main);

        // toolbar
        toolbar = (android.support.v7.widget.Toolbar) findViewById(id.action_bar);
=======
        setContentView(R.layout.activity_main);

        // toolbar
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.action_bar);
>>>>>>> upstream/master
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#ff455a64"));

        mNavigationDrawerFragment = (NavigationDrawerFragment)
<<<<<<< HEAD
                getSupportFragmentManager().findFragmentById(id.navigation_drawer);
=======
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
>>>>>>> upstream/master
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
<<<<<<< HEAD
                id.navigation_drawer,
                (DrawerLayout) findViewById(id.drawer_layout), this);
=======
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout), this);
>>>>>>> upstream/master
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position) {
            case 0:
                fragmentManager.beginTransaction().replace(R.id.container, new EventsFragment()).commit();
                break;
            case 1:
                Toast.makeText(this, "Contact", Toast.LENGTH_LONG).show();
                break;
<<<<<<< HEAD

            case 2:
                Toast.makeText(this, "About", Toast.LENGTH_LONG).show();
                break;
            case 3:
                fragmentManager.beginTransaction().replace(R.id.container, new TeamFragment()).commit();
                break;


=======
            case 2:
                Toast.makeText(this, "About", Toast.LENGTH_LONG).show();
                break;
>>>>>>> upstream/master
        }
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
<<<<<<< HEAD
                mTitle = getString(string.events);
                break;
            case 2:
                mTitle = getString(string.contact);
                break;
            case 3:
                mTitle = getString(string.about);
                break;
            case 4:
                mTitle = getString(string.about);
                break;

=======
                mTitle = getString(R.string.events);
                break;
            case 2:
                mTitle = getString(R.string.contact);
                break;
            case 3:
                mTitle = getString(R.string.about);
                break;
>>>>>>> upstream/master
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
