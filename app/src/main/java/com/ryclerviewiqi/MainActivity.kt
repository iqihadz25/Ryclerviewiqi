package com.ryclerviewiqi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<basket>(
                basket(
                        R.drawable.gsw,
                        "Golden State Warriors",
                        "Golden State Warriors adalah sebuah tim bola basket profesional Amerika Serikat yang bermarkas di San Francisco, California. Warriors berkompetisi di National Basketball Association (NBA), sebagai anggota Wilayah Barat, Divisi Pasifik. Didirikan pada tahun 1946 di Philadelphia, Warriors pindah ke Wilayah Teluk San Francisco pada tahun 1962 dan menggunakan nama kota tersebut, sebelum mengubah nama geografisnya menjadi Golden State pada tahun 1971.[b] Warriors memainkan pertandingan kandang mereka di Chase Center."
                ),
                basket(
                        R.drawable.suns,
                        "Phoenix Suns",
                        "Phoenix Suns adalah tim bola basket Amerika yang tergabung dalam National Basketball Association.[8] Tim ini berbasis di Phoenix, Arizona.[8] Tim ini didirikan pada tahun 1968 dengan biaya ekspansi dua juta dolar AS.[9] Nama Phoenix Suns keluar sebagai pemenang dalam proses pemilihan nama dan mengalahkan beberapa pilihan nama lainnya, seperti Scorpions, Rattlers, Thunderbirds, Wranglers, Mavericks, Mustangs, dan Cougars."
                ),
                basket(
                        R.drawable.bkn,
                        "Brooklyn Nets",
                        "Brooklyn Nets adalah sebuah tim basket profesional Amerika Serikat yang bermarkas di borough Kota New York, Brooklyn. Nets berkompetisi dalam National Basketball Association (NBA) sebagai anggota Divisi Atlantik, Wilayah Timur. Nets memainkan pertandingan kandang mereka di Barclays Center. Mereka adalah salah satu dari dua tim NBA yang bermarkas di Kota New York; yang satunya adalah New York Knicks. Tim ini didirikan pada tahun 1967 sebagai tim carter dari liga saingan NBA, American Basketball Association (ABA)."
                ),


                basket(
                        R.drawable.bucks,
                        "Milwaukee Bucks",
                        "Bucks berkompetisi di National Basketball Association (NBA) sebagai anggota Wilayah Timur, Divisi Tengah. Bucks didirikan pada tahun 1968 sebagai tim baru, dan memainkan pertandingan kandang mereka di Fiserv Forum. Mantan Senator AS Herb Kohl adalah bekas pemilik tim ini, tetapi pada tanggal 16 April 2014, sebuah grup yang dipimpin oleh para manajer milyuner pengelola investasi global seperti Wes Edens dan Marc Lasry setuju untuk membeli kepemilikan mayoritas tim ini dari Kohl."
                ),
                basket(
                        R.drawable.lal,
                        "Los Angeles Lakers",
                        "Los Angeles Lakers adalah sebuah tim basket profesional Amerika Serikat yang bermarkas di Los Angeles. Lakers berkompetisi di National Basketball Association (NBA), sebagai anggota Wilayah Barat, Divisi Pasifik. Lakers memainkan pertandingan kandang mereka di Staples Center, sebuah arena yang juga digunakan oleh klub NBA lain yaitu Los Angeles Clippers, Los Angeles Sparks dari Women's National Basketball Association, dan Los Angeles Kings dari National Hockey League.[9] Lakers adalah salah satu tim tersukses dalam sejarah NBA, dan telah memenangkan 17 gelar liga—jumlah terbanyak bersama dengan Boston Celtics."
                ),
                basket(
                        R.drawable.boston,
                        "Boston Celtic",
                        "Boston Celtics adalah sebuah tim basket profesional Amerika Serikat yang bermarkas di Boston, Massachusetts. Celtics berkompetisi di National Basketball Association (NBA) sebagai anggota dari Wilayah Timur, Divisi Atlantik. Didirikan pada tahun 1946 sebagai salah satu dari delapan tim asli NBA, Celtics memainkan pertandingan kandang mereka di TD Garden, arena yang juga ditempati oleh Boston Bruins dari National Hockey League (NHL). Celtics dianggap sebagai tim basket tersukses dalam sejarah NBA. Mereka telah memenangkan gelar juara sebanyak 17 kali, atau sekitar 23,9 persen dari seluruh gelar sejak NBA didirikan."
                )


        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_mobil)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


        }
    }
}