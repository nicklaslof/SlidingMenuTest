package st.rhapsody.st.slidningmenutest;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MenuAdapter extends AbstractArrayAdapter<String> {

	public MenuAdapter(Context context, int layoutResourceId, String[] data) {
		super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
	}

	public static class MenuHolder extends Holder {
		TextView txtTitle;
	}

	@Override
	public st.rhapsody.st.slidningmenutest.AbstractArrayAdapter.Holder createHolder(
			View row) {
		MenuHolder holder = new MenuHolder();
		holder.txtTitle = (TextView) row.findViewById(R.id.menuitem);
		return holder;
	}

	@Override
	public OnClickListener createOnClickListener(String t) {
		return new OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		};
	}

	@Override
	public boolean isClickable() {
		return true;
	}

	@Override
	public void setDataOnHolder(Holder holder, String t) {
		MenuHolder ph = (MenuHolder) holder;
        ph.txtTitle.setText(t);
	}

}
