package com.sneha.smartagro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;



public class CropActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<MainListItem> list;
    CropAdapter adapter;

    Integer[] imageUrls={R.drawable.wheat,R.drawable.paddy,R.drawable.arhar};

    Integer[] hindiTexts={R.string.crop1_hi,R.string.crop2_hi,
            R.string.crop3_hi};

    Integer[] englishTexts={R.string.crop1_en,R.string.crop2_en,
            R.string.crop3_en};

    String[] backgroundColors={"#86c5f9","#86c5f9","#86c5f9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_recycler);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        list=new ArrayList<>();

        Intent[] links=getIntents();

        for (int i=0;i<imageUrls.length;i++)
        {
            MainListItem item=new MainListItem();
            item.setEnglishText(englishTexts[i]);
            item.setHindiText(hindiTexts[i]);
            item.setBackgroundColor(backgroundColors[i]);
            item.setImageUrl(imageUrls[i]);
            item.setIntent(links[i]);
            list.add(item);
        }

        adapter=new CropAdapter(this,list);

        mRecyclerView=(RecyclerView)findViewById(R.id.recycler);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

        findViewById(R.id.progress).setVisibility(View.GONE);
    }


    public Intent[] getIntents(){
        Intent i1=new Intent(this, CropDetailActivity.class);
        Intent i2=new Intent(this, CropDetailActivity.class);
        Intent i3=new Intent(this, CropDetailActivity.class);
        i1.putExtra("number",1);
        i2.putExtra("number",2);
        i3.putExtra("number",3);

        Intent[] links={ i1, i2, i3 };

        return links;
    }

}

