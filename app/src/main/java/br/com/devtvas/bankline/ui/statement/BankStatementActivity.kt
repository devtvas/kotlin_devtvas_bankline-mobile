package br.com.devtvas.bankline.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.devtvas.bankline.R
import br.com.devtvas.bankline.databinding.ActivityBankStatementBinding
import br.com.devtvas.bankline.domain.Correntista
import br.com.devtvas.bankline.domain.Movimentacao
import br.com.devtvas.bankline.domain.TipoMovimentacao
import java.lang.IllegalArgumentException

class BankStatementActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ACCOUNT_HOLDER = "br.com.devtvas.bankline.ui.statement.EXTRA_ACCOUNT_HOLDER"
    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER) ?: throw IllegalArgumentException()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvBankStatement.layoutManager = LinearLayoutManager(this)
//        Log.d("TESTE", "Chegou o Id: ${accountHolder.id}")
        finfBankStatement()
    }
// dados mockados
    private fun finfBankStatement() {
        val dataSet = ArrayList<Movimentacao>()
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.RECEITA,1))
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.DESPESA,1))
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.RECEITA,1))
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.DESPESA,1))
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.RECEITA,1))
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.RECEITA,1))
        dataSet.add(Movimentacao(1,"03/05/2022","Lorem Ipsum",  1000.0,TipoMovimentacao.RECEITA,1))
        binding.rvBankStatement.adapter = BankStatementAdapter(dataSet)
    }
}