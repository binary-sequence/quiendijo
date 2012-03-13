package mentha.games.quiendijo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class FrmJuego extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frmjuego);

		Button[] btnRespuesta = new Button[4];
		btnRespuesta[0] = (Button) this.findViewById(R.id.btnRespuesta1);
		btnRespuesta[1] = (Button) this.findViewById(R.id.btnRespuesta2);
		btnRespuesta[2] = (Button) this.findViewById(R.id.btnRespuesta3);
		btnRespuesta[3] = (Button) this.findViewById(R.id.btnRespuesta4);
		for (int i = 0; i < 4; i++) {
			btnRespuesta[i].setOnClickListener(new BtnRespuesta_Click(this));
		}
	}
}
