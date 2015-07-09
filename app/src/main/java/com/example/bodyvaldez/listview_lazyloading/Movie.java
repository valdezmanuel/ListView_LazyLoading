package com.example.bodyvaldez.listview_lazyloading;

/**
 * Created by Body Valdez on 08/07/2015.
 */
public class Movie{
    String urlImg;
    String title;

    public Movie(String title,String urlImg){
        this.urlImg = urlImg;
        this.title = title;
    }

    //get url image of the movie
    public String getUrlImg(){
        return  urlImg;
    }
    //get title of the movie
    public String getTitle(){
        return title;
    }
    //set url image of the movie
    public void setUrlImg(String urlImg){
        this.urlImg = urlImg;
    }
    //set title of the movie
    public void setTitle(String title){
        this.title = title;
    }
}
