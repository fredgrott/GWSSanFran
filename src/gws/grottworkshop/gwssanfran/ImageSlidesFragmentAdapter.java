package gws.grottworkshop.gwssanfran;

import com.viewpagerindicator.IconPagerAdapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;




// TODO: Auto-generated Javadoc
/**
 * The Class ImagesSliderFragmentAdapter.
 */
public class ImageSlidesFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter{

	public ImageSlidesFragmentAdapter(android.support.v4.app.FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	private int[] Images = new int[] { R.drawable.photo1, R.drawable.photo2,
            R.drawable.photo3, R.drawable.photo4

    };

    protected static final int[] ICONS = new int[] { R.drawable.marker,
            R.drawable.marker, R.drawable.marker, R.drawable.marker };

    private int mCount = Images.length;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return new ImageSlideFragment(Images[position]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public int getIconResId(int index) {
       return ICONS[index % ICONS.length];
    }
   public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }

}
