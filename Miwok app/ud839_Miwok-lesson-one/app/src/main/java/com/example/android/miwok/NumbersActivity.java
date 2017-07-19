/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {
 ArrayList<word> words=new ArrayList<word>();
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        /*
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("ten");
        words.add("ten"); */
        words.add(new word("lutti","one"));
        words.add(new word("otiiko","two"));
        words.add(new word("tolookosu","three"));
        words.add(new word("oyyisa","four"));
        words.add(new word("massokka","five"));
        words.add(new word("temmokka","six"));
        words.add(new word("kenekaku","seven"));
        words.add(new word("kawinta","eight"));
        words.add(new word("wo’e","nine"));
        words.add(new word("na’aacha","ten"));


        ListView listview= (ListView) findViewById(R.id.list);
        WordAdapter itemsadapter = new WordAdapter(this,words);
        listview.setAdapter(itemsadapter);

    }

}
