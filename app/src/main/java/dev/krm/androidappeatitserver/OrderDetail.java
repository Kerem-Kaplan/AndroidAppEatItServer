package dev.krm.androidappeatitserver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import dev.krm.androidappeatitserver.Common.Common;
import dev.krm.androidappeatitserver.ViewHolder.OrderDetailAdapter;

public class OrderDetail extends AppCompatActivity {

    TextView orderId, orderPhone, orderAddress, orderTotal, orderComment;
    String orderIdValue = "";
    RecyclerView listFoods;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        orderId = (TextView) findViewById(R.id.order_id);
        orderPhone = (TextView) findViewById(R.id.order_phone);
        orderAddress = (TextView) findViewById(R.id.order_address);
        orderTotal = (TextView) findViewById(R.id.order_total);
        orderComment = (TextView) findViewById(R.id.order_comment);

        listFoods = (RecyclerView) findViewById(R.id.listFoods);
        listFoods.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        listFoods.setLayoutManager(layoutManager);


        if (getIntent() != null)
            orderIdValue = getIntent().getStringExtra("orderId");

        orderId.setText(orderIdValue);
        orderPhone.setText(Common.currentRequest.getPhone());
        orderTotal.setText(Common.currentRequest.getTotal());
        orderAddress.setText(Common.currentRequest.getAddress());
        orderComment.setText(Common.currentRequest.getComment());

        OrderDetailAdapter adapter = new OrderDetailAdapter(Common.currentRequest.getFoods());
        adapter.notifyDataSetChanged();
        listFoods.setAdapter(adapter);


    }
}