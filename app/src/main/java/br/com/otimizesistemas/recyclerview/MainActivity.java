package br.com.otimizesistemas.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Produto> mListProduto;
    public RecyclerView rvListagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListProduto = new ArrayList<>();
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));
        mListProduto.add(new Produto( "smartphone", 1800f));
        mListProduto.add(new Produto( "Tablet", 3600f));
        mListProduto.add(new Produto( "TV4K", 6000f));

        //instancia o recyclerview
         rvListagem = findViewById(R.id.rvListagem);
        rvListagem.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        rvListagem.setLayoutManager(layoutManager);

        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvListagem.addItemDecoration(itemDecoration);

        Adaptador adaptador = new Adaptador();
        rvListagem.setAdapter(adaptador);

        adaptador.atualizarListagemCompleta(mListProduto);

    }
}