package View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.alqouran.MainActivity;
import com.example.alqouran.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class Equran extends Fragment{
    public PDFView pdf;
    private static final String TAG = Equran.class.getSimpleName();
    public static final String SAMPLE_FILE = "android_tutorial.pdf";
    Integer pageNumber = 0;
    String pdfFileName;

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.equran_fragment,container,false);
        pdf = view.findViewById(R.id.pdf_v);
        pdf.fromAsset("Noor_equran.pdf")
                .scrollHandle(new DefaultScrollHandle(getContext()))
                .spacing(0)
                .load();

        return view;

    }





}



