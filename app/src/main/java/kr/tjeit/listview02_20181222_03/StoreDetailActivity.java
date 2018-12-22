package kr.tjeit.listview02_20181222_03;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import kr.tjeit.listview02_20181222_03.datas.Store;

public class StoreDetailActivity extends BaseActivity {

    Store mStore;
    private android.widget.ImageView logoImg;
    private TextView tempTxt;
    private TextView nameTxt;
    private TextView addressTxt;
    private TextView openTimeTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_detail);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        mStore = (Store) getIntent().getSerializableExtra("storeData");

        nameTxt.setText(mStore.getName());
        addressTxt.setText(mStore.getAddress());
        openTimeTxt.setText(mStore.getOpenAndCloseTime());

    }

    @Override
    public void bindViews() {
        this.openTimeTxt = (TextView) findViewById(R.id.openTimeTxt);
        this.addressTxt = (TextView) findViewById(R.id.addressTxt);
        this.nameTxt = (TextView) findViewById(R.id.nameTxt);
        this.tempTxt = (TextView) findViewById(R.id.tempTxt);
        this.logoImg = (ImageView) findViewById(R.id.logoImg);
    }
}
