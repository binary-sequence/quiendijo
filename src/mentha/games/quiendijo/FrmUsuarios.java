package mentha.games.quiendijo;

import mentha.games.quiendijo.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.Button;

public class FrmUsuarios extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frmusuarios);

		Button btnNuevoNick = (Button) this.findViewById(R.id.btnNuevoNick);
		btnNuevoNick.setOnClickListener(new BtnNuevoNick_Click(this));
	}
}
