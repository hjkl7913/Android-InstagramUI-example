package org.hello.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView rvInsta;
    private RecyclerView rvInstaMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvInsta = findViewById(R.id.rv_insta_head);

        InstaAdapter adapter = new InstaAdapter();
        adapter.addItem(R.drawable.propic1);
        adapter.addItem(R.drawable.propic2);
        adapter.addItem(R.drawable.propic3);
        adapter.addItem(R.drawable.propic4);
        adapter.addItem(R.drawable.propic5);
        adapter.addItem(R.drawable.propic6);
        adapter.addItem(R.drawable.propic7);
        adapter.addItem(R.drawable.propic8);
        adapter.addItem(R.drawable.propic9);
        adapter.addItem(R.drawable.propic10);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvInsta.setLayoutManager(layoutManager);
        rvInsta.setAdapter(adapter);

        rvInstaMain = findViewById(R.id.rv_insta_main);
        InstaMainAdapter mainAdapter = new InstaMainAdapter();
        mainAdapter.addItem(R.drawable.postpic1);
        mainAdapter.addItem(R.drawable.postpic2);
        mainAdapter.addItem(R.drawable.postpic3);
        mainAdapter.addItem(R.drawable.postpic4);
        mainAdapter.addItem(R.drawable.postpic5);
        mainAdapter.addItem(R.drawable.postpic6);
        mainAdapter.addItem(R.drawable.postpic7);
        mainAdapter.addItem(R.drawable.postpic8);
        mainAdapter.addItem(R.drawable.postpic9);
        mainAdapter.addItem(R.drawable.postpic10);

        layoutManager = new LinearLayoutManager(this);
        rvInstaMain.setLayoutManager(layoutManager);
        rvInstaMain.setAdapter(mainAdapter);

    }
}