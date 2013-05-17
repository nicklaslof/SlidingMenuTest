package st.rhapsody.st.slidningmenutest;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;

import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setBehindContentView(R.layout.menu_frame);
        
        MenuFragment menuFragment = new MenuFragment();
        

        
        getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.menu_frame, menuFragment)
		.commit();

        
        getSlidingMenu().setBehindWidth(300);
        
        getSlidingMenu().showMenu();

        
    }


    
}
