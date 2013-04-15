package gws.grottworkshop.gwssanfran;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import gws.grottworkshop.gwsholmeswatson.GWSActivity;

public class PaginatedGalleryActivity extends GWSActivity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        
		
		List<String> list = new ArrayList<String>();
		list.add("https://lh5.googleusercontent.com/-uY2FkZQYK_g/UWbL-STGVkI/AAAAAAAABD4/HYAFq5vMyIE/s975/Moonrise_Over_San_Francisco.jpg");
		
     
		for ( int i = 0 ; i < 10 ; i ++ ) {
			list.add("http://www.gravatar.com/avatar/fc63e1912648ed92e560144b1152dc61?s=128&d=identicon&r=PG");
		}
		
		
		PaginatedGalleryAdapter adapter = new PaginatedGalleryAdapter(this, list, 4, getResources().getDrawable(R.drawable.ic_launcher));
        

		PaginatedGallery gallery = (PaginatedGallery) findViewById(R.id.paginatedGallery);
        gallery.setAdapter(adapter);

        
        
        
    }

}
