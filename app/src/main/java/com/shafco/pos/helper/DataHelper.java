package com.shafco.pos.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "pos.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_R_PRODUK = "r_produk";
    public static final String COLUMN_KODE_PRODUK = "kdproduk";
    public static final String COLUMN_NAMA_PRODUK = "nmproduk";
    public static final String COLUMN_HPJ = "hpj";
    public static final String COLUMN_R_PRODUK_ID = "r_produk_id";

    public static final String TABLE_T_TRANSPOS = "t_transpos";
    public static final String COLUMN_NOTRANS = "notrans";
    public static final String COLUMN_TANGGAL = "tanggal";
    public static final String COLUMN_TOTAL_TRANS = "total_trans";
    public static final String COLUMN_NO_FAKTUR_PAJAK = "nofaktur_pajak";
    public static final String COLUMN_R_TIPEDOKUMEN_ID= "r_tipedokumen_id";
    public static final String COLUMN_KDSTASTUSDOKUMEN= "kdstatusdokumen";
    public static final String COLUMN_R_ORGANISASI_ID= "r_organisasi_id";
    public static final String COLUMN_JAM= "jam";

    public static final String TABLE_T_TRANSPOS_DETAIL = "t_transpos_detail";
    public static final String COLUMN_NOTRANS_DETAIL = "notrans";
    public static final String COLUMN_KDPRODUK = "kdproduk";
    public static final String COLUMN_QTY = "qty";
    public static final String COLUMN_HARGA = "harga";
    public static final String COLUMN_PRSN_DISC = "prsn_disc";
    public static final String COLUMN_NOMINAL_DISC = "nominal_disc";
    public static final String COLUMN_NETTO = "netto";
    public static final String COLUMN_PPN = "ppn";
    public static final String COLUMN_R_PRODUK_ID_TRANPOS_DETAIL = "r_produk_id";
    public static final String COLUMN_M_KATEGORI_DISC_ID = "m_kategori_disc_id";




    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub s
    }
    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
