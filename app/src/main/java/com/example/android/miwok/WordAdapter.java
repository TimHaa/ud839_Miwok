package com.example.android.miwok;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mActivityColor;
    public WordAdapter(Activity context, ArrayList<Word> words, int activityColor){
        super(context, 0, words);
        mActivityColor = activityColor;
    }
    MediaPlayer mMediaPlayer;
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView defaultWord = (TextView) listItemView.findViewById(R.id.de);
        defaultWord.setText(currentWord.getDefaultTranslation());
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.mi);
        miwokWord.setText(currentWord.getMiwokTranslation());
        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageId());
            image.setVisibility(View.VISIBLE);
        }else{
            image.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mActivityColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
