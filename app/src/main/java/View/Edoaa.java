package View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.alqouran.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class Edoaa extends Fragment {
    PDFView pdfView;

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edoaa_fragment,container,false);
        pdfView= view.findViewById(R.id.pdf_d);
        pdfView.fromAsset("adkaar.pdf")
                .scrollHandle(new DefaultScrollHandle(getContext()))
                .spacing(0)
                .load();
        return view;
    }
}
