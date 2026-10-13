package com.example.ktgk_23115141122117_nguyenthanhtam

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ChinhSuaChiTieuActivity : AppCompatActivity() {

    private lateinit var edtTen_117: EditText
    private lateinit var edtSoTien_117: EditText
    private lateinit var edtGhiChu_117: EditText
    private lateinit var btnLuu_117: Button
    private lateinit var btnHuy_117: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chinh_sua_chi_tieu)

        supportActionBar?.title = "Nguyen Thanh Tam - 23115141122117 - Chỉnh Sửa"

        edtTen_117 = findViewById(R.id.edtTenKhoanChiSua_117)
        edtSoTien_117 = findViewById(R.id.edtSoTienSua_117)
        edtGhiChu_117 = findViewById(R.id.edtGhiChu_117)
        btnLuu_117 = findViewById(R.id.btnLuu_117)
        btnHuy_117 = findViewById(R.id.btnHuy_117)

        // Nhận dữ liệu cũ hiển thị sẵn
        val tenCu_117 = intent.getStringExtra("EXTRA_TEN_CU_117")
        val soTienCu_117 = intent.getStringExtra("EXTRA_SOTIEN_CU_117")
        val ghiChuCu_117 = intent.getStringExtra("EXTRA_GHICHU_CU_117")

        edtTen_117.setText(tenCu_117)
        edtSoTien_117.setText(soTienCu_117)
        edtGhiChu_117.setText(ghiChuCu_117)

        btnLuu_117.setOnClickListener {
            val intentKetQua_117 = Intent().apply {
                putExtra("EXTRA_TEN_MOI_117", edtTen_117.text.toString().trim())
                putExtra("EXTRA_SOTIEN_MOI_117", edtSoTien_117.text.toString().trim())
                putExtra("EXTRA_GHICHU_MOI_117", edtGhiChu_117.text.toString().trim())
            }
            setResult(Activity.RESULT_OK, intentKetQua_117)
            finish()
        }

        btnHuy_117.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}