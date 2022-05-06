package br.com.devtvas.bankline.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.devtvas.bankline.databinding.ActivityWelcomeBinding
import br.com.devtvas.bankline.domain.Correntista
import br.com.devtvas.bankline.ui.statement.BankStatementActivity

class WelcomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btContinue.setOnClickListener{
            val accountHolderId = binding.etAccountHolderId.text.toString().toInt()
            var accountHolder = Correntista(accountHolderId)

            val intent = Intent(this, BankStatementActivity::class.java).apply {
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
            }
            startActivity(intent)
        }
    }
}