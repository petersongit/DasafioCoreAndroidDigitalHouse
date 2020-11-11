package com.example.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeActivity : AppCompatActivity(){
    lateinit var  listPratos: ArrayList<Prato>
    lateinit var adapter: PratosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_teste)

        listPratos = getAllPratos()
        adapter = PratosAdapter(listPratos)

        val rvPratos: RecyclerView = findViewById(R.id.rc_lista_pratos)

        rvPratos.adapter = adapter
        rvPratos.layoutManager = LinearLayoutManager(this)
        rvPratos.setHasFixedSize(true)

       // val tvNome: TextView = itemView.findViewById(R.id.tvNomeRestaurante)


        }


    fun getAllPratos():ArrayList<Prato> {
        val p1 = Prato(
            R.drawable.prato1,
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianapolis, São Paulo",
            "Fecha as 22:00"
        )
        val p2 = Prato(
            R.drawable.prato3,
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "Fecha as 00:00"
        )
        val p3 = Prato(
            R.drawable.prato4,
            "Outback - Moema",
            "Av. Moaci, 187 - Moema, São Paulo",
            "Fecha as 00:00"
        )
        val p4 =
            Prato(R.drawable.prato2, "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "Fecha as 01:00")

        val listaPratos = arrayListOf<Prato>(p1, p2, p3, p4)

        return listaPratos

    }


}