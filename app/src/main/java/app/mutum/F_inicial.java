package app.mutum;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class F_inicial extends Fragment implements View.OnClickListener, View.OnLongClickListener{

    public F_inicial() { }

    private ImageButton imbtInicial;
    public static final int CODIGO_SOLICITUD_RECONOCIMIENTO = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View initView = inflater.inflate(R.layout.layout_f_inicial, container, false);

        imbtInicial = (ImageButton) initView.findViewById(R.id.btnInit);



        return initView;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnInit:


        }

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}
