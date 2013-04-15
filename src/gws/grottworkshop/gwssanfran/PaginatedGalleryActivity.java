package gws.grottworkshop.gwssanfran;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import gws.grottworkshop.gwsholmeswatson.GWSActivity;
import gws.grottworkshop.gwsholmeswatson.view.PaginatedGallery;
import gws.grottworkshop.gwsholmeswatson.view.PaginatedGalleryAdapter;

public class PaginatedGalleryActivity extends GWSActivity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        
		
		List<String> list = new ArrayList<String>();
		list.add("https://lh5.googleusercontent.com/-uY2FkZQYK_g/UWbL-STGVkI/AAAAAAAABD4/HYAFq5vMyIE/s975/Moonrise_Over_San_Francisco.jpg");
		list.add("https://lh4.googleusercontent.com/-pHrYouLID2I/UWbL1diJ0EI/AAAAAAAABDw/GMYLbaQARRI/s1097/san-francisco-bay-bridge-at-night.jpg");
		list.add("https://lh6.googleusercontent.com/-QUPpLjJktnc/UWbMJvXHdzI/AAAAAAAABEA/ZOJlX2aNtqU/s949/goldengatebridge.jpg");
		list.add("https://lh6.googleusercontent.com/-MixI01vK6mo/UWbMOVQB6pI/AAAAAAAABEI/0k_Jt7me0I8/s960/1680974-poster-1280-san-francisco-invents-the-tech-chamber-of-commerce.jpg");
		list.add("https://lh4.googleusercontent.com/-byp8S0Ny2KQ/UWbMUS73OTI/AAAAAAAABEQ/LnLzzpaXUss/s975/sanfrancisco.jpg");
		list.add("https://lh5.googleusercontent.com/-bZNSc-s8W7Y/UWbMXobhAuI/AAAAAAAABEY/BPmAAcY1qH4/s537/San+Francisco+Bridge.jpg");
		list.add("https://lh5.googleusercontent.com/-Z-PM5MYXYa4/UWbMdiILc-I/AAAAAAAABEg/A5bAMNCn1iU/s975/San-Francisco-2.jpg");
		
		
		
		PaginatedGalleryAdapter adapter = new PaginatedGalleryAdapter(this, list, 4, getResources().getDrawable(R.drawable.ic_launcher));
        

		PaginatedGallery gallery = (PaginatedGallery) findViewById(R.id.paginatedGallery);
        gallery.setAdapter(adapter);

        
        
        
    }

}
