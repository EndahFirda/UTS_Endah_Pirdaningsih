package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    String get_Nama,get_Tanggal;
    TextView nama_Zodiac,isi_Zodiac,bulan_Zodiac,textView1,textView2;
    ImageView icon_Zodiac,bt_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        nama_Zodiac = findViewById(R.id.nama_Zodiak);
        isi_Zodiac = findViewById(R.id.isi_Zodiac);
        bulan_Zodiac = findViewById(R.id.bulan_Zodiac);
        icon_Zodiac = findViewById(R.id.icon_zodiac);
        bt_Back = findViewById(R.id.bt_Back);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent goback = new Intent(Result.this, MainActivity.class);
            startActivity(goback);
            }
        });

        Bundle b = getIntent().getExtras();
        get_Nama = b.getString("parse_nama");
        get_Tanggal = b.getString("parse_tanggal");

        String[] items1 = get_Tanggal.split("/");
        String date1=items1[0];
        String month=items1[1];
        String year=items1[2];

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 12) || (Integer.parseInt(date1)<=19 && Integer.parseInt(month) == 1)){
            icon_Zodiac.setImageResource(R.drawable.capricorn);
            nama_Zodiac.setText("Capricorn");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 21 Desember sampai 19 Januari berada di bawah pengaruh zodiak Capricorn, yang berlambang kambing");
            bulan_Zodiac.setText("Orang yang berzodiak Capricorn mengutamakan kesuksesan, status, posisi, reputasi, loyalitas, konsentrasi, " +
                                 "pemecahan masalah, bertanggung jawab, memperlihatkan kebijaksanaan, dan keseriusan belajar melalui pengalaman." +
                                 "Namun, ada kalanya orang berzodiak Capricorn cenderung bersikap memandang buruk (pesimis), selalu terpaksa, membebani," +
                                 " takut menghadapi hambatan, memperlihatkan batasan, kurang simpati, terlalu khawatir, dan pemikiran sempit.");
        }

        if ((Integer.parseInt(date1)>20 && Integer.parseInt(month) == 1) || (Integer.parseInt(date1)<=18 && Integer.parseInt(month) == 2)) {
            icon_Zodiac.setImageResource(R.drawable.aquarius);
            nama_Zodiac.setText("Aquarius");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 20 Januari sampai 18 Febuari berada di bawah pengaruh zodiak Aquarius, yang berlambang gelombang (alur air). ");
            bulan_Zodiac.setText("Orang Aquarius tertarik dengan petualangan, berjiwa kemanusiaan, ingin tahu, ada semangat berontak, bersikap spontan, progesif, persahabatan," +
                                 " hak asasi, kelompok, dan mampu memberi manfaat untuk sekitar. Namun, ada kalanya Aquarius menghadapi gangguan, tak bisa diharapkan, suka membantah," +
                                 " memberontak, tak lengkap, perilaku salah, tak kosisten, perangai radikal, kurang metode, dan mendatangkan bencana. ");
        }

        if ((Integer.parseInt(date1)>19 && Integer.parseInt(month) == 2) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 3)) {
            icon_Zodiac.setImageResource(R.drawable.pisces);
            nama_Zodiac.setText("Pisces");
            isi_Zodiac.setText("Orang yang lahir antara tanggal 19 Febuari sampai 20 Maret dikatakan bernaung di bawah zodiak Pisces, yang berlambang ikan. ");
            bulan_Zodiac.setText("Pisces mengutamakan cinta universal, bersifat manja, selalu mencari ilham, memperlihatkan kepercayaan, ada kesepahaman, berjiwa puitis, menyukai musik, beragama, bersifat setia, mampu menghibur diri, mengutamakan kerohanian, dan tidak mudah mengaku kalah. Namun, ada kalanya Pisces merasa bingung, bersalah, mudah mengaku kalah, mudah kecewa, khawatir, risau, terlibat dalam penipuan, ketagihan, dan mudah menurut kemauan hati. ");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 3) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 4)){
            icon_Zodiac.setImageResource(R.drawable.aries);
            nama_Zodiac.setText("Aries");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 21 Maret sampai 20 April dikatakan bernaung di bawah zodiak Aries, yang berlambang Biri-biri jantan.");
            bulan_Zodiac.setText("Aries seorang yang berani, yakin, inisiatif, mengutamakan tindakan, ada pertahanan diri, ada rasa merintis, ada daya juang, dan pencinta / memperjuangkan nasib. Namun, ada kalanya Aries ini terlalu pemikir, ada kekasaran, kesombongan diri, gemar memicu permusuhan, agresif, hasil kerja tak sempurna, dan ada kelemahan.");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 4) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 5)){
            icon_Zodiac.setImageResource(R.drawable.taurus);
            nama_Zodiac.setText("Taurus");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 21 April sampai 20 Mei dikatakan bernaung di bawah zodiak Taurus, yang berlambang Lembu Jantan. ");
            bulan_Zodiac.setText("Taurus mengutamakan kekayaan, ketinggian spiritual, kaut daya rasa, loyalitas, gemar berpelesiran, kesuburan, terlalu praktis, murah rezeki dan ketabahan. Walau bagaimana pun, ada kalanya Taurus bersikap terlalu kebendaan, terlalu mengekang, keras hati, suka menurut rasa hati dan buntu pikiran. ");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 5) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 6)){
            icon_Zodiac.setImageResource(R.drawable.gemini);
            nama_Zodiac.setText("Gemini");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 21 Mei sampai 20 Juni dikatakan bernaung di bawah zodiak Gemini, yang berlambang Saudara Kembar. ");
            bulan_Zodiac.setText("Gemini terampil berkomunikasi, suka bepergian, serbaguna, cerdas, ada kekuatan berbicara, mampu menulis, kedekatan pada sanak saudara dan tetangga, gemar migrasi, dan bersikap terbuka. Namun, ada kalanya Gemini bersikap hanya suka sekejap saja, bersikap keanak-anakan, gugup, suka bermuka dua, berbicara kosong, tak lengkap dan suka berpura-pura.");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 6) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 7)) {
            icon_Zodiac.setImageResource(R.drawable.cancer);
            nama_Zodiac.setText("Cancer");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 21 Juni sampai 20 Juli dikatakan bernaung di bawah zodiak Cancer, yang berlambang Kepiting. ");
            bulan_Zodiac.setText("Cancer menyukai rumah tangga, keluarga, kesehatan, makanan, ada rasa simpati, memberi perlindungan, agak sensitif, punya kesabaran, kejujuran, dan kecerdasan. Namun, ada kalanya Cancer bersikap kekanak-kanakan, berbolak-balik, berpura-pura, tidak aman, terlalu bertahan dan takut pada perpisahan. ");
        }

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 7) || (Integer.parseInt(date1)<=21 && Integer.parseInt(month) == 8)) {
            icon_Zodiac.setImageResource(R.drawable.leo);
            nama_Zodiac.setText("Leo");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 21 Juli sampai 21 Agustus dikatakan bernaung di bawah zodiak Leo, yang berlambang Singa. ");
            bulan_Zodiac.setText("Anda mengutamakan rasa cinta, ramah, bersifat pemurah, ada daya kepemimpinan, menonjolkan kemegahan, selalu hidup, menyoroti keagungan, keberanian, kemampuan, dekat dengan anak-anak, berbakat dan suka pada hiburan. Walau bagaimana pun, ada kalanya Leo ini kerap menunjukkan ego, banyak bicara, memperlihatkan sifat kekuasaan, suka pamer, mengejar kemewahan, dan memenuhi komplek rendah diri dan bangga diri.");
        }

        if ((Integer.parseInt(date1)>22 && Integer.parseInt(month) == 8) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 9)) {
            icon_Zodiac.setImageResource(R.drawable.virgo);
            nama_Zodiac.setText("Virgo");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 22 Agustus hingga 22 September dikatakan bernaung di bawah zodiak Virgo, yang berlambang Seorang Gadis. ");
            bulan_Zodiac.setText("Virgo suka pada kerja, hasil kerja sempurna, punya pahlawan diri, suci, mengutamakan kesehatan, ada kesadaran, memberikan konsentrasi berdisiplin, praktis, siap melayani dan komprehensif. Namun, ada kalanya Virgo merasa khawatir, cerewet, berpandangan sempit, terlalu tertib, suka mengeluh, tidak mudah mengaku kalah, dan ada suka mengkritik. ");
        }

        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 9) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 10)) {
            icon_Zodiac.setImageResource(R.drawable.libra);
            nama_Zodiac.setText("Libra");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 23 September sampai 22 Oktober dikatakan bernaung di bawah zodiak Libra, yang berlambang Alat Penimbang (Dacin).");
            bulan_Zodiac.setText("Orang yang berzodiak Libra biasanya berciri-ciri harmonis, seimbang, menyukai pernikahan, mendapati perhubungan, mengutamakan kesetaraan, aliansi, diplomasi, berseni, suka membantu, selalu dalam keadaan ceria, dapat menjadi pasangan yang ideal dan menyukai keadilan. Namun, ada kalanya Libra bersikap bolak-balik, pura-pura, tidak jujur, tujuan kurang tegas, atau tindakan kurang seimbang. ");
        }

        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 10) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 11)) {
            icon_Zodiac.setImageResource(R.drawable.scorpio);
            nama_Zodiac.setText("Scorpio");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 23 Oktober sampai 22 November dikatakan bernaung di bawah zodiak Scorpio, yang berlambang kalajengking.");
            bulan_Zodiac.setText(" Scorpio memiliki kemewahan, kreatif, ada keinginan yang kuat, punya stamina, daya sensual yang tinggi dan ada bakat menyembuhkan. Walau bagaimana pun, ada kalanya Scorpio mudah menaruh rasa cemburu, suka menuntut bela, suka ‘membinasakan diri’, ekstrim, fanatik, tamak dan berdaya untuk menyerang.");
        }

        if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 11) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 12)) {
            icon_Zodiac.setImageResource(R.drawable.sagitarius);
            nama_Zodiac.setText("Sagitarius");
            isi_Zodiac.setText("Orang yang lahir pada tanggal antara 23 November sampai 20 Desember dikatakan bernaung di bawah zodiak Sagitarius, yang berlambang Pemanah.");
            bulan_Zodiac.setText("Sagitarius suka minat belajar, bersikap optimis, pemanjat, pemahaman diri, bercita-cita tinggi, memiliki hati nurani, berpegang pada agama, psikologi, suka pada kesenangan, bijaksana, selalu ada keberuntungan, gemar eksplorasi dan ada berbagai impian. Namun, ada kalanya Sagitarius berada dalam kelalaian, tidak mematuhi hukum, berada dalam kegelisahan, pembazir, terlalu menurut kehendak hati, tidak jujur dan tidak bertanggung jawab.");
        }

    }
}