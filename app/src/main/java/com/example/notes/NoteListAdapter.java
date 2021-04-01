package com.example.notes;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class NoteListAdapter extends ArrayAdapter {
    Context context;
    List<Note> notesList;

    public NoteListAdapter(Context context, int layoutToBeInflated,List<Note> notesList){
        super(context,R.layout.grid_list_item,notesList);
        this.context = context;
        this.notesList = notesList;
    }


}
