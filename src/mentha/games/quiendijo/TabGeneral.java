package mentha.games.quiendijo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class TabGeneral extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabgeneral);

		ListView lvGeneral = getListView();
		lvGeneral.setOnItemClickListener(new LvGeneral_Click(this));
	}
}
