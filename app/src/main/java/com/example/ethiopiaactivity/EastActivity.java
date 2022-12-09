package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class EastActivity extends AppCompatActivity {

    TextView textDescription;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east);

        ExtendedFloatingActionButton btnHarari = findViewById(R.id.btnHarari);
        ExtendedFloatingActionButton btnSomali = findViewById(R.id.btnSomali);
        textDescription = findViewById(R.id.textDescription);

        RelativeLayout relativeLayoutDescription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDescription.setVisibility(View.INVISIBLE);

        btnHarari.setOnClickListener(v -> {
           relativeLayoutDescription.setVisibility(View.VISIBLE);
           textDescription.setText("Harari: \n\n" +
                   "The Harari Region, officially the Harari People's National Regional State, is a regional state in eastern Ethiopia, " +
                   "covering the homeland of the Harari people. Formerly named Region 13, its capital is Harar, and the region covers the " +
                   "city and its immediate surroundings.\n\n" +
                   "Consisting of the walled city of Harar and its immediate environs, Harari is essentially a modern revival of the " +
                   "autonomous city-state of Harar, which was one of the most powerful regional political entities from the 16th until " +
                   "the late 19th century, when it was co-opted into Abyssinia by Menelik II. The state covers an area of roughly 350 " +
                   "square km and supports a population estimated at 215,000, of which some 131,000 are city dwellers. Roughly half of " +
                   "the population is Oromo, with the Amhara accounting for another 33% and the Harari only 7%. Despite Harar's reputation " +
                   "as the home of Islamic Ethiopia, roughly 40% of its population is Christian. The lush farmland around Harar is known " +
                   "for its chat and coffee plantations, but other major crops include sorghum, maize and oranges\n\n" +
                   "he Harari are the small remnants of a unique, pre-industrial urban culture that has existed since the 1500s. " +
                   "Until 1974, the Harari, lived exclusively inside the stone walls of Harar, an ancient Muslim city, where they " +
                   "specialized in trade. Over the centuries, Harar, which is located on a highland ridge between the Red Sea and " +
                   "the Ethiopian highlands, has been the dominant center of Islam for northeast Africa. Although recent political " +
                   "and economic changes have dispersed the Harari, they have continued trading in the region.\n\n" +
                   "The Harari are the only Ethiopians whose trade is based in a single, large urban center. Daily the Harari have " +
                   "contacts with four other competitive ethnic groups who frequent the markets of Harar. However, they have maintained " +
                   "their distinctive qualities. To help preserve their unique culture they limit the use of their native language, Adare, " +
                   "to their own people. They also strongly discourage marriage to non-Harari." +
                   "\n\n");
        });
        btnSomali.setOnClickListener(v -> {
            relativeLayoutDescription.setVisibility(View.VISIBLE);
            textDescription.setText("Somali: \n\n" +
                    "The Somali Region, also known as Soomaali Galbeed and officially the Somali Regional State, is a regional state in eastern " +
                    "Ethiopia. Its territory is the largest after Oromia Region.\n\n" +
                    "The Somali Regional State is the second largest Region of the country next to the Oromia Regional State. The Region shares " +
                    "borders with the Afar Region, Oromia Region and Dire Dawa to the West, Djibouti to the North, de facto state Somaliland " +
                    "to the North-East, Somalia from East to South, and Kenya to the South-West. The Region is predominantly inhabited by the " +
                    "Somali ethnic group, but it is ethnically heterogeneous. Moreover, the Somalis in Ethiopia have social and political links " +
                    "with other ethnic Somalis in the neighboring countries, as in Somali culture, clan links are the most important social and " +
                    "political unit of organization. According to the last official census conducted by the Federal Government of Ethiopia in 2007, " +
                    "the Somali ethnic group is the third-largest ethnic group in the country (FDRE Population Census Commission, 2008). By 2017 it " +
                    "is estimated that the population in the Somali Region is around 5.7 million (FDRE Central Statistical Agency, 2013 Population " +
                    "Projection of Ethiopia for All Regions At Wereda Level from 2014 – 2017). \n" +
                    "The capital city of the Somali Regional State is Jijiga. The Region is divided into nine Zones and 53 Kebeles. These nine " +
                    "Administrative Zones are Shinile, Jijiga, Degehabur, Warder, Korahe, Fik, Gode, Afder and Liben. However, since the establishment " +
                    "of ethnic federalism divisions in 1994, the Region disputes several borders with Afar and Oromia Regional States. With the " +
                    "Oromia Region, there were border disputes over 420 Kebeles (BBC, 2017), and to resolve these disputes, a referendum was held " +
                    "in 2004 with 80% of these Kebeles under the Oromia Regional State. However, the demarcation is not implemented in most areas. " +
                    "Thus, there are violent disputes at the borders of the two Regions.\n\n" +
                    "Similarly, the Somali Region has border disputes over three Kebeles located in Afar’s zones 1 and 3 and Somali’s Sitti Zone of " +
                    "Adaytu Kebele of Mille Woreda, Undufo Kebele of Gewane Woreda, and Gedamaytu Kebele of Amibara Woreda. The Issa clan, which " +
                    "inhabits these areas, wants to be part of the Somali Regional State of Ethiopia while the Afar Regional State considers the " +
                    "area as an integral part of the Afar Region. Even though an agreement between the two Regional States has been signed in " +
                    "recognizing the three Kebeles as special Kebeles within the Afar Regional boundary, the elders of the Issa Clan (Ugaz) oppose " +
                    "this agreement. Hence, the conflict is still ongoing." +
                    "\n\n");
        });
    }
}