package gws.grottworkshop.gwssanfran;


import android.support.v4.app.FragmentPagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

// TODO: Auto-generated Javadoc
/**
 * The Class SanFranSlidesFragmentAdapter.
 */
public class SanFranSlidesFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {

	/**
	 * Instantiates a new san fran slides fragment adapter.
	 *
	 * @param fm the fm
	 */
	public SanFranSlidesFragmentAdapter(android.support.v4.app.FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	/** The Images. */
	private int[] Images = new int[] { R.drawable.sanfran_1, R.drawable.sanfran_2, R.drawable.sanfran_3, R.drawable.sanfran_4

    };

    /** The Constant ICONS. */
    protected static final int[] ICONS = new int[] { R.drawable.sanfran_icon_1, R.drawable.sanfran_icon_2, R.drawable.sanfran_icon_3, R.drawable.sanfran_icon_4 };

    /** The m count. */
    private int mCount = Images.length;
   

    /**
     * Gets the item.
     *
     * @param position the position
     * @return the item
     * @see android.support.v4.app.FragmentPagerAdapter#getItem(int)
     */
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return new SanFranSlideFragment(Images[position]);
    }

    /**
     * Gets the count.
     *
     * @return the count
     * @see android.support.v4.view.PagerAdapter#getCount()
     */
    @Override
    public int getCount() {
        return mCount;
    }

    /**
     * Gets the icon res id.
     *
     * @param index the index
     * @return the icon res id
     * @see com.viewpagerindicator.IconPagerAdapter#getIconResId(int)
     */
    @Override
    public int getIconResId(int index) {
       return ICONS[index % ICONS.length];
    }
   
   /**
    * Sets the count.
    *
    * @param count the new count
    */
   public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }


}
