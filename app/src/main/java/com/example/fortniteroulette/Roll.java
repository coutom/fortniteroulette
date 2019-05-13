package com.example.fortniteroulette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class Roll extends AppCompatActivity {

    private boolean wepBoo = true;
    private boolean healBoo = true;
    private boolean dropBoo = true;
    private boolean trapBoo = true;
    private boolean buildBoo = true;
    private boolean specBoo = true;
    private String dNum;
    private String dLet;

    private TextView weaponText;
    private TextView healText;
    private TextView dropText;
    private TextView trapText;
    private TextView buildText;
    private TextView specText;

    ImageButton roll2;


    private String[] weaponList = new String[] {"Pistols Only", "No Pistols", "Sub Machine Guns Only", "No Sub Machine Guns", "Shotguns Only", "No Shotguns", "Assault Riffles Only",
            "No Assault Riffles", "Snipers Only", "No Snipers", "Splodes Only", "No Splodes", "Grenades Only", "No Grenades", "Uncommon Only", "No Uncommon", "Common Only", "No Uncommon",
            "Rare Only", "No Rare", "Epic Only", "No Epic", "Legendary Only", "No Legendary"};
    private String[] healingList = new String[] {"No Healing", "Med Kit Only", "No Med Kit", "Mini Shields Only", "No Mini Shields", "Big Shield Only", "No Big Shield", "Bandages Only",
            "No Bandages", "Chug Jug Only", "No Chug Jug"};
    private String[] dropzoneLetterList = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    private String[] dropzoneNumberList = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String[] trapList = new String[] {"Spike Traps Only", "No Spike Traps", "Campfire Only", "No Campfire", "Launchpad Only", "No Launchpad", "Turret Only", "No Turret"};
    private String[] buildingList = new String[] {"Walls Only", "No Walls", "Ramp Only", "No Ramp", "Floor Only", "No Floor", "Roof Only", "No Roof", "No Building", "No Edits", "Only Wood",
            "Only Brick", "Only Metal", "No Wood", "No Brick", "No Metal"};
    private String[] specialList = new String[] {"Lazy Boy! Last off the bus", "Secret service! Designate a team member to be the president (cannot carry any weapons/grenades/ammo), everyone else in the team must protect the president. When he dies, you lose.",
            "Trained Soldier! No aiming down sights", "Four Corners! All team members must land in different corners", "Lead Feet! No sprinting", "Trickshot Master! Must 360 before shooting",
            "Shy Guy! No entering named areas", "Disrespect! Must dance before shooting", "Lightweight! Only 3 inventory spots can be used"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll);

        weaponText = (TextView) findViewById(R.id.weapons_txt2);
        healText = (TextView) findViewById(R.id.healing_txt2);
        dropText = (TextView) findViewById(R.id.dropzone_txt2);
        trapText = (TextView) findViewById(R.id.traps_txt2);
        buildText = (TextView) findViewById(R.id.building_txt2);
        specText = (TextView) findViewById(R.id.special_txt2);
        roll2 = (ImageButton) findViewById(R.id.roll_btn2);

        roll2.setBackgroundResource(0);
        setValues();

        roll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValues();
            }
        });

    }

    public String getDropzone() {
        //gets a random letter and a random number concats them and returns the string

        Random random = new Random();
        int rand = random.nextInt(9);
        int rand2 = random.nextInt(9);
        dNum = dropzoneNumberList[rand];
        dLet = dropzoneLetterList[rand2];
        return dNum + dLet;
    }

    public void setValues() {
        if(wepBoo) {
            //pick random weapon text and show it
            Random random = new Random();
            String weapon = weaponList[random.nextInt(weaponList.length)];
            weaponText.setText(weaponText.getText() + " " + weapon);
        }

        if(healBoo) {
            //pick random healing text and show it
            Random random = new Random();
            String heal = healingList[random.nextInt(healingList.length)];
            healText.setText(healText.getText() + " " + heal);
        }

        if(dropBoo) {
            //pick random drop zone text and show it
            String drop = getDropzone();
            dropText.setText(healText.getText() + " " + drop);
        }

        if(trapBoo) {
            //pick a random trap text and show it
            Random random = new Random();
            String trap = trapList[random.nextInt(trapList.length)];
            trapText.setText(trapText.getText() + " " + trap);
        }

        if(buildBoo) {
            //pick a random building text and show it
            Random random = new Random();
            String build = buildingList[random.nextInt(buildingList.length)];
            buildText.setText(buildText.getText() + " " + build);
        }

        if(specBoo) {
            //pick a random special text and show it
            Random random = new Random();
            String spec = specialList[random.nextInt(specialList.length)];
            specText.setText(specText.getText() + " " + spec);
        }
    }

}
