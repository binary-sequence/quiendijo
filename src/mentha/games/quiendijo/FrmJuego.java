package mentha.games.quiendijo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FrmJuego extends Activity {
	private Frase frase;

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

		this.cargarFrase();

		Button btnSi = (Button) this.findViewById(R.id.btnSi);
		btnSi.setOnClickListener(new BtnContinuar_Click(this));

		Button btnNo = (Button) this.findViewById(R.id.btnNo);
		btnNo.setOnClickListener(new BtnCancelar_Click(this));
	}

	private void cargarFrase() {
		this.frase.cargarDatos();

		TextView tvFrase = (TextView) this.findViewById(R.id.tvFrase);
		tvFrase.setText(this.frase.obtenerFrase());

		Button[] btnRespuesta = new Button[4];
		btnRespuesta[0] = (Button) this.findViewById(R.id.btnRespuesta1);
		btnRespuesta[1] = (Button) this.findViewById(R.id.btnRespuesta2);
		btnRespuesta[2] = (Button) this.findViewById(R.id.btnRespuesta3);
		btnRespuesta[3] = (Button) this.findViewById(R.id.btnRespuesta4);
		for (int i = 0; i < 4; i++) {
			btnRespuesta[i].setText(this.frase.obtenerRespuesta(i));
		}
	}
}
