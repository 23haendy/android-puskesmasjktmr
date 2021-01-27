package com.example.myapplication2;

import java.util.ArrayList;

public class PuskesmasData {
    private static String[] puskesmasNames = {
            "Puskesmas kecamatan PuloGadung",
            "Puskesmas kecamatan Gambir",
            "Puskesmas kecamatan Senen",
            "Puskesmas kecamatan Cilandak",
            "Puskesmas kecamatan Kebon Jeruk",
            "Puskesmas kecamatan Kalideres",
            "Puskesmas kecamatan Cipayung",
            "Puskesmas kecamatan Grogol Petamburan",
            "Puskesmas kecamatan Kebayoran Lama",
            "Puskesmas kecamatan Kebayoran Baru"
    };
    private static String[] puskesmasDetails = {
            "alamat Jalan Kayu Putih Selatan III No.2B, RT.8/RW.5, Pulo Gadung, RT.8/RW.5, Pulo Gadung, Kec. Pulo Gadung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13260 ",
            "alamat Jl. Cideng Timur I No.13 & 15, RT.6/RW.6, Petojo Utara, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10130",
            "alamat Jalan Kramat VII No. 31, RT.06 / RW.01, Kenari, Senen, RT.2/RW.1, RT.6/RW.1, Kenari, Kec. Senen, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10430",
            "alamat Jl. Komplek BNI 46 No.57, Cilandak Barat, Cilandak, RT.4/RW.5, Cilandak Barat, RT.4/RW.5, Cilandak Bar., Kec. Cilandak, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12430",
            "alamat Jalan Raya Kebon Jeruk No.2, RT.9/RW.1, Kebon Jeruk, RT.9/RW.1, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11510",
            "alamat Jl. Tj. Pura No.14 RT 06/05, RW.5, Pegadungan, Kec. Kalideres, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11830",
            "alamat Jl. Bambu Hitam No.104, RT.4/RW.4, Cipayung, Kec. Cipayung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13840",
            "alamat Jl. Wijaya 1 (Taman Duta Mas) Jl. Wijaya III No.14, RT.9/RW.9, Wijaya Kusuma, Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11460",
            "alamat Jl. Ciputat Raya No.3B, RT.9/RW.8, Kby. Lama Utara, Kec. Kby. Lama, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12240",
            "alamat Jl. Iskandarsyah Raya No.105, RT.5/RW.5, Melawai, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12160"

    };
    private static int[] puskesmasImages = {
            R.drawable.puskesmas_pulogadung,
            R.drawable.puskesmas_gambir,
            R.drawable.puskesmas_senen,
            R.drawable.puskesmas_cilandak,
            R.drawable.puskesmas_kebon_jeruk,
            R.drawable.puskesmas_kalideres,
            R.drawable.puskesmas_cipayung,
            R.drawable.puskesmas_grogol_petamburan,
            R.drawable.puskesmas_kebayoranlama,
            R.drawable.puskesmas_kebayoranbaru

    };
    static ArrayList<Puskesmas>getListData(){
        ArrayList<Puskesmas> list = new ArrayList<>();
        for (int position = 0; position <puskesmasNames.length; position++){
            Puskesmas puskesmas = new Puskesmas();
            puskesmas.setName(puskesmasNames[position]);
            puskesmas.setDetail(puskesmasDetails[position]);
            puskesmas.setPhoto(puskesmasImages[position]);
            list.add(puskesmas);
        }
        return list;
    }

}
