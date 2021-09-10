package com.example.viewpager_tab_unit3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderFragmentB extends RecyclerView.ViewHolder {
    private TextView tv;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    public ViewHolderFragmentB(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        tv = itemView.findViewById(R.id.textView);
        tv1 = itemView.findViewById(R.id.textView2);
        tv2 = itemView.findViewById(R.id.textView3);
        tv3 = itemView.findViewById(R.id.textView4);
        tv4 = itemView.findViewById(R.id.textView5);
        tv5 = itemView.findViewById(R.id.textView6);
        tv6 = itemView.findViewById(R.id.textView7);

    }
    public void setData(ModelClass modelClass ){
        tv.setText(modelClass.getName());
        tv1.setText(modelClass.getName1());
        tv2.setText(modelClass.getName2());
        tv3.setText(modelClass.getName3());
        tv4.setText(modelClass.getName4());
        tv5.setText(modelClass.getName5());
        tv6.setText(modelClass.getName6());
    }
}
