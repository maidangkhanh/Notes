package com.example.notes;

import android.app.ListActivity;
import android.os.Bundle;
import java.util.List;

public class MainActivity extends ListActivity {

    List<Note> noteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoteListAdapter adapter = new NoteListAdapter(this,R.layout.grid_list_item,noteList);
        setListAdapter(adapter);
    }
}