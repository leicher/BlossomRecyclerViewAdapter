package leicher.blossom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import leicher.blossom.databinding.ActivityMainBinding;
import leicher.blossom.recyclerview.BlossomAdapter;
import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.BlossomVHFactoryImpl;
import leicher.blossom.recyclerview.data.BlossomDataLevel1;
import leicher.blossom.recyclerview.data.BlossomDataLevel2;
import leicher.blossom.recyclerview.data.BlossomDataLevel3;
import leicher.blossom.recyclerview.dataholder.BlossomDataHolderLevel1;
import leicher.blossom.recyclerview.dataholder.BlossomDataHolderLevel2;
import leicher.blossom.recyclerview.dataholder.BlossomDataHolderLevel3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(inflate.getRoot());

        inflate.recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<BlossomDH> data = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            BlossomDataLevel1 self = new BlossomDataLevel1(i);
            List<BlossomDataHolderLevel2> children = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                BlossomDataLevel2 self2 = new BlossomDataLevel2(j);
                List<BlossomDataHolderLevel3> children3 = new ArrayList<>();

                for (int k = 0; k < 10; k++) {
                    BlossomDataLevel3 self3 = new BlossomDataLevel3(k);
                    children3.add(new BlossomDataHolderLevel3(self3));
                }

                children.add(new BlossomDataHolderLevel2(self2, children3));
            }

            data.add(new BlossomDataHolderLevel1( self, children ));
        }

        inflate.recyclerview.setAdapter(new BlossomAdapter(new BlossomVHFactoryImpl(), data));
    }
}