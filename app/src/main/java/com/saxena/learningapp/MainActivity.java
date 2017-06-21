package com.saxena.learningapp;
 
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
 
public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    int images[] = {R.drawable.prepare, R.drawable.test, R.drawable.personal};
    String name[]={"Prepare For The Exams",
                    "Test Analysis",
                    "Personal Mentor"};
    MyCustomPagerAdapter myCustomPagerAdapter;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        viewPager = (ViewPager)findViewById(R.id.viewPager);
 
        myCustomPagerAdapter = new MyCustomPagerAdapter(com.saxena.learningapp.CourseDetails.this, images,name);
        viewPager.setAdapter(myCustomPagerAdapter);
    }
}