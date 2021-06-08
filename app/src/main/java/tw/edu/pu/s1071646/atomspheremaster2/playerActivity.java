package tw.edu.pu.s1071646.atomspheremaster2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class playerActivity extends AppCompatActivity implements View.OnClickListener {

    int[] images = {R.drawable.hero1,R.drawable.hero2,R.drawable.hero3,R.drawable.hero4,R.drawable.hero5,
            R.drawable.hero6,R.drawable.hero7,R.drawable.hero8,R.drawable.hero9,R.drawable.hero10,
            R.drawable.hero11,R.drawable.hero12,R.drawable.hero13,R.drawable.hero14,R.drawable.hero15,R.drawable.hero16};

    String[] name = {"牙素","札克","悠咪","索娜","艾妮維亞","提摩","維迦",
            "史加納","貪啃奇","埃爾文","八德","辛吉德","薩柯","索拉卡","希格斯","雷玟"};
    //String[] title = {"疾風劍豪","生化魔人","",""}
    int[] ImagePos = {R.drawable.ad1,R.drawable.sup1,R.drawable.mid1,R.drawable.top1,R.drawable.jg1};
    int[] skill ={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,
            R.drawable.a7,R.drawable.a8,R.drawable.a9};
    ImageView imageHero1 ;
    ImageView imagePos;
    TextView textName;
    Button draw ;
    ImageView imageSkill;
    ImageView imageSkill2;
    ImageButton BtbB;
    int count;
    int pos;
    int skill1;
    int skill2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_acyivity);
        imageHero1 = findViewById(R.id.imageHero1);
        imagePos = findViewById(R.id.imagePos2);
        draw = findViewById(R.id.btnDraw);
        textName = findViewById(R.id.textName);
        imageSkill = findViewById(R.id.imageSkill);
        imageSkill2 = findViewById(R.id.imageSkill2);
        BtbB = findViewById(R.id.BtbB);

        count =  (int)Math.round(Math.random()*(images.length-1));
        pos = (int)Math.round(Math.random()*(ImagePos.length-1));
        skill1 = (int)Math.round(Math.random()*(skill.length-1));
        skill2 = (int)Math.round(Math.random()*(skill.length-1));
        while(skill1==skill2){
            skill2 = (int)Math.round(Math.random()*(skill.length-1));
        }
        //imageHero1.setImageResource(images[count]);
        imageHero1.setBackgroundResource(images[count]);
        imagePos.setImageResource(ImagePos[pos]);
        textName.setText(name[count]);
        imageSkill.setImageResource(skill[skill1]);
        imageSkill2.setImageResource(skill[skill2]);

        draw.setOnClickListener(this);
        BtbB.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDraw:
                count= (int)Math.round(Math.random()*(images.length-1));
                pos = (int)Math.round(Math.random()*(ImagePos.length-1));
                skill1 = (int)Math.round(Math.random()*(skill.length-1));
                skill2 = (int)Math.round(Math.random()*(skill.length-1));
                while(skill1==skill2){
                    skill2 = (int)Math.round(Math.random()*(skill.length-1));
                }
                //Log.d("Math.random()",Math.random()+"");
                //Log.d("images.length",images.length+"");
                //Log.d("AAA",(int)Math.round(Math.random()*(images.length))+"");
                //imageHero1.setImageDrawable(getResources().getDrawable(ImagePos[pos]));
                imageHero1.setBackgroundResource(images[count]);
                textName.setText(name[count]);
                imagePos.setImageResource(ImagePos[pos]);
                imageSkill.setImageResource(skill[skill1]);
                imageSkill2.setImageResource(skill[skill2]);
                break;
            case R.id.BtbB:
                Intent it = new Intent(playerActivity.this,MainActivity.class);
                startActivity(it);
                break;
        }
    }
}