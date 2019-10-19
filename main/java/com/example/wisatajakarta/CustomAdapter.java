package com.example.wisatajakarta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapter extends BaseAdapter {
    Context c;
    String[] nama={"Monumen Nasional","Kota Tua","Galeri Nasional Indonesia","Galeri Antara","Gelora Bung Karno Stadium","Ancol Dufan","Ancol Seaworld","Grand Indonesia","Bundaran HI","Perpustakaan Nasional"};
    String[] alamat={"Gambir, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","Mangga Besar, Taman Sari, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta","Jl. Medan Merdeka Tim. No.14, RW.1, Gambir, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","Jl. Antara No.59, RT.2/RW.1, Ps. Baru, Kecamatan Sawah Besar, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","Jl. Pintu Satu Senayan, Gelora, Kecamatan Tanah Abang, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","Jalan Lodan Timur No.7, RW.10, Ancol, Kec. Pademangan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta","Jalan Lodan Timur No.7, RW.10, Ancol, Kec. Pademangan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta","Jl. M.H. Thamrin No.1, RW.5, Kb. Melati, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","Gondangdia, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta","Gambir, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta"};
    int[]images= {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10};
    String[] deskripsi={"Monumen Nasional atau yang populer disingkat dengan Monas atau Tugu Monas adalah monumen peringatan setinggi 132 meter (433 kaki) yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda. Pembangunan monumen ini dimulai pada tanggal 17 Agustus 1961 di bawah perintah presiden Sukarno dan dibuka untuk umum pada tanggal 12 Juli 1975. Tugu ini dimahkotai lidah api yang dilapisi lembaran emas yang melambangkan semangat perjuangan yang menyala-nyala. Monumen Nasional terletak tepat di tengah Lapangan Medan Merdeka, Jakarta Pusat.","Kota Tua Jakarta, juga dikenal dengan sebutan Batavia Lama (Oud Batavia), adalah sebuah wilayah kecil di Jakarta, Indonesia. Wilayah khusus ini memiliki luas 1,3 kilometer persegi melintasi Jakarta Utara dan Jakarta Barat (Pinangsia, Taman Sari dan Roa Malaka).\n" +
            "\n" +
            "Dijuluki \"Permata Asia\" dan \"Ratu dari Timur\" pada abad ke-16 oleh pelayar Eropa, Jakarta Lama dianggap sebagai pusat perdagangan untuk benua Asia karena lokasinya yang strategis dan sumber daya melimpah.","Galeri Nasional Indonesia (bahasa Inggris: National Gallery of Indonesia) adalah sebuah lembaga budaya negara yang gedungnya antara lain berfungsi sebagai tempat pameran, dan perhelatan acara seni rupa Indonesia dan mancanegara.[1] Gedung ini merupakan institusi milik pemerintah di bawah Menteri Pendidikan dan Kebudayaan. [2] Kewajiban utama Galeri Nasional adalah melasanakan pengkajian, pengumpulan, registrasi, perawatan, pengamanan, pameran, kemitraan, layanan edukasi dan publikasi karya seni rupa. [2] Lalu fungsi utamanya adalah melindungi, pengembangan, dan pemanfaatan asset kesenian (seni rupa) sebagai fasilitas pendidikan dan kebudayaan.[2] Galeri Nasional beralamat di Jalan Medan Merdeka Timur No. 14 Jakarta Pusat. [1]","Galeri Antara adalah Galeri Foto Jurnalistik di indonesia dimana memperlihatlan banyak sekali hasil foto jurnalis yang berkaitan dengan cerita-cerita atau kejadian-kejadian yang ada di Negara Indonesia.","Stadion Utama Gelora Bung Karno adalah sebuah stadion serbaguna di Jakarta, Indonesia yang merupakan bagian dari kompleks olahraga Gelanggang Olahraga Bung Karno. Stadion ini umumnya digunakan sebagai arena pertandingan sepak bola tingkat internasional. Stadion ini dinamai untuk menghormati Soekarno, Presiden Republik Indonesia pertama, yang juga merupakan tokoh yang mencetuskan gagasan pembangunan kompleks olahraga ini. Dalam rangka de-Soekarnoisasi, pada masa Orde Baru, nama stadion ini diubah menjadi Stadion Utama Senayan melalui Keputusan Presiden No. 4/1984. Setelah bergulirnya gelombang reformasi pada 1998, nama Stadion ini dikembalikan kepada namanya semula melalui Surat Keputusan Presiden No. 7/2001.","Dunia Fantasi atau yang lebih populer dengan sebutan Dufan, pertama kali dibuka untuk umum pada 29 Agustus 1985 dan merupakan theme park pertama yang dikembangkan oleh Perseroan dan telah memiliki sertifikat ISO 9001:2015 sejak Februari 2017.Selain menjadi pusat hiburan outdoor, Dufan juga merupakan kawasan edutainment fisikia terbesar di Indonesia yang memanjakan pengunjung dengan Fantasi Keliling Dunia, melalui wahana permainan berteknologi tinggi, yang terbagi dalam 9 (Sembilan) kawasan yaitu Indonesia, Jakarta, Asia, Eropa, Amerika, Yunani, Hikayat, Kalila dan Fantasy Lights.Pada tahun 2013, Dufan menambah satu kawasan lagi yaitu kawasan dalam ruang (Indoor Dufan) yang dilengkapi dengan wahana Ice Age dan Kontiki & pada tahun 2014 dan tahun 2015 dufan menambahkan wahana hello kitty adventure dan Dufan Glow.Fasilitas umum untuk pengunjung : Free Drinking Water, Gratis pinjam Stroller Bayi dan Kursi Roda, Free Wifi, Charger Point, Toilet bersih disetiap kawasan dan wahana, Baby Care Room, Mushola dan Masjid, P3K dan Ambulance.","Sea World Ancol merupakan sebuah kawasan yang lengkap untuk memberikan hiburan dan pendidikan khususnya dunia laut. Dalam operasionalnya, Sea World Ancol mengemban 3 misi besar yaitu: Pendidikan, Konservasi dan Hiburan. Melalui misi ini Sea World Ancol menempatkan diri sebagai tempat hiburan berkualitas. Dalam usaha memperkenalkan kehidupan biota yang hidup di alam, SeaWorld Ancol memiliki sekitar 7.300 ekor biota air tawar yang terdiri dari 48 Jenis ikan, 1 jenis reptil sampai biota perairan laut yang terdiri dari 11.500 ekor biota yang terdiri dari 138 jenis ikan dan avertebrata serta 3 jenis reptil. Biota-biota tersebut ditampilkan dalam 28 display yang terbagi atas 9 akuarium perairan tawar dan 19 akuarium serta 4 kolam terbuka.Setiap tampilan akuarium atau wahana memiliki tema khusus untuk memberikan nuansa tersendiri dalam pesan yang disampaikannya, selain itu untuk menambah pengetahuan mengenai biota yang ditampilkan maka dilengkapi juga dengan label berisi informasi mengenai biota baik secara biologis maupun keunikannya.Berbagai macam acara dan fasilitas penunjang lainnyapun kami hadirkan untuk kenyamanan dan kepuasan pengunjung seperti aksi seru 2 penyelam saat Feeding show di akuarium utama, uniknya duyung menyantap rumput laut dari tangan penyelam sampai keganasan belut kerondong berebut makanannya. Bagi mereka yang ingin berinteraksi dengan biota laut terdapat juga Kolam Sentuh dan mereka ingin bertemu hewan laut dalam maka fasilitas museum yang berisi awetan hewan-hewan laut dalam menunggu disana, seperti Ikan Purba – Raja Laut (Coelacanth).Sea World Ancol senantiasa akan menghadirkan edukasi terkini mengenai dunia air pada umumnya dan kelautan khususnya dengan berbagai biota yang dihadirkan maupun inovasi dalam tampilannya sehingga menjadi yang terdepan di Indonesia.","Grand Indonesia merupakan mal di Jakarta. Mal ini dibuka pada tahun 2007 oleh Presiden Susilo Bambang Yudhoyono.\n" +
            "\n" +
            "Pada tahun 2007 Hotel Indonesia mengalami pemugaran. Selanjutnya setelah dibuka kembali, hotel dikelola oleh grup Kempinski dan namanya diganti menjadi Hotel Indonesia-Kempinski. Setelah mengalami renovasi selama 5 tahun, tanggal 20 Mei 2009 Hotel Indonesia Kempinski dibuka kembali oleh Presiden RI Susilo Bambang Yudhoyono.","Bundaran HI adalah sebuah stasiun BRT Transjakarta yang terletak di Jalan M.H. Thamrin, Gondangdia, Menteng, Jakarta Pusat. Stasiun BRT ini berada di Koridor 1 yang membentang dari utara ke selatan. Nama stasiun BRT ini berasal dari Bundaran Hotel Indonesia yang terletak tidak jauh dari stasiun BRT. Halte ini sempat ditutup untuk keperluan pembangunan MRT Jakarta pada 6 Januari 2014. Namun, sejak 24 Maret 2019, halte ini sudah kembali beroperasi dan terintegrasi dengan Stasiun MRT Bundaran HI yang terletak tepat dibawah halte ini.","Perpustakaan Nasional Republik Indonesia (Perpusnas) adalah Lembaga Pemerintah Nonkementerian yang melaksanakan tugas pemerintahan dalam bidang perpustakaan yang berfungsi sebagai perpustakaan pembina, perpustakaan rujukan, perpustakaan deposit, perpustakaan penelitian, perpustakaan pelestarian, dan pusat jejaring perpustakaan, serta berkedudukan di ibu kota negara. Gedung Fasilitas Layanan Perpustakaan Nasional berlokasi di Jalan Medan Merdeka Selatan No.11, Jakarta dan sebagian besar perkantorannya di Jalan Salemba Raya No. 28A. Perpustakaan Nasional berada di bawah dan bertanggung jawab kepada Presiden. Pada tanggal 14 September 2017, Presiden Joko Widodo meresmikan Gedung Fasilitas Layanan Perpusnas baru yang merupakan perpustakaan nasional tertinggi di dunia (126,3 meter) dengan 27 lantai, termasuk tiga lantai parkir bawah tanah (basement).[1]"};
    public CustomAdapter (Context ctx){
        this.c=ctx;
    }
    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public Object getItem(int pos) {
        return nama[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertview, ViewGroup viewGroup) {
        if (convertview==null){
            LayoutInflater inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview=inflater.inflate(R.layout.wisata,null);
        }
        //get view
        TextView namatxt=(TextView) convertview.findViewById(R.id.nama);
        TextView alamattxt=(TextView) convertview.findViewById(R.id.alamat);
        ImageView img=(ImageView) convertview.findViewById(R.id.imgid);
        TextView deskripsitxt=(TextView) convertview.findViewById(R.id.deskripsi);
        //set data
        namatxt.setText(nama[pos]);
        alamattxt.setText(alamat[pos]);
        img.setImageResource(images[pos]);
        deskripsitxt.setText(deskripsi[pos]);

        return convertview;
    }
}
