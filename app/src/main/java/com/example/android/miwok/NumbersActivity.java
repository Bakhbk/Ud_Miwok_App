package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one","lutti", R.drawable.number_one));
        words.add(new Word("two","otiiko", R.drawable.number_two));
        words.add(new Word("three","tolookosu", R.drawable.number_three));
        words.add(new Word("four","oyyisa", R.drawable.number_four));
        words.add(new Word("five","massokka", R.drawable.number_five));
        words.add(new Word("six","temmokka", R.drawable.number_six));
        words.add(new Word("seven","kenekaku", R.drawable.number_seven));
        words.add(new Word("eight","kawinta", R.drawable.number_eight));
        words.add(new Word("nine","wo'e", R.drawable.number_nine));
        words.add(new Word("ten","na'aacha", R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


//        Не удалять, пример для использования while loop
//        // Find the root view of the whole layout
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        // Create a variable to keep track of the current index position
//        int index = 0;
//        while (index < words.size()) {
//            // Create a new {@link TextView} that displayed the word at
//            // and add the View as a child to the rootView
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            // Update counter variable
//            index++; //index = index + 1

        //        Не удалять, пример для использования for loop
//        for (int index = 0; index < words.size(); index++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
    }
}