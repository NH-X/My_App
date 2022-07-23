package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<HashMap<String,Object>> list;
    int[] icon={R.drawable.collection,
            R.drawable.circle_of_friends,
            R.drawable.video_account,
            R.drawable.card_pack,
            R.drawable.expression,
            R.drawable.settings};
    String[] title={"服务","收藏","朋友圈","视频号","卡包","表情","设置"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lv);
        list= initDatas();

        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.item,new String[]{"img","name"},new int[]{R.id.image_icon, R.id.text_title});
        listView.setAdapter(adapter);

    }
    private ArrayList<HashMap<String,Object>> initDatas(){
        ArrayList<HashMap<String,Object>> tmplist=new ArrayList<>();

        for(int i=0;i<6;i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("img", icon[i]);
            map.put("name",title[i]);
            tmplist.add(map);
        }
        return tmplist;
    }
}
//
//    ListView iv;
//
//class Node{
//    int icon;
//    int prompt;
//
//    MainActivity.Node next;
//
//    public Node(int icon,int prompt){
//        this.icon=icon;
//        this.prompt=prompt;
//    }
//}
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        //    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        iv=findViewById(R.id.iv);
//
//        int[] icon={R.drawable.collection,
//                R.drawable.circle_of_friends,
//                R.drawable.video_account,
//                R.drawable.card_pack,
//                R.drawable.expression,
//                R.drawable.settings};
//        int[] prompt={R.string.collection,
//                R.string.circleOfFriends,
//                R.string.videoAccount,
//                R.string.cardPack,
//                R.string.expression,
//                R.string.settings};
//
//        MainActivity.Node head=new MainActivity.Node(R.drawable.server,R.string.serve);
//        head.next=null;
//        MainActivity.Node end=head;
//
//        for(int i=0;i<6;i++){
//            MainActivity.Node tmp=new MainActivity.Node(icon[i],prompt[i]);
//            tmp.next=null;
//            end.next=tmp;
//            end=end.next;
//        }
//    }