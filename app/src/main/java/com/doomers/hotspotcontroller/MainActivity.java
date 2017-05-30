package com.doomers.hotspotcontroller;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.doomers.hotspotcontroller.wifihotspotutils.ClientScanResult;
import com.doomers.hotspotcontroller.wifihotspotutils.FinishScanListener;
import com.doomers.hotspotcontroller.wifihotspotutils.WifiApManager;
import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ConnectedDevices connectedDevices;
    WifiApManager wifiApManager;
    TextView ip_address,mac_address;
    ListView theListView;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiApManager = new WifiApManager(this);

        ip_address = (TextView) findViewById(R.id.ip_address);
        mac_address = (TextView) findViewById(R.id.mac_id);

        theListView = (ListView) findViewById(R.id.mainListView);
        context = this;


//        // prepare elements to display
//
//        // add custom btn handler to first list item
////        connectedDevices.get(0).setRequestBtnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                Toast.makeText(getApplicationContext(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
////            }
////        });
//
//        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)
//
//        // add default btn handler for each request btn on each item if custom handler not found
//        adapter.setDefaultRequestBtnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "DEFAULT HANDLER FOR ALL BUTTONS", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // set elements to adapter
//
//
//        // set on click event listener to list view
//        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
//                // toggle clicked cell state
//                ((FoldingCell) view).toggle(false);
//                // register in adapter that state for selected cell is toggled
//                adapter.registerToggle(pos);
//            }
//        });

       scan();
    }

    private void scan() {
        wifiApManager.getClientList(false, new FinishScanListener() {

            @Override
            public void onFinishScan(final ArrayList<ClientScanResult> clients) {


                for (ClientScanResult clientScanResult : clients) {
                    Toast.makeText(context,"Called",Toast.LENGTH_SHORT).show();
                    ip_address.setText(clientScanResult.getIpAddr());
                    mac_address.setText(clientScanResult.getHWAddr());

                }
                final FoldingCellListAdapter adapter = new FoldingCellListAdapter(context, clients);
                theListView.setAdapter(adapter);
                theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                        // toggle clicked cell state
                        ((FoldingCell) view).toggle(false);
                        // register in adapter that state for selected cell is toggled
                        adapter.registerToggle(pos);
                    }
                });
            }
        });
    }
}
