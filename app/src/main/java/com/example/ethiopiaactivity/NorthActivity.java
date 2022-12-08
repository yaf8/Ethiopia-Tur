package com.example.ethiopiaactivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class NorthActivity extends AppCompatActivity {

    private ExtendedFloatingActionButton btnTigray, btnAfar, btnAmhara;
    TextView textDiscrption;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);

        RelativeLayout relativeLayoutDiscription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDiscription.setVisibility(View.INVISIBLE);


        btnTigray = findViewById(R.id.btnTigray);
        btnAfar = findViewById(R.id.btnAfar);
        btnAmhara = findViewById(R.id.btnAmhara);
        textDiscrption = findViewById(R.id.textDescription);

        btnTigray.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
            textDiscrption.setText(" Tigray : \n\n The Tigray Region, officially the Tigray National Regional State, is the northernmost " +
                    "regional state in Ethiopia. The Tigray Region is the homeland of the Tigrayan people. Formerly known as " +
                    "Region 1, its capital and largest city is Mekelle. \n\n" +
                    "Location : \n " +
                    "Today, Tigrayans number about 4.9 million and are concentrated in Tigray state (Ethiopia) and in Eritrea. The regions of" +
                    " Ethiopia and Eritrea where most Tigrayans live are high plateau, separated from the Red Sea by an escarpment (cliff-like ridge)" +
                    " and a desert. In good years, rainfall on the plateau is adequate for the plow agriculture engaged in by the majority of Tigray." +
                    " However, when rainfall is low, the region is subject to disastrous droughts.\n\n" +
                    "Language: \n" +
                    "Tigrinya, the language spoken by the Tigray, is from the Semitic family of languages, and is related to Arabic, Hebrew, and Aramaic." +
                    " To the north of the Tigrinya speakers live people who speak the closely related language known as Tigre. Amharic, the official language" +
                    " of Ethiopia, is so closely related to Tigrinya that most Tigray have little difficulty communicating in Amharic. Tigrinya, Amharic, and" +
                    " the ancient religious language Geez are written with the same alphabet. Many of the letters used in writing these languages are derived" +
                    " from ancient Greek.\n\n" +
                    "Most Tigray names have specific meanings. Generally, people refer to one another by their first names. If one wished to distinguish" +
                    " between several people with that name, one would add the person's father's name. Abraha , for example, becomes Abraha Gebre Giyorgis ," +
                    " meaning, Abraha is the child of Gebre Giyorgis. If a further distinction must be made, the grandfather's name could be added, for example," +
                    " Abraha-Gebre Giyorgis-Welede Mariyam. Men's and women's names follow the same rules, with the exception that new wives are often given" +
                    " new names by their mothers-in-law when they first go to live with the husband's family. This applies only to the first name; distinguishing" +
                    " names (father's, grandfather's, etc.) remain the same.\n\n");
        });
        btnAfar.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
            textDiscrption.setText("Afar: \n\n" +
                    "The Afar, also known as the Danakil, Adali and Odali, are a Cushitic-speaking ethnic group inhabiting the Horn of Africa." +
                    "They primarily live in the Afar Region of Ethiopia and in northern Djibouti, as well as the entire southern coast of Eritrea." +
                    "The Afar Region (/ˈɑːfɑːr/; Afar: Qafar Rakaakayak; Amharic: አፋር ክልል), formerly known as Region 2, is a regional state in " +
                    "northeastern Ethiopia and the homeland of the Afar people. Its capital is the planned city of Semera, which lies on the paved Awash–Assab " +
                    "highway.\n\n" +
                    "The Afar are nominally Muslim, but a minimal level of orthodoxy in practice is attained only in the coastal regions and in the sultanates. " +
                    "The nomads of the interior are lax, and, though they hold Islam in great esteem, their own practices are imbued with the earlier Cushitic religion.\n\n" +
                    "The Afar subsistence economy depends on livestock, especially goats, some camels, and, more rarely, cattle. There are some exceptions, such as fishermen " +
                    "in the coastal areas and agriculturalists in the Assau oasis. The Afar also mine and export salt.\n" +
                    "Proud, highly individualistic, and much feared by outsiders, they are organized in patrilineal kin groups. Cooperation in larger units such as a subtribe or " +
                    "tribe is induced only by warfare against other tribes or neighbouring peoples. Two distinct classes, the Asaimara (“Red Men”) and the Adoimara (“White Men”), " +
                    "constitute the landowning, titled nobles and the lower-class tenants, respectively.");

        });
        btnAmhara.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
            textDiscrption.setText("Amhara: \n\n" +
                    "The Amhara Region, officially the Amhara National Regional State, is a regional state in northern Ethiopia and the homeland of " +
                    "the Amhara people. Its capital is Bahir Dar which is the seat of the Regional Government of Amhara.\n Amhara, people of the Ethiopian " +
                    "central highlands. The Amhara are one of the two largest ethnolinguistic groups in Ethiopia (the other group being the Oromo). " +
                    "They constitute more than one-fourth of the country’s population. The Amharic language is an Afro-Asiatic language belonging to " +
                    "the Southwest Semitic group. It is related to Geʿez, the sacred literary language of the Ethiopian Orthodox church, an ancient " +
                    "religion that took root in the Aksum Empire in the 4th–5th century and affirmed a miaphysite doctrine. The Amhara, along with the Tigray " +
                    "peoples, are the principal adherents of this church.\n\n" +
                    "The Amhara long dominated the history of their country; Amharic was the official language of Ethiopia until the 1990s, and it remains important." +
                    " As descendants of a southward movement of ancient Semitic conquerors who mingled with indigenous Cushitic peoples, they inhabit much " +
                    "of the central and western parts of present-day Ethiopia. All except one of the country’s emperors from 1270 to 1974 were Amhara; " +
                    "this dominance created competitive quarrels between the Amhara and their northern neighbours, the Tigray, and other Ethiopian ethnic " +
                    "groups, such as the Oromo. Tensions rose between the Amhara and the Oromo during the period of socialist rule (1974–91), as the Oromo " +
                    "claimed an increasingly prominent role in the nation’s social and political affairs. After 1991 a measure of Amhara sentiment was " +
                    "directed against the Tigray, who had gained influence during the struggle against the Marxists.");

        });

    }
}