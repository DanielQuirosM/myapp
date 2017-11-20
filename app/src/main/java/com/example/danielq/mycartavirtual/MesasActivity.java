package com.example.danielq.mycartavirtual;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MesasActivity extends AppCompatActivity {
    Button simpleDialogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesas);
        simpleDialogo = (Button) findViewById(R.id.btnMesa1);
        simpleDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MesasActivity.this);
                dialogo1.setTitle("Ventana de Reserva");
                dialogo1.setMessage("¿Reservar esta mesa?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        aceptar();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
                dialogo1.show();
            }
            public void aceptar() {
                finish();
            }
            public void cancelar() {
                finish();
            }
        });
        simpleDialogo = (Button) findViewById(R.id.btnMesa2);
        simpleDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MesasActivity.this);
                dialogo1.setTitle("Importante");
                dialogo1.setMessage("¿Reservar esta mesa?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        aceptar();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
                dialogo1.show();
            }
            public void aceptar() {
                finish();
            }
            public void cancelar() {
                finish();
            }
        });
        simpleDialogo = (Button) findViewById(R.id.btnMesa3);
        simpleDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MesasActivity.this);
                dialogo1.setTitle("Importante");
                dialogo1.setMessage("¿Reservar esta mesa?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        aceptar();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
                dialogo1.show();
            }
            public void aceptar() {
                finish();
            }
            public void cancelar() {
                finish();
            }
        });
        simpleDialogo = (Button) findViewById(R.id.btnMesa4);
        simpleDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MesasActivity.this);
                dialogo1.setTitle("Importante");
                dialogo1.setMessage("¿Reservar esta mesa?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        aceptar();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
                dialogo1.show();
            }
            public void aceptar() {
                finish();
            }
            public void cancelar() {
                finish();
            }
        });
        simpleDialogo = (Button) findViewById(R.id.btnMesa5);
        simpleDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MesasActivity.this);
                dialogo1.setTitle("Importante");
                dialogo1.setMessage("¿Reservar esta mesa?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        aceptar();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
                dialogo1.show();
            }
            public void aceptar() {
                finish();
            }
            public void cancelar() {
                finish();
            }
        });
    }
}
