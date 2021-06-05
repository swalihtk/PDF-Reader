package io.swalitk.github.simplepdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;

public class PdfAdapter extends RecyclerView.Adapter<PdfViewHolder> {

    private Context context;
    private ArrayList<File> pdfLists;
    PdfListener listener;

    PdfAdapter(Context context, ArrayList<File> file, PdfListener listener){
        this.context=context;
        this.pdfLists=file;
        this.listener=listener;
    }

    @Override
    public PdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PdfViewHolder(LayoutInflater.from(context).inflate(R.layout.pdf_recycle_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PdfViewHolder holder, int position) {
        holder.textView.setText(pdfLists.get(position).getName());
        holder.textView.setSelected(true);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.selectPdf(pdfLists.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pdfLists.size();
    }
}
