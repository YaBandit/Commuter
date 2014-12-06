package com.evolve_media.source.howlproper.app;

        import java.util.Locale;

        import android.app.FragmentBreadCrumbs;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentActivity;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;
        import android.support.v4.view.ViewPager;
        import android.text.SpannableString;
        import android.text.style.UnderlineSpan;
        import android.view.LayoutInflater;
        import android.view.Menu;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;

        import com.evolve_media.source.howlproper.app.AppMenu.MenuEventHandlers;

public class LandingPage extends FragmentActivity {
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_landingpage);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setCurrentItem(1);
        }

    void switchFragment(int target){
        mViewPager.setCurrentItem(target);
    }

    /**
     * A {@link android.support.v4.app.FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a DummySectionFragment (defined as a static inner class
            // below) with the page number as its lone argument.

            if(position == 0)
            {
                Fragment attendEventFragment = new AttendEventFragment();
                Bundle args = new Bundle();
                attendEventFragment.setArguments(args);
                return attendEventFragment;
            }
            else if(position == 1)
            {
                Fragment landingFragment = new LandingFragment();
                Bundle args = new Bundle();
                landingFragment.setArguments(args);
                return landingFragment;
            }
            else if(position == 2)
            {
                Fragment createEventFragment = new CreateEventFragment();
                Bundle args = new Bundle();
                createEventFragment.setArguments(args);
                return createEventFragment;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }

    public static class LandingFragment extends Fragment {
        public LandingFragment() {
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_landing, container, false);

            ImageButton imagebutton_attend = (ImageButton )rootView.findViewById(R.id.imagebutton_attend);
            imagebutton_attend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                ((LandingPage)getActivity()).switchFragment(0);
            }});

            ImageButton imagebutton_create = (ImageButton )rootView.findViewById(R.id.imagebutton_create);
            imagebutton_create.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                    ((LandingPage)getActivity()).switchFragment(2);
                }});

            return rootView;
        }
    }

    public static class AttendEventFragment extends Fragment {
        public AttendEventFragment() {
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_attendpage, container, false);

            return rootView;
        }
    }

    public static class CreateEventFragment extends Fragment {
        public CreateEventFragment() {
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_createpage, container, false);
            return rootView;
        }
    }
}
