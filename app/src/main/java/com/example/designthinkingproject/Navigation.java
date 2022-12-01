package com.example.designthinkingproject;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends MyBaseActivity{

    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
//    private Frag3 frag3;
 //   private Frag4 frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_mac1);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_video:
                        setFrag(0);
                        break;
                    case R.id.nav_settings:
                        setFrag(1);
                        break;
                    case R.id.nav_dictionary:
                        setFrag(2);
                        break;
                    case R.id.nav_back:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        frag1=new Frag1();
        frag2=new Frag2();
 //       frag3=new Frag3();
 //       frag4=new Frag4();
        //setFrag(0); // 첫 프래그먼트 화면 지정
    }

    // 프레그먼트 교체
    private void setFrag(int n)
    {
        fm = getSupportFragmentManager();
        ft= fm.beginTransaction();
        switch (n)
        {
            case 0:
                ft.replace(R.id.Main_Frame,frag1);
                ft.commit();
                break;

            case 1:
                ft.replace(R.id.Main_Frame,frag2);
                ft.commit();
                break;

 //           case 2:
 //               ft.replace(R.id.Main_Frame,frag3);
 //               ft.commit();
 //               break;
  //          case 3:
  //              ft.replace(R.id.Main_Frame,frag4);
  //              ft.commit();
  //              break;


        }
    }
}
