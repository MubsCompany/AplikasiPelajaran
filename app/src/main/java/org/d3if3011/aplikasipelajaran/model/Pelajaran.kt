package org.d3if3011.aplikasipelajaran.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Pelajaran (
    @StringRes val namaPelajaranRes: Int,
    @StringRes val namaDosenRes: Int,
    @StringRes val kelasRes: Int,
    @DrawableRes val imageRes: Int
)