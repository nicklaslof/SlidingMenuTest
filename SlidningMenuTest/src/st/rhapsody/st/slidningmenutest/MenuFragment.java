package st.rhapsody.st.slidningmenutest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockListFragment;

public class MenuFragment extends SherlockListFragment{
	
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		 MenuAdapter menuAdapter = new MenuAdapter(getActivity(), R.layout.menu_item, new String[]{"Startpage", "Go To", "Reload", "Search", "Settings"});
			
		 setListAdapter(menuAdapter);

		
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.menu_frame, null);
		
	}
	


}
