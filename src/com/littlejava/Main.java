package com.littlejava;

import com.littlejava.model.News;
import com.littlejava.model.NewsFactory;
import com.littlejava.view.NewsListViewer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        String resource_path = Main.class.getClassLoader().getResource("read_hub").getPath();
        NewsFactory newsReader = new NewsFactory(resource_path);
        ArrayList<News> newsList = newsReader.fetch();
        NewsListViewer viewer = new NewsListViewer(newsList);
        viewer.display();
    }
}

