package com.example.tracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Absences extends AppCompatActivity {

    int NbHeuresAbs = 90;
    int NbHeuresNonJustif =60;
    int NbHeuresJustif = 30;
    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absences);
        pieChart = findViewById(R.id.PieChartAbsences);
        ArrayList<PieEntry> pieEntries = new ArrayList<>();
        for (int i =1 ; i<10;i++) {
            float value = (float)(i*10.0);
            pieEntries.add(new PieEntry(i,value));

        }
        PieDataSet  pieDataSet = new PieDataSet(pieEntries, "Absences");

        //pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.setData(new PieData(pieDataSet));
        pieChart.animateXY(5000,5000);
        pieChart.getDescription().setEnabled(false);
    }
}

