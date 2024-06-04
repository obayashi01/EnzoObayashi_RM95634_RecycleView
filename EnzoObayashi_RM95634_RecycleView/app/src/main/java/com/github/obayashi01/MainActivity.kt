package com.github.obayashi01

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        val itemsAdapter = PraiaAdapter()

        recyclerView.adapter = itemsAdapter

        val button = findViewById<Button>(R.id.button)
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val editTextEstado = findViewById<EditText>(R.id.editTextEstado)
        val editTextCidade = findViewById<EditText>(R.id.editTextCidade)


        button.setOnClickListener {
            val praia = PraiaModel(
                nome = editTextNome.text.toString(),
                cidade = editTextCidade.text.toString(),
                estado = editTextEstado.text.toString()
            )


            itemsAdapter.addPraia(praia)

        }

    }
}
