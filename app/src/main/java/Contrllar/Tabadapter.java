package Contrllar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Tabadapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragmentlist = new ArrayList<>();
    private final List<String> fragmentlisttitel = new ArrayList<>();
    public Tabadapter(@NonNull FragmentManager fm) {
        super(fm);
    }




    @NonNull
    @Override
    public Fragment getItem(int position) {
       return fragmentlist.get(position);
    }
    public void addFrafment(Fragment fragment,String title){
        fragmentlist.add(fragment);
        fragmentlisttitel.add(title);

    }



    @Override
    public int getCount() {
        return fragmentlist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentlisttitel.get(position);
    }
}
