package br.com.otimizesistemas.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.NossoViewHolder> {
    private List<Produto> mLisProduto;

    //define a view da lista atual

    @NonNull
    @Override
    public Adaptador.NossoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itens, parent, false);
        NossoViewHolder viewHolder = new NossoViewHolder(view);

        return viewHolder;
    }

    //coloca informações
    @Override
    public void onBindViewHolder(@NonNull Adaptador.NossoViewHolder holder, int position) {
        Produto produto = mLisProduto.get(position);

        holder.mTextViewDescricao.setText(produto.getDescricao());
        holder.mTextViewPreco.setText(String.format("R$ %.2f", produto.getPreco()));
        //holder.mImageView.setImageResource(produto.getImgRes());
    }

    //controla o controle de contagem
    @Override
    public int getItemCount() {
        if(mLisProduto == null) return 0;
        return mLisProduto.size();
    }

    public class NossoViewHolder extends RecyclerView.ViewHolder{
        TextView mTextViewDescricao, mTextViewPreco;
        public  NossoViewHolder(@NonNull View itemView){
            super(itemView);
            mTextViewDescricao = itemView.findViewById(R.id.txtDescricao);
            mTextViewPreco = itemView.findViewById(R.id.txtpreco);
        }

    }

    public void atualizarListagemCompleta(List<Produto> mLisProduto){
        this.mLisProduto = mLisProduto;
        notifyDataSetChanged();
    }

    public void inserirItemNaListagem(int position, List<Produto> mLisProduto){
        this.mLisProduto = mLisProduto;
        notifyItemInserted(position);

    }
    public void excluirItemListagem(int position){
        mLisProduto.remove(position);

        notifyItemRemoved(position);
    }
}
