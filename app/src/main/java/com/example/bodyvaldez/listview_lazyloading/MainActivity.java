package com.example.bodyvaldez.listview_lazyloading;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    //Declare the ListView
    ListView lv;
    //Declare the array objects that will be in the listview
    ArrayList<Movie> movies = new ArrayList<Movie>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lazy_loading_list);
        setAllMovies();
        lv.setAdapter(new MoviesAdapter(this,movies));

    }

    public void setAllMovies(){
        movies.add(new Movie("Minions","http://images.hngn.com/data/images/full/38999/minions.png?w=650"));
        movies.add(new Movie("Terminator Genisys","http://i2.wp.com/bitcast-a-sm.bitgravity.com/slashfilm/wp/wp-content/images/Terminator-Genisys-poster-final.jpg"));
        movies.add(new Movie("Inside Out","http://screenrant.com/wp-content/uploads/inside-out-poster.jpg"));
        movies.add(new Movie("Jurassic World","http://elcineriodico.com/wp-content/uploads/2015/04/Jurassic-World-Foto-Poster-3.jpg"));
        movies.add(new Movie("Insidious Chapter 3","http://kinorio.lv/wp-content/uploads/2015/04/Insidious-Chapter-3-poster-1.jpg"));
        movies.add(new Movie("Poltergeist","http://images.fandango.com/images/fandangoblog/Poltergeist_VerC_RatedPoster_sRGB.JPG"));
        movies.add(new Movie("Hot Pursuit","http://i1.wp.com/cine3.com/wp-content/uploads/2015/03/Hot-pursuit.jpg"));
        movies.add(new Movie("San Andreas","http://www.filmandtvnow.com/wp-content/uploads/2015/04/ANDRS_1SHT_MAIN_INTL_2764x4096_master.jpg"));
        movies.add(new Movie("Spy","http://blog.coyoteproductions.co.uk/wp-content/uploads/2015/03/Spy-Poster.jpg"));
        movies.add(new Movie("Dragon Ball Z: Resurrection 'F''","http://www.animecion.com/wp-content/uploads/2015/04/Dragon-Ball-Z-Resurrection-of-F-Poster-2-Mexico.jpg"));
    }

}
