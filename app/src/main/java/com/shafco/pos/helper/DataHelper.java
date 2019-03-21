package com.shafco.pos.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "pos.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_R_PRODUK = "r_produk";
    private static final String COLUMN_KODE_PRODUK = "kdproduk";
    private static final String COLUMN_NAMA_PRODUK = "nmproduk";
    private static final String COLUMN_HPJ = "hpj";
    private static final String COLUMN_R_PRODUK_ID = "r_produk_id";


    private static final String TABLE_T_TRANSPOS = "t_transpos";
    private static final String COLUMN_T_TRANSPOS_ID = "t_transpos_id";
    private static final String COLUMN_NOTRANS = "notrans";
    private static final String COLUMN_TANGGAL = "tanggal";
    private static final String COLUMN_TOTAL_TRANS = "total_trans";
    private static final String COLUMN_NO_FAKTUR_PAJAK = "nofaktur_pajak";
    private static final String COLUMN_R_TIPEDOKUMEN_ID= "r_tipedokumen_id";
    private static final String COLUMN_KDSTASTUSDOKUMEN= "kdstatusdokumen";
    private static final String COLUMN_R_ORGANISASI_ID= "r_organisasi_id";
    private static final String COLUMN_IS_UPLOAD= "is_upload";
    private static final String COLUMN_JAM= "jam";


    private static final String TABLE_T_TRANSPOS_DETAIL = "t_transpos_detail";
    private static final String COLUMN_T_TRANSPOS_DETAIL_ID = "t_transpos_detail_id";
    private static final String COLUMN_NOTRANS_DETAIL = "notrans";
    private static final String COLUMN_KDPRODUK = "kdproduk";
    private static final String COLUMN_QTY = "qty";
    private static final String COLUMN_HARGA = "harga";
    private static final String COLUMN_PRSN_DISC = "prsn_disc";
    private static final String COLUMN_NOMINAL_DISC = "nominal_disc";
    private static final String COLUMN_NETTO = "netto";
    private static final String COLUMN_PPN = "ppn";
    private static final String COLUMN_R_PRODUK_ID_TRANPOS_DETAIL = "r_produk_id";
    private static final String COLUMN_M_KATEGORI_DISC_ID = "m_kategori_disc_id";



    private static final String TABLE_T_BAYAR_POS = "t_bayarpos";
    private static final String COLUMN_NOTRANS_BAYAR_POS = "notrans";
    private static final String COLUMN_NOTRANS_BAYAR_POS_id= "t_bayar_pos_id";
    private static final String COLUMN_KODE_BAYAR_POS = "kode_cara_bayar";
    private static final String COLUMN_M_EDC_ID = "m_edc_id";
    private static final String COLUMN_NOMINAL_BAYAR = "nominal_bayar";
    private static final String COLUMN_BAYAR = "bayar";



    private static final String TABLE_M_CARABAYAR = "m_carabayar";
    private static final String COLUMN_CARABAYAR_ID= "kode_cara_bayar_id";
    private static final String COLUMN_CARABAYAR = "kode_cara_bayar";
    private static final String COLUMN_NAMA_CARABAYAR = "nama_cara_bayar";
    private static final String COLUMN_ISEDC = "isedc";



    private static final String TABLE_M_EDC = "m_edc";
    private static final String COLUMN_NAMAMERCHAND = "nama_merchand";
    private static final String COLUMN_NAMAMERCHAND_id = "m_edc_id";
    private static final String COLUMN_TIPEBANK = "tipe_bank";
    private static final String COLUMN_R_ORGANISASI_ID_EDC = "r_organisasi_id";

    private static final String db_create_tbl_r_produk = "create table "
            + TABLE_R_PRODUK + "("
            + COLUMN_R_PRODUK_ID + " integer primary key autoincrement, "
            + COLUMN_KODE_PRODUK + " varchar(20) , "
            + COLUMN_HPJ + " integer,"
            + COLUMN_NAMA_PRODUK + " varchar(100))";

    private static final String db_create_tbl_t_transpos = "create table "
            + TABLE_T_TRANSPOS + "("
            + COLUMN_T_TRANSPOS_ID + " integer primary key autoincrement, "
            + COLUMN_NOTRANS + " varchar(30) , "
            + COLUMN_TANGGAL + " date,"
            + COLUMN_TOTAL_TRANS + " integer,"
            + COLUMN_NO_FAKTUR_PAJAK + " varchar(30) , "
            + COLUMN_R_TIPEDOKUMEN_ID + " integer , "
            + COLUMN_KDSTASTUSDOKUMEN + " varchar(5) , "
            + COLUMN_R_ORGANISASI_ID + " integer,"
            + COLUMN_IS_UPLOAD + " integer,"
            + COLUMN_JAM + " time)";

    private static final String db_create_tbl_t_transpos_detail = "create table "
            + TABLE_T_TRANSPOS_DETAIL + "("
            + COLUMN_T_TRANSPOS_DETAIL_ID + " integer primary key autoincrement, "
            + COLUMN_NOTRANS_DETAIL + " varchar(30) , "
            + COLUMN_KDPRODUK + " varchar(30) , "
            + COLUMN_QTY + " integer,"
            + COLUMN_HARGA + " integer,"
            + COLUMN_PRSN_DISC + " double , "
            + COLUMN_NOMINAL_DISC + " integer , "
            + COLUMN_NETTO + " integer , "
            + COLUMN_PPN + " double , "
            + COLUMN_R_PRODUK_ID_TRANPOS_DETAIL + " integer,"
            + COLUMN_M_KATEGORI_DISC_ID + " integer)";

    private static final String db_create_tbl_t_transpos_bayar = "create table "
            + TABLE_T_BAYAR_POS + "("
            + COLUMN_NOTRANS_BAYAR_POS_id + " integer primary key autoincrement, "
            + COLUMN_NOTRANS_BAYAR_POS + " varchar(30) , "
            + COLUMN_KODE_BAYAR_POS + " varchar(30) , "
            + COLUMN_M_EDC_ID + " integer,"
            + COLUMN_NOMINAL_BAYAR + " integer,"
            + COLUMN_BAYAR + " integer)";


    private static final  String db_create_tbl_m_carabyar = "create table "
            + TABLE_M_CARABAYAR + "("
            + COLUMN_CARABAYAR_ID + "integer primary key autoincrement, "
            + COLUMN_CARABAYAR + " varchar(20) , "
            + COLUMN_NAMA_CARABAYAR + "  varchar(20),"
            + COLUMN_ISEDC + " varchar(100))";

    private  String db_create_tbl_m_edc = "create table "
            + TABLE_M_EDC + "("
            + COLUMN_NAMAMERCHAND_id + "integer primary key autoincrement, "
            + COLUMN_NAMAMERCHAND + " varchar(20) , "
            + COLUMN_TIPEBANK + "  varchar(50),"
            + COLUMN_R_ORGANISASI_ID_EDC + " integer)";
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub s
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(db_create_tbl_r_produk);
        db.execSQL(db_create_tbl_t_transpos);
        db.execSQL(db_create_tbl_t_transpos_detail);
        db.execSQL(db_create_tbl_t_transpos_bayar);
        db.execSQL(db_create_tbl_m_carabyar);
        db.execSQL(db_create_tbl_m_edc);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
