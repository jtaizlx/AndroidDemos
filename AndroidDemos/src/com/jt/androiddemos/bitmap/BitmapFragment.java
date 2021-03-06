package com.jt.androiddemos.bitmap;

import com.jt.androiddemos.MainActivity;
import com.jt.androiddemos.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BitmapFragment extends Fragment implements View.OnClickListener {


	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static BitmapFragment newInstance(int sectionNumber) {
		BitmapFragment fragment = new BitmapFragment();
		Bundle args = new Bundle();
		args.putInt(MainActivity.ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}

	public BitmapFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.content_observer, container,
				false);
		return rootView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		((MainActivity) activity).onSectionAttached(getArguments().getInt(
				MainActivity.ARG_SECTION_NUMBER));
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

}
