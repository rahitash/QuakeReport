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
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Quake> earthquakes = QueryUtils.extractEarthquakes();
//        earthquakes.add(new Quake("8.2","San Francisco","Nov 02, 1990"));
//        earthquakes.add(new Quake("8.0","London","Jan 23, 2009"));
//        earthquakes.add(new Quake("6.7","Tokyo","Mar 06,2004"));
//        earthquakes.add(new Quake("8.3","Mexico City","Jun 30,2001"));
//        earthquakes.add(new Quake("4.2","Moscow","Dec 18, 1993"));
//        earthquakes.add(new Quake("6.7","Rio de Janeiro","Nov 09, 2017"));
//        earthquakes.add(new Quake("3.6","Paris","Mar 28,2020"));

        QuakeAdapter earthQuakeAdapter = new QuakeAdapter(this,earthquakes);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(earthQuakeAdapter);
    }
}
