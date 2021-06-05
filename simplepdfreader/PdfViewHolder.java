package io.swalitk.github.simplepdfreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PdfViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;
    public CardView container;


    public PdfViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.pdf_text_view);
        container=itemView.findViewById(R.id.pdf_card);
    }
}
