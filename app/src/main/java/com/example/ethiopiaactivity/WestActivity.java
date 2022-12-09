package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class WestActivity extends AppCompatActivity {

    TextView textDescrption;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);

        ExtendedFloatingActionButton btnGumuz = findViewById(R.id.btnGumuz);
        ExtendedFloatingActionButton btnGambela = findViewById(R.id.btnGambela);
        textDescrption = findViewById(R.id.textDescription);

        RelativeLayout relativeLayoutDescription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDescription.setVisibility(View.INVISIBLE);

        btnGumuz.setOnClickListener(v -> {
            relativeLayoutDescription.setVisibility(View.VISIBLE);
            textDescrption.setText("Benishangul-Gumuz: \n\n" +
                    "Benishangul-Gumuz is a regional state in northwestern Ethiopia to the border of Sudan. It was previously " +
                    "known as Region 6. The region's capital is Assosa.\n\n" +
                    "Benishangul Gumuz has an estimated area of 51,000 square kilometers and is located in the north-western part of Ethiopia. " +
                    "It shares common borders with the State of Amhara in the east, the Sudan in the north-east, and the State of Oromia " +
                    "in the south. It is divided into 3 administrative zones, 19 Weredas (two of them special Weredas), and 33 Kebeles " +
                    "(the smallest administrative units) [1].  Metekel is the largest zone with an area of 26,272 square kilometers followed " +
                    "by Assosa (14,166 sq. km), and Kamashi (8,850 sq. km)\n\n" +
                    "Benishangul Gumuz has an estimated area of 51,000 square kilometers and is located in the north-western part of Ethiopia. " +
                    "It shares common borders with the State of Amhara in the east, the Sudan in the north-east, and the State of Oromia in the south. " +
                    "It is divided into 3 administrative zones, 19 Weredas (two of them special Weredas), and 33 Kebeles (the smallest administrative units).  " +
                    "Metekel is the largest zone with an area of 26,272 square kilometers followed by Assosa (14,166 sq. km), and Kamashi (8,850 sq. km) [2].\n" +
                    "\n" +
                    "The state has diverse topography and climate. The later includes the familiar traditional zones - \"kola\", \"dega\", and \"woyna dega\". " +
                    "\"About 75% of the State is classified as \"kola\" (law lands) which is below 1500 meters above sea level. The altitude ranges form 550 to " +
                    "2,500 meters above sea level. The average annual temperature reaches from 20-250C. During the hottest months (January - May) it reaches a " +
                    "28 - 340C. The annual minimum and maximum mean temperature registered at Asosa for the last 26 years is 12.40C and 27.80C respectively. " +
                    "The annual rainfall amount ranges from 500-1800mm. ..... The rainy season spreads through May to October.\" [1]. Altitudinally, the region " +
                    "ranges from 600 mete in areas bordering the Sudan to over 2500 meters. The state also has two major river basins, Abay and Akobo with smaller " +
                    "basins such as Dabus, Yabus, Dura, Julia, and Beles with significant potential for irrigation agriculture and hydro electric power generation. Its natural resources include precious minerals such as gold and copper." +
                    "Population Distribution\n\n" +
                    "The mid-2008 CSA estimate puts the population size for Benishangul-Gumuz at 656,000, ninety percent of whom live in rural areas, indicating " +
                    "the very low level of urbanization.  The percentage of urban population in the three Weredas - Metekel. Asosa, and Kamashi - is eleven, nine " +
                    "and zero percent. respectively. The regional state has a slightly masculine population (sex ratio 101.2).  The urban-rural breakdown is as follows:\n" +
                    "The table below shows the July 2008 population of Benishangul-Gumuz by Wereda. Asosa is the only Wereda with a population of over a 100,000. " +
                    "Three weredas, Wenbera, Dibate, and Pawe have populations between 50,000 and 60,000. Yaso is the least populated with just over 10,000 people, " +
                    "and has the lowest density..  \n\n" +
                    "Most of Benishangul Gumuz is sparsely populated. The table below ranks Weredas in Benishangul-Gumuz by their density in mid-2008 (population " +
                    "per square kilometer). Pawi Special Wereda tops the list with 92.3 persons per square kilometers.   Six Weredas have single-digit densities " +
                    "with another three in the 10 - 20 persons/sq. km. category. \n\n" +
                    "Socioeconomic  Characteristics\n" +
                    "Agriculture is the mainstay of this regional State. A wereda level online report [3] states that in Menge Wereda, \"...96% of the population " +
                    "are dependent on agriculture, and traditional gold mining is also an important activity\".  The report adds that in this Wereda and many others " +
                    "the population faces enormous challenges in accessing necessary social services including education and health care: \"2006 figures show that " +
                    "Menge had 17 schools, including just one secondary school, and only eight health service institutions (one health centre, one clinic and six health " +
                    "posts). 50% of the urban population has access to potable water supplies, but the figure is only 38% in rural areas where the great majority " +
                    "of the population live.\" The report also covered Kurmuk Wereda (see map below) which is  \".... situated in the far western side of the region. " +
                    "The Centre of the woreda at Kutaworke/Horazab is 89 km from Assosa. Like Menge the woreda is mainly lowland, and it covers a similar area of " +
                    "just over 1400km2, divided into 16 kebeles. However its population is less than half that of Menge, at around 21,000 people (2006 estimate), " +
                    "of which most are Berta. Kurmuk is linked with Assosa by a main road. This road is an important route between Ethiopia and Sudan, and there are " +
                    "plans to surface it with asphalt. As in Menge, agriculture is the major economic activity followed by traditional gold mining.\" " +
                    "\n\n");
        });
        btnGambela.setOnClickListener(v -> {
            relativeLayoutDescription.setVisibility(View.VISIBLE);
            textDescrption.setText("Gambela: \n\n" +
                    "The Gambela Region, officially the Gambela Peoples' Region, is a regional state in western Ethiopia, bordering South Sudan. " +
                    "Previously known as Region 12, its capital is Gambela. The Region is situated between the Baro and Akobo Rivers, with its western " +
                    "part including the Baro River.\n\n" +
                    "Gambella National Regional State is one of the 11 administrative regions. It is located in the south-western part of Ethiopia " +
                    "and borders two other regions -    Oromiya  to the North and east and the Southern Nations, Nationalities and Peoples’ Regional " +
                    "State (SNNPRS) to the south - and the country of Sudan to the west. Most of Gambella is flat and its  climate is hot and humid. " +
                    "Annual rainfall averages about  600 mm while the minimum/ maximum temperatures are  are approximately 21.10C and 35.90C respectively.\n\n" +
                    "Ago-ecologically, the region is predominantly lowland (kolla) \"...with a few midlands (weynadega). Recession riverside agriculture " +
                    "is common, particularly maize and sorghum, and widely practiced by Anyuaa people along the Baro, Gilo and Akobo rivers. " +
                    "As the region is generally not cereal self-sufficient, alternative income sources such as fishing are important sources of food. " +
                    "Wild food consumption is part of the daily dietary intake given the still partly untouched bush land and natural forest resources.”\n\n" +
                    "The latest CSA estimate (July 2008) puts Gambella’s  population size at 259,000 a fifth of whom live in urban areas,  and despite " +
                    "its relatively small area size  the region is quite diverse, ethnically [3].  The major ethnic groups include  the Nuer  (40%),  " +
                    "Agnuak (27%), Amhara (8%), Oromo (6%), Mezhenger (5.8%), Keffa (4.1%), Mocha (2%), Tigraway ( 1.6%) and other ethnic groups " +
                    "predominantly from Southern Ethiopia  (5.5%).\n\n" +
                    "Gambella zone was divided into nine Weredas until recently: Akobo, Jikawo, Itang, Gambella, Abobo, Jor, Gog, Dimma and Godere. " +
                    "“However, administrative redistricting occurred in 2004-2005” [2]. The new administrative setup consists of six weredas and one " +
                    "“special” Wereda administered  by the Federal government: Alwero-Peno, Gilo, Jikawo, Akobo, Dimma, Godere and Gambella (special). " +
                    "“The Gambella region today has three Anuak Woredas (Alwero-Peno, Dimma and Gilo); two Nuer Woredas (Jikawo and Akobo); and one " +
                    "Majenger Woreda (Godere).”" +
                    "\n\n");
        });
    }
}