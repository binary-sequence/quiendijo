package mentha.games.quiendijo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class FrmMenu extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frmmenu);

		Button btnNuevaPartida = (Button) this
				.findViewById(R.id.btnNuevaPartida);
		btnNuevaPartida.setOnClickListener(new BtnNuevaPartida_Click(this));
	}
}