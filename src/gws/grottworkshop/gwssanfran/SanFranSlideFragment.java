package gws.grottworkshop.gwssanfran;





import com.actionbarsherlock.app.SherlockFragment;

import uk.co.senab.bitmapcache.CacheableImageView;



import android.os.Bundle;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// TODO: Auto-generated Javadoc
/**
 * The Class SanFranSlideFragment.
 */
public class SanFranSlideFragment extends SherlockFragment {
	
	/** The image resource id. */
	int imageResourceId;

	/**
	 * Instantiates a new san fran slide fragment.
	 *
	 * @param i the i
	 */
	public SanFranSlideFragment(int i) {
		imageResourceId = i;
	}
	
	/**
	 * On create view.
	 *
	 * @param inflater the inflater
	 * @param container the container
	 * @param savedInstanceState the saved instance state
	 * @return the view
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
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
