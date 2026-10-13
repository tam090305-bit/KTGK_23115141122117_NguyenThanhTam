package com.example.ktgk_23115141122117_nguyenthanhtam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChiTietChiTieuActivity : AppCompatActivity() {

    private lateinit var tvTen_117: TextView
    private lateinit var tvSoTien_117: TextView
    private lateinit var tvGhiChu_117: TextView
    private lateinit var btnQuayLai_117: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chi_tiet_chi_tieu)

        supportActionBar?.title = "Nguyen Thanh Tam - 23115141122117 - Chi Tiết Khoản Chi"

        tvTen_117 = findViewById(R.id.tvTenKhoanChi_117)
        tvSoTien_117 = findViewById(R.id.tvSoTien_117)
        tvGhiChu_117 = findViewById(R.id.tvGhiChu_117)
        btnQuayLai_117 = findViewById(R.id.btnQuayLai_117)

        nhanVaHienThiDuLieu_117()

        btnQuayLai_117.setOnClickListener {
            finish() // Quay lại màn hình chính
        }
    }

    private fun nhanVaHienThiDuLieu_117() {
        val ten_117 = intent.getStringExtra("EXTRA_TEN_117")
        val soTien_117 = intent.getStringExtra("EXTRA_SO_TIEN_117")
        val ghiChu_117 = intent.getStringExtra("EXTRA_GHI_CHU_117")

        tvTen_117.text = "Tên khoản chi: $ten_117"
        tvSoTien_117.text = "Số tiền: $soTien_117"
        tvGhiChu_117.text = "Ghi chú: $ghiChu_117"
    }
}