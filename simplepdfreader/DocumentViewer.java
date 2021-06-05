package io.swalitk.github.simplepdfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class DocumentViewer extends AppCompatActivity {

    private String filepath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_viewer);

        Intent intent=getIntent();
        filepath=intent.getStringExtra("path");
        File file=new File(filepath);
        Uri fileuri=Uri.fromFile(file);
        PDFView pdfView=findViewById(R.id.pdfviewer);
        pdfView.fromUri(fileuri).load();
    }
}