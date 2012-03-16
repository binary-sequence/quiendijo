package mentha.games.quiendijo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class TabAutores extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabautores);

		ListView lvAutores = getListView();
		lvAutores.setOnItemClickListener(new LvAutores_Click(this));
	}
}
