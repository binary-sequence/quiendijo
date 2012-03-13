package mentha.games.quiendijo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class FrmUsuarios extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frmusuarios);

		Button btnNuevoNick = (Button) this.findViewById(R.id.btnNuevoNick);
		btnNuevoNick.setOnClickListener(new BtnNuevoNick_Click(this));

		ListView lvUsuarios = getListView();
		lvUsuarios.setOnItemClickListener(new LvUsuarios_Click(this));
	}
}
