package gws.grottworkshop.gwssanfran;


import uk.co.senab.bitmapcache.CacheableImageView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;

@SuppressLint("ValidFragment")
public class ImageSlideFragment extends Fragment {

	int imageResourceId;

	public ImageSlideFragment(int i) {
		imageResourceId = i;
	}
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
	
	public ImageSlideFragment() {
		// TODO Auto-generated constructor stub
	}
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        CacheableImageView image = new CacheableImageView(getActivity());
        image.setImageResource(imageResourceId);

        LinearLayout layout = new LinearLayout(getActivity());
        layout.setLayoutParams(new LayoutParams());

        layout.setGravity(Gravity.CENTER);
        layout.addView(image);

        return layout;
    }
}
