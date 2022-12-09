package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class SouthActivity extends AppCompatActivity {

    TextView textDescrption;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_south);

        RelativeLayout relativeLayoutDescription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDescription.setVisibility(View.INVISIBLE);

        ExtendedFloatingActionButton btnOromia = findViewById(R.id.btnOromia);
        ExtendedFloatingActionButton btnSNNPR = findViewById(R.id.btnSNNPR);
        ExtendedFloatingActionButton btnSidama = findViewById(R.id.btnSidama);
        textDescrption = findViewById(R.id.textDescription);

        btnOromia.setOnClickListener(v -> {
            relativeLayoutDescription.setVisibility(View.VISIBLE);
            textDescrption.setText("Oromia: \n\n" +
                    "Oromia is the largest Region in Ethiopia. Stretching across Ethiopia from East to West, the Region consists of " +
                    "34% of the land in Ethiopia and is home to over 37 million people (FDRE Central Statistical Agency, 2013,Population " +
                    "Projection of Ethiopia for All Regions At Wereda Level from 2014 – 2017). It is divided into 20 administrative Zones, " +
                    "30 town administrations, 287 rural and 46 town Woredas. According to the last census, more than 65 ethnic groups and " +
                    "people from neighboring countries live in Oromia Region (FDRE Population Census Commission, 2008). The majority of the " +
                    "Oromia Region is inhabited by the Oromo ethnic group, followed by Amhara, Gurage, and Gedeo ethnic groups.\n\n" +
                    "Despite gains over the past decade, improving health outcomes for children and women is still a huge challenge. Since 2015, emergencies – " +
                    "intercommunal conflicts, droughts and disease outbreaks (measles, cholera and scabies) – have undermined health care. Although declining, \n\n" +
                    "child mortality remains high with 79 children under the age of 5 dying per 1,000 live births, mostly from preventable causes. Of particular " +
                    "concern is neonatal mortality which stands at 37 per 1,000 live births, falling only slightly between " +
                    "2005 and 2016. Part of the problem is that 56 per cent of women give birth without any assistance during delivery. Vaccination rates are " +
                    "particularly low in the region\n\n" +
                    "The projected total population of Oromia is about 33.69 million1 , over 85 per cent of which live in rural areas. Oromia is " +
                    "often referred to as the ‘bread-basket’ of the country as the majority of the population is engaged in agriculture with its crop \n" +
                    "production accounting for roughly 50 per cent of total national production. Coffee and khat (a mild stimulant) are the main cash " +
                    "crops produced in the Oromia region. In addition to agricultural production, people in pastoral and agro-pastoral \n" +
                    "areas rely on livestock and livestock products for their subsistence and as a source of income" +
                    "\n\n");

        });
        btnSNNPR.setOnClickListener(v -> {
            relativeLayoutDescription.setVisibility(View.VISIBLE);
            textDescrption.setText("SNNPER:\n\n" +
                    "The Southern Nations, Nationalities, and Peoples' Region is a regional state in southwestern Ethiopia. It was formed from the merger " +
                    "of five kililoch, called Regions 7 to 11, following the regional council elections on 21 June 1992. Its government is based in Hawassa.\n\n" +
                    "Ethiopia’s Southern Nations, Nationalities and Peoples Region (SNNPR) is the most diverse in the country, containing dozens of ethnicities " +
                    "and language groups. This generates a unique political dynamic that, while reflective of larger nationalistic trends, tend to remain more " +
                    "localized and does not spread across the region as conflicts in the more ethno-homogeneous regions of the country do. \n" +
                    "\n" +
                    "The SNNPR is bordered by Kenya to the south, South Sudan to the west, the Gambela regional to the northwest, the Oromia Region " +
                    "to the north and east, and the Sidama Region to the east. By 2017, the region’s population was estimated to be around 19.1 " +
                    "million (FDRE Central Statistical Agency, 2013, Population Projection of Ethiopia for All Regions At Wereda Level from 2014 – 2017). " +
                    "According to the region’s administration, 56 ethnic groups are considered indigenous (Beza Dessalegn & Nigussie Afesha, January 2019). " +
                    "As per the last official census conducted by the government in 2007, Sidama ethnic group is the majority, followed by Wolayta, " +
                    "Gurage, and Gamo (FDRE Population Census Commission, 2008, pp.98-100). Since the Sidama ethnic group established its own regional " +
                    "tate in November 2019, the Wolayta ethnic group is the likely majority.\n" +
                    "\n\n" +
                    "SNNPR is divided into 14 ethnic-based Zones and four Special Woredas, which are accountable to the Regional Council, and within 131 " +
                    "woredas, and 3,926 kebeles. However, since the implementation of ethnic federalism, different ethnic groups of SNNPR want to establish " +
                    "their own regional state (e.g., Sidama and Wolayta), special woreda (e.g., Ale ethnic group), or zone (e.g, Konso, Silte, Gamo-Gofa).\n" +
                    "\n\n" +
                    "Since 2018, several of these requests are being addressed:  for instance, Ale ethnic group received the status of Special woreda, " +
                    "Konso and Silte became a zone, and the Gamo-Gofa zone split into two and became Gamo zone and Gofa zone. Moreover, several ethnic " +
                    "groups like Sidama, Kefa, Wolayita, Hadiaya, and Gurage pressed to secede from the SNNPR and establish their own regional states " +
                    "(Beza Dessalegn & Nigussie Afesha, January 2019). Among these groups, only Sidama’s request was accepted by the Regional Council. " +
                    "Based on the referendum held on 20 November 2019, Sidama became the 10th Regional State of Ethiopia. This created the possibility " +
                    "of other ethnic groups being granted their request. However, the Regional Council has not responded to the rest of these requests " +
                    "and wants to save the SNNPR from disintegrating into multiple regions. The discontent over the lack of decision is being expressed " +
                    "through violent demonstrations.\n" +
                    "\n" +
                    "\n\n");

        });
        btnSidama.setOnClickListener(v -> {
            relativeLayoutDescription.setVisibility(View.VISIBLE);
            textDescrption.setText("SNNPR: \n\n" +
                    "The Sidama Region is a regional state in southern Ethiopia. It was formed on 18 June 2020 from the Southern Nations, " +
                    "Nationalities, and Peoples' Region and transformation of the Sidama Zone after a Sidama Zone, situated approximately 275 km " +
                    "south of Addis Ababa, is one of the zones in SNNP Region. It is one of the highly populated areas in Ethiopia, having a total " +
                    "population of about 2.5 million people residing on 721,00 hectare of land. Sidama is characterized by three agroecological " +
                    "ones: the dry midlands/lowlands (20%), the midlands (48%) and the highlands (32%). For administrative purposes Sidama zone is " +
                    "divided into 10 woredas.\n" +
                    "\n" +
                    "Sidama is known for its diverse, intensive and well-established traditional agroforestry systems in which a diversity of " +
                    "perennial and annual crops is grown together. This system of production largely contributed and helped to keep the environment " +
                    "conserved and sustainable, mainly in the highlands and midlands. In the lowlands, however, soil erosion is an important " +
                    "production constraint due to less intensive agricultural diversification.\n" +
                    "\n" +
                    "In Sidama Zone mixed agriculture (crop and livestock production) is practiced. Major crops grown include: enset, coffee, maize, " +
                    "wheat, teff, barley, haricot bean and khat. Enset is the main staple crop both in highlands and midlands while maize is so in the " +
                    "lowlands. Despite its poor performance in the lowlands, still farmers grow enset more for cultural and traditional purposes than " +
                    "for food. In the 1999 drought both enset and coffee where destroyed not only from the severity of the drought but also enset was " +
                    "the only crop to rely on and also use the leaves as feed to livestock to tackle feed shortage faced in the same year. The devastation " +
                    "on enset was so severe and enset planted since then are not yet ready to be used as the crop needs over 5 years to mature and be " +
                    "used for consumption." +
                    "\n\n");
        });

    }
}