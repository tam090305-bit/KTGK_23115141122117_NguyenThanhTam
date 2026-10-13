package com.example.ktgk_23115141122117_nguyenthanhtam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtTenKhoanChi_117: EditText
    private lateinit var edtSoTien_117: EditText
    private lateinit var edtGhiChu_117: EditText
    private lateinit var btnThem_117: Button
    private lateinit var btnXemChiTiet_117: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.title = "Nguyen Thanh Tam - 23115141122117 - Quản lý chi tiêu cá nhân"


        khoiTaoGiaoDien_117()


        btnThem_117.setOnClickListener {
            kiemTraVaThemKhoanChi_117()
        }


        btnXemChiTiet_117.setOnClickListener {
            moManHinhChiTiet_117()
        }
    }

    private fun khoiTaoGiaoDien_117() {
        edtTenKhoanChi_117 = findViewById(R.id.edtTenKhoanChi_117)
        edtSoTien_117 = findViewById(R.id.edtSoTien_117)
        edtGhiChu_117 = findViewById(R.id.edtGhiChu_117)
        btnThem_117 = findViewById(R.id.btnThem_117)
        btnXemChiTiet_117 = findViewById(R.id.btnXemChiTiet_117)
    }

    private fun kiemTraVaThemKhoanChi_117() {
        val tenKhoanChi_117 = edtTenKhoanChi_117.text.toString().trim()
        val soTienStr_117 = edtSoTien_117.text.toString().trim()

        // Kiểm tra dữ liệu rỗng hoặc không hợp lệ
        if (tenKhoanChi_117.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên khoản chi!", Toast.LENGTH_SHORT).show()
            return
        }

        if (soTienStr_117.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập số tiền!", Toast.LENGTH_SHORT).show()
            return
        }

        val soTien_117 = soTienStr_117.toDoubleOrNull()
        if (soTien_117 == null || soTien_117 <= 0) {
            Toast.makeText(this, "Số tiền phải lớn hơn 0!", Toast.LENGTH_SHORT).show()
            return
        }

        // Thông báo thêm thành công
        Toast.makeText(this, "Thêm khoản chi thành công!", Toast.LENGTH_SHORT).show()
    }

    private fun moManHinhChiTiet_117() {
        val intent_117 = Intent(this, MainActivity::class.java)
        startActivity(intent_117)
    }
}