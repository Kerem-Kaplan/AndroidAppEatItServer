package dev.krm.androidappeatitserver.ViewHolder;

import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dev.krm.androidappeatitserver.Interface.ItemClickListener;
import dev.krm.androidappeatitserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit,btnRemove,btnDirection,btnDetail;



    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        txtOrderAddress = (TextView) itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView) itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView) itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView) itemView.findViewById(R.id.order_phone);

        btnEdit=(Button)itemView.findViewById(R.id.btnEdit);
        btnDetail=(Button)itemView.findViewById(R.id.btnDetail);
        btnDirection=(Button)itemView.findViewById(R.id.btnDirection);
        btnRemove=(Button)itemView.findViewById(R.id.btnRemove);


    }


}
